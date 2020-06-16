package oop.abstraction;

public interface Car {

	public abstract void shape();
	public void start();
	public void stop();
	
	public static void wheel() {
		System.out.println("run on 4 wheel");
	}
	
}
