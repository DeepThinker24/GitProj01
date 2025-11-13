package com.nt.nb;

import java.util.Random;

public class NetBankingService {
	// for net banking
	public String transferMoney(long srcAcc, long destAcc, double amt, String gateway) {
		System.out.println("NetBankingService.transferMoney()");
		return amt+" amount is transfer from Acc. No-"+srcAcc+" to Acc. No-"+destAcc+" using GateWay "+gateway;
	}
	
	public float getBalance() {
		// write logic (incomplete)
		float balance = new Random().nextInt(10000000);
		return balance;
	}
}
