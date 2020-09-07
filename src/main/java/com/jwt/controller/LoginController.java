package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.service.CourseService;
import com.jwt.service.UserService;
import com.jwt.vo.CourseDetailVo;
import com.jwt.vo.LoginUiVo;
import com.jwt.vo.UserVo;

@Controller
public class LoginController
{

	@Autowired
	private UserService userSvc;

	@Autowired
	private CourseService courseSvc;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException
	{
		LoginUiVo user = new LoginUiVo();
		model.addObject("login", user);
		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = "/myLogin", method = RequestMethod.GET)
	public ModelAndView printHello(ModelAndView model)
	{
		LoginUiVo user = new LoginUiVo();
		model.addObject("login", user);
		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView userLogin(@ModelAttribute LoginUiVo user)
	{
		System.out.println("call to login form...");
		UserVo userData = userSvc.userLogin(user);
		ModelAndView model = new ModelAndView();

		if (userData != null)
		{
			model.addObject("firstname", userData.getUsername());
			model.addObject("valid", "Actual user");
			if ("L".equalsIgnoreCase(userData.getUserType()))
			{
				List<CourseDetailVo> courseList = courseSvc.getAllCourses();
				model.addObject("courseList", courseList);
				model.setViewName("learningConsultantHome");
			} else if ("ST".equalsIgnoreCase(userData.getUserType()))
			{
				model.setViewName("solutionTeamHome");
			}
		} else
		{
			LoginUiVo loginUser = new LoginUiVo();
			loginUser.setMessage("Invalid user. Please try again!");
			model.addObject("login", loginUser);
			model.setViewName("login");
		}
		return model;
	}
}
