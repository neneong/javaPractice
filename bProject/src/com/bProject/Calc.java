package com.bProject;

public class Calc {
	private int num1;
	private int num2;
	private String op;
	private int result;
	
	
	public Calculable calc() {
		Calculable calc = null;
		switch(op) {
		case "+" :
			calc = new Plus();
			System.out.println("더하기");
			break;
		case "-" :
			calc = new Minus();
			System.out.println("빼기");
			break;
		case "*" :
			calc = new Multiply();
			System.out.println("곱하기");
			break;
		case "/" :
			calc = new Division();
			System.out.println("나누기");
			break;
		}
		result = calc.calc(num1, num2);
		System.out.println(result);
		return calc;
	}
	
	

	public Calc(int num1, int num2, String op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}


	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

}