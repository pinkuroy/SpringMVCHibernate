package com.jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.vo.LoginUiVo;

@Controller
public class LearningConsultantController
{
	@RequestMapping(value = "/getAllCourses", method = RequestMethod.GET)
	public ModelAndView printHello(ModelAndView model)
	{
		LoginUiVo user = new LoginUiVo();
		model.addObject("login", user);
		model.setViewName("login");
		return model;
	}
}
