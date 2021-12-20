package com.aProject;

public class CarMain {
	public static void main(String[] args) {
//		Car car1 = new Car("검정", 5, "모닝", 130);
//		car1.power();
//		car1.move(30);
//		car1.stop();
//		Car car2 = car1;
		Car.MAX_SPEED = 300;
		SportsCar sportsCar1 = new SportsCar("빨강", 2, "람보르기니", 300);
	}
}
