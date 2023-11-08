	package com.returntype;

	public class Test {

		public void m1() {
			System.out.println("m1 method Test class");
		}
	                 // primitive data type - 8
		            // non primitive data type - classes
		public int m2() {
			// 1000
			return 10;
		}

		public String m3() {
			return "gaurav";
		}

		public double m4() {
			return 10.123;
		}

		public boolean m5() {
			return true;
		}

		public char m6() {
			return 'H';
		}
		
		public Car addCarDetails() {
	          Car c = new Car();
	          c.model = "Maruti Suzuki";
	          c.colour = "White";
	          c.no_of_seets = 4;
	          c.num = 264;
	         c.speed = 180;
	          return c;
	
		}

		public Laptop addLaptopDetails() {
			Laptop l = new Laptop();
			l.brand = "HP";
			l.model = "i5 series hp15s3048";
			l.price = 65000;
			l.discount = 4;
			return l;
		}
		
		public Employee addEmpDetails() {
			Employee e = new Employee();

			e.eid = 102;// data set
			e.name = "Nilesh";// data set
			e.address = "Pcmc";// data set

			return e;// eid name address

		}

		public Student addStudentDetails() {
			Student s = new Student();
			s.rollNo = 77;
			s.marks = 89.90;
			return s;
		}

		public static void main(String[] args) {
			Test t = new Test();
			t.m1();

			Student std = t.addStudentDetails();
			System.out.println("STUDENT ROLLNO :" + std.rollNo + " STUDENT MARKS : " + std.marks);
			
			Employee emp = t.addEmpDetails();
			System.out.println(emp.eid);// data get
			System.out.println(emp.name);
			System.out.println(emp.address);
			
			Laptop lap = t.addLaptopDetails();
			System.out.println(lap.price);
			System.out.println(lap.brand);
			System.out.println(lap.model);
			System.out.println(lap.discount);

			Car car = t.addCarDetails();
			car.familyCar();
			System.out.println(car.model);
			System.out.println(car.colour);
			System.out.println(car.no_of_seets);
			System.out.println("-->>>>>>>>>>>>>"+car.num);
			System.out.println("====="+car.speed);
			car.sportscar();
			
			/// System.out.println(t.m2());
			int i = t.m2();// 10
			System.out.println(i);// 10
			
			String s = t.m3();
			System.out.println(s);

			double d = t.m4();
			System.out.println(d);// 10.123

			boolean b = t.m5();
			System.out.println(b);// true

			char c = t.m6();
			System.out.println(c);

		}

	}

