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
		// �������� ���ÿ� ����� color, seat, model, maxSpeed�� ����
		// ���� ����� ��ü�� ��������� �����Ѵ�.
		if (checkMaxSpeed(maxSpeed)) {
			System.out.println("�ְ�ӵ��� �Ѿ����ϴ�.");
			return;
		}
		this.color = color;
		this.seat = seat;
		this.model = model;
		this.maxSpeed = maxSpeed;
		System.out.println("���ο� �ڵ���  " + model + "�� ����������ϴ�.");
	}

	void power() {
		power = !power;
	}

	void move(double speed) {
		if (!power) {
			System.out.println("�õ��� �����ֽ��ϴ�");
			return;
		}
		if (speed > maxSpeed) {
			System.out.println("�ְ�ӵ����� �� ������ ������ �� �����ϴ�");
			return;
		}
		this.speed = speed;
		System.out.println(speed + "km�� �����Դϴ�");
	}

	void stop() {
		speed = 0;
		System.out.println("�����߽��ϴ�.");
	}

}
