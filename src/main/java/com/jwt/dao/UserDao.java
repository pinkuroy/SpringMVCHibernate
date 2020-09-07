package com.jwt.dao;

import com.jwt.model.User;
import com.jwt.vo.UserVo;

public interface UserDao
{
	User validateUser(UserVo user);
}
