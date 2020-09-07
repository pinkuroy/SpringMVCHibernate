package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.CourseDetail;
import com.jwt.model.Employee;

@Repository
public class CourseDaoImpl implements CourseDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(Employee employee)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(employee);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseDetail> getAllCourses()
	{
		return sessionFactory.getCurrentSession()
				.createQuery("from CourseDetail").list();
	}

	@Override
	public CourseDetail getCourseById(int courseId)
	{
		return null;
	}

}
