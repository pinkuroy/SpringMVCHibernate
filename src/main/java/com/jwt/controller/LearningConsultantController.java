package com.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.service.CourseService;
import com.jwt.vo.CourseDetailVo;
import com.jwt.vo.CourseSearchForm;

@Controller
public class LearningConsultantController
{

	@Autowired
	private CourseService courseSvc;

	@RequestMapping(value = "/getAllCourses", method = RequestMethod.GET)
	public ModelAndView getAllCourses(ModelAndView model)
	{
		List<CourseDetailVo> courseList = courseSvc.getAllCourses();
		model.addObject("courseList", courseList);
		model.setViewName("learningConsultantHome");
		return model;
	}

	@RequestMapping(value = "/searchCourseProcess", method = RequestMethod.POST)
	public ModelAndView searchCourseProcess(
			@ModelAttribute CourseSearchForm cSearch)
	{
		ModelAndView model = new ModelAndView();
		if (null != cSearch)
		{
			model.addObject("courseSearchForm", cSearch);
			model.setViewName("learningConsultantHome");
		}
		return model;
	}
}
