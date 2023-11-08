package com.controller;

import com.service.Collage;
import com.model.*;

public class University {

	public static void main(String[] args) {
		Collage collage = new Collage();
		Student student = collage.addStudentDetails();
		System.out.println(student.id+"  "+student.name+"  "+student.address);
		
	 	AllStudent allStu = collage.addAllStudentDetails();
	 	System.out.println(":----All Students Details----:");
		System.out.println(allStu.aakash.id+"  "+allStu.aakash.name+"  "+allStu.aakash.address);
		System.out.println(allStu.mayur.id+"  "+allStu.mayur.name+"  "+allStu.mayur.address);
		System.out.println(allStu.mohit.id+"  "+allStu.mohit.name+"  "+allStu.mohit.address);


		
	}
}
