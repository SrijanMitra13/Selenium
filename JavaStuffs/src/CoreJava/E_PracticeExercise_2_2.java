package CoreJava;

public class E_PracticeExercise_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		for(int i =1;i<=4;i++) {
//			System.out.println();
			for(int j =1;j<i+1; j++) {
				System.out.print(j);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}

	}

}

/*
 1
 1	2
 1	2	3
 1	2	3	4
 */