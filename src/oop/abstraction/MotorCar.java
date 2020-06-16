package oop.abstraction;

public abstract class MotorCar implements Vehicle{

	public void engine() {
		System.out.println("Implementing motor engine");
	}
	
	public abstract void hybridEngine();
	
}
