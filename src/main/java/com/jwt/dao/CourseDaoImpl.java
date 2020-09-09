package com.jwt.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.jwt.model.CourseDetail;
import com.jwt.model.Employee;
import com.jwt.vo.CourseSearchVo;

@Repository
public class CourseDaoImpl implements CourseDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseDetail> getAllCourses() {
		return sessionFactory.getCurrentSession().createQuery("from CourseDetail").list();
	}

	@Override
	public CourseDetail getCourseById(int courseId) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseDetail> getCoursesBySearch(CourseSearchVo searchVo) {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(CourseDetail.class);
		if (!StringUtils.isEmpty(searchVo.getCname())) {
			cr.add(Restrictions.like("courseName", searchVo.getCname(), MatchMode.ANYWHERE));
		}
		if (!StringUtils.isEmpty(searchVo.getPlevel())) {
			cr.add(Restrictions.eq("profeciencyLevel", Integer.parseInt(searchVo.getPlevel())));
		}
		if (!StringUtils.isEmpty(searchVo.getSkillname())) {
			// Skill skill = new Skill();
			// skill.setSkillName(searchVo.getSkillname());
			// ProjectionList projectionList = Projections.projectionList();
			// cr.createAlias("skill.skillName", "sName");
			// projectionList.add(Projections.property(propertyName))
			cr.add(Restrictions.like("skill.skillName", searchVo.getSkillname(), MatchMode.ANYWHERE));
		}
		List<CourseDetail> courseList = cr.list();
		return courseList;
	}

}
