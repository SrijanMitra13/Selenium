package OOPforFrameworkDevelopment;

public class PS2 extends PS3{
	
	int a;
	public PS2(int a) {
		super(a); //Parent class construtor is invoked
		this.a=a; //this keyword
	}
	
	public int increment() {
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a = a-1;
		return a;
	}
}
