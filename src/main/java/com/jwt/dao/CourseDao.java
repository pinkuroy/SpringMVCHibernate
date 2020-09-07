package com.jwt.dao;

import java.util.List;

import com.jwt.model.CourseDetail;

public interface CourseDao
{
	List<CourseDetail> getAllCourses();

	CourseDetail getCourseById(int courseId);
}
