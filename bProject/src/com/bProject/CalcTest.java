package com.bProject;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {

		System.out.println("숫자 2개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + "  " + num2);

		if(Util.chkNumSize(num1) && Util.chkNumSize(num2)) {
			// 3자리 이내의 정상적인 숫자
			System.out.println("연산자를 입력하세요.(+,-,*,/)");
			sc.nextLine(); // 엔터 버리기
			String op = sc.nextLine();
			System.out.println(op);
			Calc calc = new Calc(num1, num2, op);
			Calculable cab = calc.calc();
			if(cab instanceof Plus) {
				Plus plus = (Plus)cab;
				System.out.println(plus);
			}else if(cab instanceof Minus) {
				Minus minus = (Minus)cab;
				System.out.println(minus);
			}else if(cab instanceof Multiply) {
				Multiply multiply = (Multiply)cab;
				System.out.println(multiply);
			}else if(cab instanceof Division) {
				Division division = (Division)cab;
				System.out.println(division);
			}
		} else {
			// 4자리 이상의 비정상적인 숫자
			System.out.println("3자리 수까지의 숫자만 입력 가능합니다.");
		}

		sc.close();
	}

}