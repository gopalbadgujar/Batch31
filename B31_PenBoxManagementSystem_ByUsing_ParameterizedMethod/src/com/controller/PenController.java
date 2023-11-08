package com.controller;

import com.Features.Pack_Of_Pens;
import com.Features.Pen;
import com.Features.PenBox;
import com.service.PenService;
import com.service.*;

public class PenController {

	public static void main(String[] args) {

		PenService pns = new PenService();
		Pen pen = pns.getPenDetails();
		System.out.println("------Single Pen Details-------");
		System.out.println(pen.brand);
		System.out.println(pen.characteristics);
		System.out.println(pen.price+" Rs");
		System.out.println();
		
		Pack_Of_Pens pack = pns.getPack_Of_PensDetails();
		System.out.println("------Pack of Pens-------");
		System.out.println(pack.pen1.brand+".");
		System.out.println(pack.pen1.characteristics+".");
		System.out.println(pack.pen1.price+" Rs");
		System.out.println();
		System.out.println(pack.pen2.brand+".");
		System.out.println(pack.pen2.characteristics+".");
		System.out.println(pack.pen2.price+" Rs");
		System.out.println();		System.out.println();


		
		PenBox boxP = pns.getPenBoxDetails();
		System.out.println("-------PenBox-------");
		System.out.println(boxP.pb1.pen1.brand);
		System.out.println(boxP.pb1.pen1.characteristics);
		System.out.println(boxP.pb1.pen1.price);
		
		System.out.println();
		pns.getPack_Of_PensDetails("Cello","Long-lasting & Dark", "ShiningBlack", "Boll-Point-Pen", "It should feel smooth, with no dragging or Scratchiness, \r\n"
		+ "and it should have just the right amount of flex.", 350);
//		System.out.println(packs.pen1.brand);
//		System.out.println(packs.pen1.characteristics);
//		System.out.println(packs.pen1.type);
//		System.out.println(packs.pen1.inkColor);
//		System.out.println(packs.pen1.price);
//		System.out.println(packs.pen1.description);
		
	}
}
