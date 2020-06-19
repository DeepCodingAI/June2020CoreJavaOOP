package nestedclass;

public class OuterClass {

	public String outerClassVariable;
	public OuterClass() {}
	
	InnerClassA innerClassA = new InnerClassA();
	InnerClassB innerClassB = new InnerClassB();
	public void outerMethodA() {
		System.out.println("This is from Outer Method A");
		innerClassA.innerAMethodA();
		innerClassB.innerBMethodA();
	}
	
	private class InnerClassA{
		
		private void innerAMethodA() {
			System.out.println("This is from Inner Method A");
		}
	}
	
	private class InnerClassB{
		public String innerClassBVariable;
		
		private void innerBMethodA() {
			System.out.println("This is from Inner Class B Method A");
		}
	}
	
}
