package GroopProject;

public class Task3 {

	public static void main(String[] args) {
	
		int [][] arr2= {
				{10,11,12,13},
				{23,24,25,27}
		};
		int sumOdd=0;
		int sumEven=0;
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				if (arr2[i][j]%2==0) { 
					sumEven+=arr2[i][j];
					
				}else if (arr2[i][j]%2!=0 ) {
					sumOdd+=arr2[i][j];
					
				}
			}
			System.out.println((sumEven)+" "+(sumOdd));
			
			}

	}

}
