package Abstraction;

public class childEmirates extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childEmirates c = new childEmirates();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
