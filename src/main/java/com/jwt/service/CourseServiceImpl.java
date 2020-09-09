package com.jwt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.CourseDao;
import com.jwt.model.CourseDetail;
import com.jwt.vo.CourseDetailVo;
import com.jwt.vo.CourseSearchVo;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao courseDao;

	@Override
	public List<CourseDetailVo> getAllCourses() {
		List<CourseDetailVo> courseDtlVoList = null;
		List<CourseDetail> courseList = courseDao.getAllCourses();
		if (null != courseList && !courseList.isEmpty()) {
			courseDtlVoList = new ArrayList<>();
			for (CourseDetail course : courseList) {
				if (null != course) {
					CourseDetailVo courseVo = new CourseDetailVo();
					courseVo.setId(course.getId());
					courseVo.setCourseName(course.getCourseName());
					courseVo.setProfeciencyLevel(course.getProfeciencyLevel());
					courseVo.setCourseDetail(course.getCourseDetail());
					courseVo.setSkill(course.getSkill());
					courseDtlVoList.add(courseVo);
				}
			}
		}
		return courseDtlVoList;

	}

	@Override
	public CourseDetail getCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseDetail> getCoursesBySearch(CourseSearchVo searchVo) {
		return courseDao.getCoursesBySearch(searchVo);
	}

}
