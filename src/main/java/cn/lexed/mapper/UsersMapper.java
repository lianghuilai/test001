package cn.lexed.mapper;

import java.util.List;

import cn.lexed.pojo.Users;

/**
* @ClassName: UserMapper
* @Description: 
* @author 大来老师
* @date 2021年8月5日
* @version V1.0 
*/
public interface UsersMapper {
    
	 //添加
	 public abstract boolean insertUser(Users users);
	 //查询所有
	 List<Users> selectUsersAll();
	 
	 //根据id查询
	 Users selectUsersById(Integer id);
	 //修改
	 boolean updateUser(Users users);
	 //删除
	 boolean deleteUsersById(Integer id);
}
