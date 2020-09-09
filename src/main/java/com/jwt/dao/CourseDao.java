package com.jwt.dao;

import java.util.List;

import com.jwt.model.CourseDetail;
import com.jwt.vo.CourseSearchVo;

public interface CourseDao {
	List<CourseDetail> getAllCourses();

	CourseDetail getCourseById(int courseId);

	List<CourseDetail> getCoursesBySearch(CourseSearchVo searchVo);

}
