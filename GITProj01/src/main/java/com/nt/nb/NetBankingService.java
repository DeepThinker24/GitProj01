package com.nt.nb;

public class NetBankingService {
	public String transferMoney(long srcAcc, long destAcc, double amt, String gateway) {
		return amt+" amount is transfer from Acc. No-"+srcAcc+" to Acc. No-"+destAcc+" using GateWay "+gateway;
	}
}
