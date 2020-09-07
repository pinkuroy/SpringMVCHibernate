package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.UserDao;
import com.jwt.model.User;
import com.jwt.vo.LoginUiVo;
import com.jwt.vo.UserVo;

@Service
@Transactional
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserDao userDao;

	@Override
	public UserVo userLogin(LoginUiVo user)
	{
		boolean validUser = false;
		User loggedInUser = null;
		UserVo userObj = null;
		if (user != null)
		{
			userObj = new UserVo();
			userObj.setUsername(user.getUsername());
			userObj.setPassword(user.getPassword());

			loggedInUser = userDao.validateUser(userObj);
			if (loggedInUser != null && loggedInUser.getId() > 0)
			{
				userObj.setUserType(loggedInUser.getUsertype());
			}
		}
		return userObj;
	}

}
