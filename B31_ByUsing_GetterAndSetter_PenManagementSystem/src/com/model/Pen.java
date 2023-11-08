package com.model;

public class Pen {

	private String brand;
	private int price;
	private String inkColor;
	private String characteristics; // Smooth, No Dragging , No Scratchiness, Right ammount of Flex, Refillable,
									// Easy to use, Long-lasting

	private float tip_in_mm;

	public String toString() {
		String s = "Pen--> Brand : " + brand + " , Price: " + price + " , Ink_Color: " + inkColor
				+ " , Characteristics of Pen: " + characteristics + " , Tip: " + tip_in_mm;
		return s;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public float getTip_in_mm() {
		return tip_in_mm;
	}

	public void setTip_in_mm(float tip_in_mm) {
		this.tip_in_mm = tip_in_mm;
	}

	
}
