package GroopProject;

public class Task8 {

	public static void main(String[] args) {
		
int [] a = {50,-40,30,-20,-10};
		
		int max1, max2;
		
		if (a[1] > a[0]) {
			max1 = a[1];
			max2 = a[0];
		} else {
			max2 = a[1];
			max1 = a[0];
		}
		
		for (int i=2; i < a.length; i++) {
			
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			} else if (a[i] > max2) {
				max2 = a[i];
			} 
			
		}
		
		System.out.println("Max 1 = " + max1);
		System.out.println("Max 2 = " + max2);

	}

}
