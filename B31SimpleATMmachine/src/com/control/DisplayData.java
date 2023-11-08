package com.control;

import com.configure.Show; 
import com.input.AllInputData;
import com.input.InputData;

public class DisplayData {

	public static void main(String[] args) {
		System.out.println("---Show the InputData method ---");
		Show show = new Show();
		InputData inp = show.getInputDataDetails();
		System.out.println(inp.atmName);
		System.out.println(inp.pin);
		System.out.println(inp.accHolderName);
		System.out.println(inp.balance);
		System.out.println(inp.viewLoanAmmount);
		System.out.println("------------------------------------------------------------------------------------");
		
		System.out.println();
		AllInputData allinputdata = show.getAllInputData();
		System.out.println("::--ALL INPUT DATA DETAILS--:: \n");
		System.out.println(allinputdata.aakash.atmName);
		System.out.println(allinputdata.aakash.pin);
		System.out.println(allinputdata.aakash.accHolderName);
		System.out.println(allinputdata.aakash.balance);
		System.out.println(allinputdata.aakash.viewLoanAmmount);
		
		System.out.println();
		System.out.println(allinputdata.mohit.atmName);
		System.out.println(allinputdata.mohit.pin);
		System.out.println(allinputdata.mohit.accHolderName);
		System.out.println(allinputdata.mohit.balance);
		System.out.println(allinputdata.mohit.viewLoanAmmount);
		

	}
}
