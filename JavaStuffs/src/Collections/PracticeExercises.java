package Collections;

import java.util.ArrayList;

public class PracticeExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,5,5,5,4,6,6,9,4};
	// 4 -repeated 3 times
	// 5 -repeated 3 times
	// 6 -repeated 2 times
	// 9 -repeated 1 time
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i<a.length; i++) {
			int k =0;
			if(arr.contains(a[i])==false) {
				arr.add(a[i]);
				k++;
				
				for(int j=i+1; j<a.length; j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " is repeated " + k + " times");
			}
		}
		System.out.println(arr);
		
	}

}
