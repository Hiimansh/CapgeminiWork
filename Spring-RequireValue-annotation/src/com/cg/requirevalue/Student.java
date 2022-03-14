package com.cg.requirevalue;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	
//	@Value("${student.name}")
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	@Value("${student.intrestedCourse}")
//	public void setIntrestedCourse(String intrestedCourse) {
//		this.intrestedCourse = intrestedCourse;
//	}
//	
//	@Value("${student.hobby}")
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}
	
	public void displayStudentInfo() {
		System.out.println("Student name: "+ name);
		System.out.println("Student intrested course: "+ intrestedCourse);
		System.out.println("Student hobby: "+ hobby);
	}

}
