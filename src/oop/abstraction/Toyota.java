package oop.abstraction;

public class Toyota extends MotorCar implements Car, Shape{

	public void shape() {
		System.out.println("Every car must have fixed 6 foot size");	
	}	
	public void start() {
		System.out.println("The car will have motor engine and you can use key to turn it on");
	}
	public void stop() {
		System.out.println("You should be able to stop the car whenever need to.So we will implement manual break system");
		
	}
	public void drive() {
		System.out.println("Driving Toyota Car");
	}

	public void hybridEngine() {
		System.out.println("developing hybrid engine");
	}

	public void oilEngine() {
		System.out.println("Developing Engine that runs on Oil & Gas");
	}
	public void drawShape() {
		System.out.println("Drawing Rectangle with 4X5X6X7");
	}
	
}
