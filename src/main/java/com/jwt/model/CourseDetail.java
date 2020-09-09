package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the course_details database table.
 * 
 */
@Entity
@Table(name = "course_details")
@NamedQuery(name = "CourseDetail.findAll", query = "SELECT c FROM CourseDetail c")
public class CourseDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name = "course_detail")
	private String courseDetail;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "profeciency_level")
	private int profeciencyLevel;

	// bi-directional many-to-one association to Skill
	@ManyToOne
	private Skill skill;

	public CourseDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseDetail() {
		return this.courseDetail;
	}

	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getProfeciencyLevel() {
		return this.profeciencyLevel;
	}

	public void setProfeciencyLevel(int profeciencyLevel) {
		this.profeciencyLevel = profeciencyLevel;
	}

	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

}