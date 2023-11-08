package com.polymorphism.overriding;

public class Child extends Parent{

	@Override
	public void m1(Parent p) {
		super.m1(p);
		System.out.println("m1 Override Method");
	}
	
	@Override
	public String m2() {
		System.out.println("m2 Override Method");
		return super.m2();
	}
	
	@Override
	public Parent m3() {
		System.out.println("m3 Override Method");
		return super.m3();
	}
	
	//public > protected > default > private      -----Scope of Access Specifiers.
	       // Always be Same or Greater
//	@Override
//	void m4() {
//		System.out.println("m4 Override Method");
//		super.m4();
//	}
	
//	@Override
//	private void m5() {
//	System.out.println("m5 private Method of PARENT CLASS");
//	}
//
//	public final void m6() {
//		System.out.println("m6 final Method of PARENT CLASS");
//	}
	
	public static void m7() {
		System.out.println("m7 Method of CHILD CLASS");
	}
	
	public static void main(String[] args) {
		System.out.println("-----------PARENT CLASS OBJECT-----------");
		Parent p = new Parent();
		p.m1(p);
		p.m2();
		p.m3();
		p.m4();
		p.m6();
		p.m7();  //Overrided method
		System.out.println();
		
		System.out.println("-------------CHILD CLASS OBJECT-------------");
		Child child = new Child();
		child.m1(child);
		child.m2();
		System.out.println(child.m2()); // it Returns the given (String) input
		child.m3();
		child.m4();
		//child.m7();
		m7();
		
		System.out.println("\n");
		
		System.out.println("------------------MIX OBJECT----------------");
		Parent p1 = new Child();   //parent + overrided + child
		m7();
		
	}
}
