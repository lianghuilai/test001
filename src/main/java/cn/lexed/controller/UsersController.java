package cn.lexed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lexed.pojo.Users;
import cn.lexed.service.UsersService;

/**
* @ClassName: UsersController
* @Description: 
* @author 大来老师
* @date 2021年8月5日
* @version V1.0 
*/
@Controller
@RequestMapping("/users")
public class UsersController {

	   
	     @Autowired
	     private UsersService usersService;
	
	     //查询全部用户
	     @RequestMapping("/findUserAll")
	     public String findUserAll(Model model){
	    	 
	         List<Users> list=this.usersService.selectUsersAll();
	         //添加到model
	         model.addAttribute("list",list);
	    	 return "showUsers";
	     }
	     
	     
	     @RequestMapping("/addusers")
	     public String doAddUser(Model model){
	    	 return "adduser";
	     }
	     
	     //添加
	    /* @RequestMapping("/toaddUser")
	     public String toaddUser(Users users){
	    	 if(usersService.insertUser(users)){
	    		 return "redirect:/users/findUserAll";
	    	 }else{
	    		 return "redirect:/users/addusers";
	    	 }
	     }
	     */
	     
	     //ajax
	     @RequestMapping("/toaddUser")
	     @ResponseBody
	     public String toaddUser(Users users){
	    	 String results="{\"results\":\"error\"}";  //{\"name\":\"qwe\"}
	    	 boolean bb=usersService.insertUser(users);
	    	 if(bb){
	    		 results="{\"results\":\"success\"}";
	    		 return results;
	    	 }
	    	 return results;
	     }
	     
	     
	     
	     
	     //删除
	     
	     
	     
	     //修改
	
}
