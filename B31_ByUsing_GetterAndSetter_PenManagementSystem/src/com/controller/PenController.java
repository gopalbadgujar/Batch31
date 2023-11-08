package com.controller;

import com.model.Pen;
import com.service.PenService;

public class PenController {

	public static void main(String[] args) {
		System.out.println("----------PEN DETAILS---------");

		Pen p1 = new Pen();
		p1.setBrand("HTC");
		p1.setCharacteristics("Ultra_Smooth");
		p1.setInkColor("Shining_Blue");
		p1.setTip_in_mm(0.5f);
		p1.setPrice(49);
		
//		System.out.println(p1.getBrand());
//		System.out.println(p1.getCharacteristics());
//		System.out.println(p1.getInkColor());
//		System.out.println(p1.getTip_in_mm());
//		System.out.println(p1.getPrice());
		
		PenService ps = new PenService();
		ps.displayDetailsOfPen(p1);
		

	}
}
