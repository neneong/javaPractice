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
		System.out.println("���ο� �ڵ���  " + model + "�� ����������ϴ�.");
	}
	
	void power() {
		power = !power;
	}
	
	void move(double speed) {
		if(!power) {
			System.out.println("�õ��� �����ֽ��ϴ�");
			return;
		}
		if(speed>maxSpeed) {
			System.out.println("�ְ�ӵ����� �� ������ ������ �� �����ϴ�");
			return;
		}
		this.speed = speed;
		System.out.println(speed+"km�� �����Դϴ�");
	}
	void stop() {
		speed = 0;
		System.out.println("�����߽��ϴ�.");
	}
	public static void main(String[] args) {
		Car car1 = new Car("����", 5, "���", 130);
		car1.power();
		car1.move(30);
		car1.stop();
	}
}
