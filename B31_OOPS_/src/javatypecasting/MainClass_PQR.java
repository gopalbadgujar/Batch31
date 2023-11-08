package javatypecasting;

public class MainClass_PQR {

	public P test() {   // jdk 1.5 same class // child class
		P p = new P(); // Parent Class
		Q q = new Q(); //P+Q
		// return p;
		
		R r = new R();
		// return q;
		return r;		
	}
	
	
	public static void main(String[] args) {
		
		MainClass_PQR m = new MainClass_PQR();
		System.out.println("----------P----------");
		P p = m.test();
		System.out.println(p.x);
		p.m1();
		
		System.out.println("----------Q----------");
		Q q = (Q)m.test();
		System.out.println(q.x);
		System.out.println(q.y);
		q.m1();
		q.m2();
		
		System.out.println("----------R----------");
				
		R r =(R) m.test();
		System.out.println(r.x);
		System.out.println(r.y);
		System.out.println(r.z);
		r.m1();
		r.m2();
		r.m3();
		
	}
	
}
