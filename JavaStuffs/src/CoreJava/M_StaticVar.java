package CoreJava;

public class M_StaticVar {
	
	//Instance Variables
	String name;
	String address;
	static String city; //class variables
	static int i;
	
	//static block
	static {
		city="Bangalore";
		i=0;
	}
	//Bottomline: All static variables are class variables
	//Remaining variables which are declared in class are called instance variables.
	//Variables inside the contructor are local variables
	
	public M_StaticVar(String name, String address) {
		// Assigning local variables to our instance variables
		this.name = name; //this refers to the instance variables
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address+" "+city);
	}
	
	//Class methods
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M_StaticVar obj = new M_StaticVar("BOB","Marathalli");
		M_StaticVar obj1 = new M_StaticVar("RAM","Whitefield");
		obj.getAddress();
		obj1.getAddress();
		M_StaticVar.getCity();
		M_StaticVar.i=5;
		obj.address="XYZ";
	}

}
