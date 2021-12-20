package com.aProject;

public class Car {
	String color;
	int seat;
	String model;
	double speed;
	double maxSpeed;
	boolean power;
	Car(String color, int seat, String model, double maxSpeed){
		super();
		this.color = color;
		this.seat = seat;
		this.model = model;
		this.maxSpeed = maxSpeed;
		System.out.println("새로운 자동차  " + model + "가 만들어졌습니다.");
	}
	
	void power() {
		power = !power;
	}
	
	void move(double speed) {
		if(!power) {
			System.out.println("시동이 꺼져있습니다");
			return;
		}
		if(speed>maxSpeed) {
			System.out.println("최고속도보다 더 빠르게 움직일 수 없습니다");
			return;
		}
		this.speed = speed;
		System.out.println(speed+"km로 움직입니다");
	}
	void stop() {
		speed = 0;
		System.out.println("정지했습니다.");
	}
	public static void main(String[] args) {
		Car car1 = new Car("검정", 5, "모닝", 130);
		car1.power();
		car1.move(30);
		car1.stop();
	}
}
