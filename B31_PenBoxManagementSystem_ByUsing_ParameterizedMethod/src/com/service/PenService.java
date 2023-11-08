package com.service;

import com.Features.Pack_Of_Pens;
import com.Features.Pen;
import com.Features.PenBox;

public class PenService {

	public PenService() {
         System.out.println("---IT'S ABOUT PEN-SERVICES");	
}
	
	public Pen getPenDetails() {
		Pen p = new Pen();
		p.brand = "Raynold";
		p.characteristics = "Smooth and Long-lasting";
		p.inkColor = "ShiningBlue";
		p.price = 99;
		
		return p;
	}
	
	public Pack_Of_Pens getPack_Of_PensDetails() {
		Pack_Of_Pens pop = new Pack_Of_Pens();
		pop.pen1.brand = "TrimaX";
		pop.pen1.characteristics = "UltraSmooth & No Scratching or Dragging";
		pop.pen1.inkColor = "Black";
		pop.pen1.price = 50;
		
		pop.pen2.brand = "TrimaX";
		pop.pen2.characteristics = "UltraSmooth with Scratchiness";
		pop.pen2.inkColor = "Blue";
		pop.pen2.price = 50;

		
		return pop;
		
	}
	
	public PenBox getPenBoxDetails() {
		PenBox pb = new PenBox();
		pb.pb1.pen1.brand = "Super*";
		pb.pb1.pen1.characteristics = "ExtraSmooth";
		pb.pb1.pen1.inkColor = "LightBlue";
		pb.pb1.pen1.price = 30;
		return pb;
	}
	
	public Pack_Of_Pens getPack_Of_PensDetails(String s1, String s2, String s3, String s4, String s5, int i) {
		Pack_Of_Pens pop = new Pack_Of_Pens();
//		pop.pen1.brand = "GLOBAL_PENS";
//		pop.pen1.characteristics = "UltraSmooth & No Scratching or Dragging";
//		pop.pen1.inkColor = "DarkBlack";
//		pop.pen1.price = 35;
//		pop.pen1.type = "Capless";
//		pop.pen1.description = 
//		" It should feel smooth, with no dragging or Scratchiness,\n"
//		+ "	and it should have just the right amount of flex.\n"
//		+ " Cap-less roller-ball pens, ball-point & gel pens should have a smooth mechanism \n"
//		+ "	for extending and retracting the writing point, &\n"
//		+ " once extended, the point should stay firmly in place.";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(i+" Rs");
		System.out.println("\n");

		
		return pop;
		
	}
	
	
}
