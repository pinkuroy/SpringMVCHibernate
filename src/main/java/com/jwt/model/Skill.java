package com.jwt.model;

import java.io.Serializable;
import javax.persistence.*;


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

}