package CoreJava;

public class K_SuperKeywordChild extends K_SuperKeywordParent{
	
	String name = "QA stuffs";
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am from child class");
	}
	
	public K_SuperKeywordChild() {
		super(); //It should always be the first line
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 K_SuperKeywordChild cd = new K_SuperKeywordChild();
		 cd.getStringData();
		 cd.getData();
	}

}
