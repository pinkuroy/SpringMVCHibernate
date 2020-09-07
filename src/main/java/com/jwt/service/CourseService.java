package com.jwt.service;

import java.util.List;

import com.jwt.model.CourseDetail;
import com.jwt.vo.CourseDetailVo;

public interface CourseService
{
	List<CourseDetailVo> getAllCourses();

	CourseDetail getCourseById(int id);
}
