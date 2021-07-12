package com.ch.project.dao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.project.model.Login;
import com.ch.project.model.Users;
import com.ch.project.model.UsersImgs;

@Repository
public class IUsersDaoImpl implements IUsersDao{
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public void register(Users user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int isDuplicateEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int isDuplicated(String id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Users login(Login login) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyInfo(Users users) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsersImgs getProfile(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUsersImg(UsersImgs file) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users inquiryOfUserById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users inquiryOfUserNo(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUsersImg(int userNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPw(Users user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawal() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
