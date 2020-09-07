package com.jwt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the skills database table.
 * 
 */
@Entity
@Table(name="skills")
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="skill_name")
	private String skillName;

	@Column(name="skill_tag")
	private String skillTag;

	//bi-directional many-to-one association to CourseDetail
	@OneToMany(mappedBy="skill")
	private List<CourseDetail> courseDetails;

	public Skill() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillTag() {
		return this.skillTag;
	}

	public void setSkillTag(String skillTag) {
		this.skillTag = skillTag;
	}

	public List<CourseDetail> getCourseDetails() {
		return this.courseDetails;
	}

	public void setCourseDetails(List<CourseDetail> courseDetails) {
		this.courseDetails = courseDetails;
	}

	public CourseDetail addCourseDetail(CourseDetail courseDetail) {
		getCourseDetails().add(courseDetail);
		courseDetail.setSkill(this);

		return courseDetail;
	}

	public CourseDetail removeCourseDetail(CourseDetail courseDetail) {
		getCourseDetails().remove(courseDetail);
		courseDetail.setSkill(null);

		return courseDetail;
	}

}