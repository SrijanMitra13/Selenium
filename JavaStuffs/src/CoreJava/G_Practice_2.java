package CoreJava;

public class G_Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = {{2,4,5},{3,0,7},{1,10,9}};
		
		int min =abc[0][0];
		int minColumn = 0;
		
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(abc[i][j] < min) {
					min = abc[i][j];
					minColumn =j;
				}
			}
		}
		System.out.println(min);
		
		int max=abc[0][minColumn];
		int k = 0;
		while(k<3) {
			if(abc[k][minColumn]>max) {
				max = abc[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
		
	}

}
