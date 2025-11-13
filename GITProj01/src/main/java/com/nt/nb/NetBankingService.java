package com.nt.nb;

public class NetBankingService {
	// for net banking
	public String transferMoney(long srcAcc, long destAcc, double amt, String gateway) {
		System.out.println("NetBankingService.transferMoney()");
		return amt+" amount is transfer from Acc. No-"+srcAcc+" to Acc. No-"+destAcc+" using GateWay "+gateway;
	}
	
	public float getBalance() {
		// write logic (incomplete)
		return 0.0f;
	}
}
