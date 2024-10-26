package Inheritence;

public class ChildClassDemo extends ParentClassDemo{
	String color = "yellow";
	
	public void engine() {
		System.out.println("Engine code implemented");
	}
	
	public void color() {
		System.out.println(color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo cd = new ChildClassDemo();
		ParentClassDemo pd = new ChildClassDemo();
		cd.engine();
		cd.color();
		System.out.println(pd.color);
		cd.brake();
		cd.audioSystem();
	}

}
