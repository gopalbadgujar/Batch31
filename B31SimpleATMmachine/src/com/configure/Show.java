package com.configure;

import com.input.AllInputData;
import com.input.InputData;

public class Show {

	public InputData getInputDataDetails() {
		
		InputData id = new InputData();
		id.atmName = "AxisBankATM";
		id.pin = 1901;
		id.accHolderName = "Aakash_Badgujar";
		id.balance = 10000;
		id.viewLoanAmmount = 500300;
		
		return id;
	}
	
	public AllInputData getAllInputData() {
		
		AllInputData aipd = new AllInputData();
		aipd.aakash.atmName = "HDFC_Bank_ATM";
		aipd.aakash.pin = 1111;
		aipd.aakash.accHolderName = "AAKASH_BADGUJAR";
		aipd.aakash.balance = 20000;
		aipd.aakash.viewLoanAmmount = 00;
		
		aipd.mohit.atmName = "Union_Bank_Of_India_ATM";
		aipd.mohit.pin = 2410;
		aipd.mohit.accHolderName = "MOHIT_PARDESHI";
		aipd.mohit.balance = 17000;
		aipd.mohit.viewLoanAmmount = 00;
		
		return aipd;
		
	}
	
}
