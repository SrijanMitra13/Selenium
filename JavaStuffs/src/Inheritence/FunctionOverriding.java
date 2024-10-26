package Inheritence;

public class FunctionOverriding extends ParentClassDemo{
	
	//Method overriding audiosystem
	public void audioSystem() {
		System.out.println("Overridden Audio System");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverriding fo = new FunctionOverriding();
		fo.audioSystem();

	}

}
