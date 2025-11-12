package com.nt.main;

import com.nt.service.ArithmeticOperations;

public class AppTest {

	public static void main(String[] args) {
		ArithmeticOperations arth = new ArithmeticOperations();
		System.out.println(arth.sum(10, 30));
	}

}
