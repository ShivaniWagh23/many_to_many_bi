package com.jsp.manytomanybi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String subject;
private int duration;

@ManyToMany
@JoinTable(name = "mystudent_mycourse")
private List<Student> student;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	this.student = student;
}



}
