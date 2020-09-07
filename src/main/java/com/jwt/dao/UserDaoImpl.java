package com.jwt.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.User;
import com.jwt.vo.UserVo;

@Repository
public class UserDaoImpl implements UserDao
{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User validateUser(UserVo user)
	{
		User loggedinUser = (User) sessionFactory.getCurrentSession()
				.createQuery(
						"FROM User U WHERE U.username = :userName and U.password = :password")
				.setParameter("userName", user.getUsername())
				.setParameter("password", user.getPassword()).uniqueResult();
		return loggedinUser;
	}

}
