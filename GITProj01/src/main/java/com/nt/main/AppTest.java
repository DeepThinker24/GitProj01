package com.nt.main;

import com.nt.nb.NetBankingService;
import com.nt.service.ArithmeticOperations;
import com.nt.upi.UPIPayment;

public class AppTest {

	public static void main(String[] args) {
		ArithmeticOperations arth = new ArithmeticOperations();
		System.out.println("Result sum is : "+arth.sum(10, 30));
		System.out.println("Result sub is : "+arth.sub(70, 20));
		
		System.out.println("===========================");
		UPIPayment upi = new UPIPayment();
		System.out.println(upi.doUPIPayment(9798864889L, 800000));
		
		System.out.println("===========================");
		System.out.println(upi.doUPIPaymentByAcno(9658741235L, 896570));
		
		System.out.println("===========================");
		NetBankingService net = new NetBankingService();
		System.out.println(net.transferMoney(9874563L, 123654789L, 568497, "RTGS"));
	}

}
