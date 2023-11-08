package com.classMngSys.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.classMngSys.model.Batch;
import com.classMngSys.model.Course;
import com.classMngSys.model.Faculty;
import com.classMngSys.model.Student;

public class ServiceIMPL implements Services {

	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<Course>();
	List<Faculty> flist = new ArrayList<Faculty>();
	List<Batch> blist = new ArrayList<Batch>();
	List<Student> slist = new ArrayList<Student>();

	@Override
	public void addCourse() {
		System.out.println("How many Course do you want to add ?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Course c = new Course();

			System.out.println("Enter cid: ");
			c.setCid(sc.nextInt());

			System.out.println("Enter cname: ");
			c.setCname(sc.next());

			clist.add(c);
		}
		System.out.println("Courses Added !!");
	}

	@Override
	public void displayCourse() {
		for (Course c : clist) {
			System.out.println(c);
		}
	}
	
	@Override
	public void updateCourse() {
		System.out.println("Enter the cid of the Course you want to update:");
		int cid = sc.nextInt();
		boolean courseFound = false;
		for (Course c : clist) {
			if (cid == c.getCid()) {
				System.out.println("Enter new cname for Course #" + cid + " :");
				String newCname = sc.next();
				c.setCname(newCname);
				courseFound = true;
				break;
			}
		}
		if (courseFound) {
			System.out.println("Course details updated!");
		} else {
			System.out.println("Course with cid " + cid + " not found.");
		}
	}

	@Override
	public void deleteCourse() {
		System.out.println("Enter Cid: ");
		int cid = sc.nextInt();
		Course cs = null;
		for (Course c : clist) {
			if (cid == c.getCid()) {
				cs = c;
			}
		}
		if (cs != null) {
			clist.remove(cs);
			System.out.println("Course Deleted Successfully");
		} else {
			System.out.println("Invalid Id");
		}
	}

	@Override
	public void addFaculty() {
		System.out.println("How Many Faculty You want to add ?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Faculty f = new Faculty();
			System.out.println("Enter Faculty id: ");
			f.setFid(sc.nextInt());

			System.out.println("Enter Faculty Name: ");
			f.setFname(sc.next());

			System.out.println("Choose Course From Following: ");
			displayCourse();

			int cid = sc.nextInt();

			for (Course c : clist) {
				if (cid == c.getCid()) {
					f.setCourse(c);
				}
			}
			flist.add(f);
		}
	}

	@Override
	public void displayFaculty() {
		for (Faculty f : flist) {
			System.out.println(f);
		}
	}
	
	@Override
	public void updateFaculty() {
		System.out.println("Enter the fid of the Faculty you want to update:");
		int fid = sc.nextInt();
		boolean facultyFound = false;
		for (Faculty f : flist) {
			if (fid == f.getFid()) {
				System.out.println("Enter new fname for Faculty #" + fid + " :");
				String newFname = sc.next();
				f.setFname(newFname);
				facultyFound = true;
				break;
			}
		}
		if (facultyFound) {
			System.out.println("Faculty details updated!");
		} else {
			System.out.println("Faculty with fid " + fid + " not found.");
		}
	}
	
	@Override
	public void deleteFaculty() {
		System.out.println("Enter Faculty Fid: ");
		int fid = sc.nextInt();
		Faculty fs = null;

		for (Faculty f : flist) {
			if (fid == f.getFid()) {
				fs = f;
			}
		}
		if (fs != null) {
			flist.remove(fs);
			System.out.println("Faculty Delete SuccessFully");
		} else {
			System.out.println("Invalid Id");
		}
	}

	@Override
	public void addBatch() {
		System.out.println("How Many Batches You want to add ?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Batch b = new Batch();
			System.out.println("Enter Batch id: ");
			b.setBid(sc.nextInt());

			System.out.println("Enter Batch Name: ");
			b.setBname(sc.next());

			System.out.println("Choose Faculty From Following: ");
			displayFaculty();
			int fid = sc.nextInt();

			for (Faculty f : flist) {
				if (fid == f.getFid()) {
					b.setFaculty(f);
				}
			}
			blist.add(b);
		}
	}

	@Override
	public void displayBatch() {
		for (Batch b : blist) {
			System.out.println(b);
		}
	}

	@Override
	public void updateBatch() {
		System.out.println("Enter the bid of the Batch you want to update:");
		int bid = sc.nextInt();
		boolean batchFound = false;
		for (Batch b : blist) {
			if (bid == b.getBid()) {
				System.out.println("Enter new bname for Batch #" + bid + " :");
				String newBname = sc.next();
				b.setBname(newBname);
				batchFound = true;
				break;
			}
		}
		if (batchFound) {
			System.out.println("Batch details updated!");
		} else {
			System.out.println("Batch with bid " + bid + " not found.");
		}
	}
	
	@Override
	public void deleteBatch() {
		System.out.println("Enter Batch Bid: ");
		int bid = sc.nextInt();
		Batch bs = null;
		for (Batch b : blist) {
			if (bid == b.getBid()) {
				bs = b;
			}
		}
		if (bs != null) {
			blist.remove(bs);
			System.out.println("Batch Delete Successfully");
		} else {
			System.out.println("Invaild Id");
		}
	}

	@Override
	public void addStudent() {
		System.out.println("How Many Students You want to add ?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Student s = new Student();
			System.out.println("Enter Student id: ");
			s.setSid(sc.nextInt());

			System.out.println("Enter Student Name: ");
			s.setSname(sc.next());

			System.out.println("Choose Batch From Following: ");
			displayBatch();

			int bid = sc.nextInt();

			for (Batch b : blist) {
				if (bid == b.getBid()) {
					s.setBatch(b);
				}
			}
			slist.add(s);
		}
	}

	@Override
	public void displayStudent() {
		for (Student s : slist) {
			System.out.println(s);
		}
	}

	@Override
	public void updateStudent() {
		System.out.println("Enter the sid of the Student you want to update:");
		int sid = sc.nextInt();
		boolean studentFound = false;
		for (Student s : slist) {
			if (sid == s.getSid()) {
				System.out.println("Enter new sname for Student #" + sid + " :");
				String newSname = sc.next();
				s.setSname(newSname);
				studentFound = true;
				break;
			}
		}
		if (studentFound) {
			System.out.println("Student details updated!");
		} else {
			System.out.println("Student with sid " + sid + " not found.");
		}
	}
	
	@Override
	public void deleteStudent() {
		System.out.println("Enter Student Sid: ");
		int sid = sc.nextInt();
		Student ss = null;
		for (Student s : slist) {
			if (sid == s.getSid()) {
				ss = s;
			}
		}
		if (ss != null) {
			slist.remove(ss);
			System.out.println("Student Delete Successfully");
		} else {
			System.out.println("Invalid Id");
		}
	}
	
}


//@Override
//public void updateCourse() {
//	System.out.println("Enter Cource Cid: ");
//	int cid = sc.nextInt();
//	Course cs = null;
//	for(Course c:clist) {
//		if(cid == c.getCid()) {
//			cs = c;	
//		}
//	}
//	if(cs != null) {
//		System.out.println("Enter Updated Cid: ");
//		int newCid = sc.nextInt();			
//	}	
//}
