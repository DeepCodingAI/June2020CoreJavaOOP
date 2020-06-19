package oop.polymorphism;

public class TestLandCalculator {

	public static void main(String[] args) {
		LandCalculator cal1 = new LandCalculator();
		cal1.areaOfLand(3, 5);
		int triangle = cal1.areaOfLand(3,4,5);
		System.out.println("Triangle Size: " + triangle);
		int rectangle = cal1.areaOfLand(3,4,5,7);
		System.out.println("Rectangle Size of Land Cal: " + rectangle);
		
		ModernCalculator mCal1 = new ModernCalculator();
		int rectangleOfModernCal = mCal1.areaOfLand(3,4,5,7);
		System.out.println("Rectangle Size of Modern cal: " + rectangleOfModernCal);
		
	
	}

}
