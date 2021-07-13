package com.phoenix.services;

import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImp;
import com.phoenix.data.User;
import com.phoenix.exceptions.ServiceException;
import com.phoenix.exceptions.UserAlreadyExistException;
import com.phoenix.exceptions.UserNotFoundException;

//author:raja.kumar@stltech.in
public class LoginServiceImpl implements LoginService {
    private LoginDao loginDao;
	
    public LoginServiceImpl()
    {
    	loginDao =new LoginDaoImp();
    	
    }
    
	@Override
	public List<User> getAllUser() throws ServiceException {
		return loginDao.getAllUser();
		
	}

	@Override
	public User findByUserId(String username) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
		User user= loginDao.getUserById(username);
		if(user!=null)
			return user;
		else
			throw new UserNotFoundException("Not found");
	}

	@Override
	public void add(User user) throws UserAlreadyExistException {
		loginDao.insert(user);
		
	}

	@Override
	public void edit(User user) throws ServiceException {
		loginDao.update(user);
		
	}

	@Override
	public void remove(User user) throws ServiceException {
		// TODO Auto-generated method stub
		
		loginDao.delete(user);
	}

	@Override
	public String changePassword(String password) throws ServiceException {
		// TODO Auto-generated method stub
		User user=new User();
		user.setPassword(password);
		loginDao.update(user);
		return "Password is updated successfully....!";
		
		
	}

}
