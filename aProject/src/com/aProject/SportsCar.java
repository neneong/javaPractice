package com.aProject;

public class SportsCar extends Car {
	public SportsCar(String color, int seat, String model, double maxSpeed) {
		super(color, seat, model, maxSpeed);
	}

	@Override
	boolean checkMaxSpeed(double maxSpeed) {
		{
			if (maxSpeed > MAX_SPEED) {
				return true;
			} else
				return false;
		}
	}
}
