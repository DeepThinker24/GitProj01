package com.nt.upi;

public class UPIPayment {
	public String doUPIPayment(long mobileno, double amount) {
		return amount+" amount is transfered to mobile number :: "+mobileno+" using BharatPay";
	}
	public String doUPIPaymentByAcno(long acno, double amount) {
		return amount+" amount is transfered to account number :: "+acno+" using BharatPay";
	}
	public String doUPIPaymentByUpiId(long acno, double amount) {
		return amount+" amount is transfered to UPI id :: "+acno+" using BharatPay";
	}
}
