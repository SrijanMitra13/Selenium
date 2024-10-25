package CoreJava;

public class E_PracticeExercise_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =3;
		int y =1;
		for(int i=1; i<4; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print(x*y);
				System.out.print("\t");
				y++;
			}
			System.out.println();
		}
	}

}

/*
3
6	9
12	15	18
*/
