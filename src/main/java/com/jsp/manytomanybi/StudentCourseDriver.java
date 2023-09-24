package com.jsp.manytomanybi;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCourseDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s1=new Student();
		s1.setName("Bappa");
		s1.setEmail("Blessings@mail.com");
		
		Student s2=new Student();
		s2.setName("shivani");
		s2.setEmail("shivani@mail.com");
		
		Student s3=new Student();
		s3.setName("shivam");
		s3.setEmail("shivam@mail.com");
		
		Student s4=new Student();
		s4.setName("shraddha");
		s4.setEmail("shraddha@mail.com");
		
		Course c1=new Course();
		c1.setSubject("SQL");
		c1.setDuration(2);
		
		Course c2=new Course();
		c2.setSubject("WEB TECH");
		c2.setDuration(2);
		
		Course c3=new Course();
		c3.setSubject("CORE JAVA");
		c3.setDuration(3);
		
		Course c4=new Course();
		c4.setSubject("ADV JAVA");
		c4.setDuration(2);
		
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);

ArrayList<Student> students=new ArrayList<Student>();
students.add(s1);
students.add(s2);
students.add(s3);
students.add(s4);

s1.setCourse(courses);
s2.setCourse(courses);
s3.setCourse(courses);
s4.setCourse(courses);

c1.setStudent(students);
c2.setStudent(students);
c3.setStudent(students);
c4.setStudent(students);

entityTransaction.begin();
entityManager.persist(s1);
entityManager.persist(s2);
entityManager.persist(s3);
entityManager.persist(s4);
entityTransaction.commit();
		 
		
		
		
	}

}























