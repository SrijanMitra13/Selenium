package Inheritence;
//either argument count should be different
//argument data type should be different
public class FunctionOverloading {
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		System.out.println(a + ", " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading func = new FunctionOverloading();
		func.getData(10);
		func.getData("Hello");
		func.getData(2, 5);

	}

}
