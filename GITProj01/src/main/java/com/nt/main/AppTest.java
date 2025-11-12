package com.nt.main;

import com.nt.service.ArithmeticOperations;

public class AppTest {

	public static void main(String[] args) {
		ArithmeticOperations arth = new ArithmeticOperations();
		System.out.println("Result sum is : "+arth.sum(10, 30));
		System.out.println("Result sub is : "+arth.sub(70, 20));
	}

}
