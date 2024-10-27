package CoreJava;

public class J_Constructor {
	
	//Default Constructor
	public J_Constructor() {
		System.out.println("I am in the constructor");
	}
	
	//Parameterized Constructor
	public J_Constructor(int a, int b) {
		System.out.println("I am in the parameterized constructor");
	}
	
	//Parameterized String Constructor
	public J_Constructor(String str) {
		System.out.println("I am in the parameterized string constructor");
	}
	
	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor is a block of code that executes whenever an object is created
		// Will not return any values
		// Name of constructor should be the class name
		
		J_Constructor cons = new J_Constructor();
		J_Constructor pcons = new J_Constructor(5,10);
		J_Constructor pScons = new J_Constructor("string");
	}

}
