package com.jwt.vo;

import com.jwt.model.Skill;

public class CourseDetailVo
{

	private int id;

	private String courseDetail;

	private String courseName;

	private int profeciencyLevel;

	private Skill skillDtl;

	public CourseDetailVo()
	{
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCourseDetail()
	{
		return this.courseDetail;
	}

	public void setCourseDetail(String courseDetail)
	{
		this.courseDetail = courseDetail;
	}

	public String getCourseName()
	{
		return this.courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	public int getProfeciencyLevel()
	{
		return this.profeciencyLevel;
	}

	public void setProfeciencyLevel(int profeciencyLevel)
	{
		this.profeciencyLevel = profeciencyLevel;
	}

	public Skill getSkillDtl()
	{
		return skillDtl;
	}

	public void setSkillDtl(Skill skillDtl)
	{
		this.skillDtl = skillDtl;
	}

	@Override
	public String toString()
	{
		return "CourseDetailVo [id=" + id + ", courseDetail=" + courseDetail
				+ ", courseName=" + courseName + ", profeciencyLevel="
				+ profeciencyLevel + ", skillDtl=" + skillDtl + "]";
	}

}