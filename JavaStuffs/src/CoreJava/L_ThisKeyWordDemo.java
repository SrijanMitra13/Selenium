package CoreJava;

public class L_ThisKeyWordDemo {
	
	int a=2;
	
	public void getData() {
		int a =3;
		System.out.println(a);
		System.out.println(this.a); //this refers to the instance variables
		System.out.println(a + this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L_ThisKeyWordDemo gd = new L_ThisKeyWordDemo();
		gd.getData();

	}

}
