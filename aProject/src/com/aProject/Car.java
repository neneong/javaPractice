package com.aProject;

public abstract class Car {
	String color;
	int seat;
	String model;
	double speed;
	double maxSpeed;
	boolean power;
	public static int MAX_SPEED = 150;
	
	abstract boolean checkMaxSpeed(double maxSpeed);

	public Car(String color, int seat, String model, double maxSpeed) {
		super();
		// 생성자의 스택에 저장된 color, seat, model, maxSpeed의 값을
		// 힙에 저장된 객체의 멤버변수에 저장한다.
		if (checkMaxSpeed(maxSpeed)) {
			System.out.println("최고속도를 넘었습니다.");
			return;
		}
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
		if (!power) {
			System.out.println("시동이 꺼져있습니다");
			return;
		}
		if (speed > maxSpeed) {
			System.out.println("최고속도보다 더 빠르게 움직일 수 없습니다");
			return;
		}
		this.speed = speed;
		System.out.println(speed + "km로 움직입니다");
	}

	void stop() {
		speed = 0;
		System.out.println("정지했습니다.");
	}

}
