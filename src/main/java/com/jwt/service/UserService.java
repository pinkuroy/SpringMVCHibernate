package com.jwt.service;

import com.jwt.vo.LoginUiVo;
import com.jwt.vo.UserVo;

public interface UserService
{
	UserVo userLogin(LoginUiVo user);
}
