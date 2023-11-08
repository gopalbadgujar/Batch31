package com.list1.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class AllUniversities {

	public List<List<String>> addUniversities() {
	
		List<String> puneUniversity = new ArrayList<String>();
		puneUniversity.add("(Engineering)");
		puneUniversity.add("(Medical)");
		puneUniversity.add("(Arts, Fine Arts and Performing Arts)");
		puneUniversity.add("(Commerce and Management)");
		puneUniversity.add("(Law)");
		
		List<String> mumbaiUniversity = new ArrayList<String>();
		mumbaiUniversity.add("(Medical)");
		mumbaiUniversity.add("(PGDME)");//Post Graduate Diploma In Management Of Education (PGDME) One Year Diploma Course. ...
		mumbaiUniversity.add("(PGCCRM)");//Post graduate certificate Course In Research Methodology In Education (PGCCRM) Six Month Certificate Course. ...
		
		List<String> shivajiUniversity = new ArrayList<String>();
		shivajiUniversity.add("(Bcom)");
		shivajiUniversity.add("(Bsc)");
		shivajiUniversity.add("(B-Tech)");
		
		List<String> dbatu = new ArrayList<String>();
		dbatu.add("(Engineering)");
		dbatu.add("(Ph.D)");
		dbatu.add("(Diploma)");
		dbatu.add("(MBA)");
		
		List<List<String>> maharashtraUniversities = new ArrayList<List<String>>();
		
		maharashtraUniversities.add(puneUniversity);
		maharashtraUniversities.add(mumbaiUniversity);
		maharashtraUniversities.add(shivajiUniversity);
		maharashtraUniversities.add(dbatu);
		
		return maharashtraUniversities;
	}
}
