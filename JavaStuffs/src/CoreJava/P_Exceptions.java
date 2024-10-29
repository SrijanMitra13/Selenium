package CoreJava;

public class P_Exceptions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b = 7;
		int c = 0;
		
		try {
			int k = b/c;
			System.out.println(k);
		} catch(Exception e) {
			System.out.println("I catched the exception");
		}
		
		tryCatch();
	}
	
	
	//One try can be followed by multiple catch blocks
	//Catch should be an immediate block after try
	public static void tryCatch() {
		int b = 7;
		int c = 0;
		
		try {
//			int k = b/c;
			
			int arr[] = new int[5];
			
			System.out.println(arr[7]);
		} catch(ArithmeticException et) {
			System.out.println("I catched the Arithmetic exception");
		} catch(IndexOutOfBoundsException ets) {
			System.out.println("I catched the IndexOutOfBoundExceptions exception");
		} catch(Exception e) {
			System.out.println("I catched the exception");
		}
		finally{
			//This block is executed irrespective of exception thrown or not.
			System.out.println("Delete Cookies");
		}
	}

}
