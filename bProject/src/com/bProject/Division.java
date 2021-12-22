package com.bProject;

public class Division implements Calculable {
	public final String NAME = "Division";
	@Override
	public int calc(int num1, int num2) {
		return num1 / num2;
	}

}