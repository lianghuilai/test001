package cn.lexed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lexed.mapper.UsersMapper;
import cn.lexed.pojo.Users;
import cn.lexed.service.UsersService;

/**
* @ClassName: UsersServiceImpl
* @Description: 
* @author 大来老师
* @date 2021年8月5日
* @version V1.0 
*/
@Service
@Transactional
public class UsersServiceImpl implements UsersService{

	  @Autowired
	  private UsersMapper usersMapper;
	
	@Override
	public boolean insertUser(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.insertUser(users);
	}

	@Override
	public List<Users> selectUsersAll() {
		// TODO Auto-generated method stub
		return usersMapper.selectUsersAll();
	}

	
	
	@Override
	public Users selectUsersById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public boolean updateUser(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	@Override
	public boolean deleteUsersById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
