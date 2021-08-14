package GroopProject;

public class Task1 {

	public static void main(String[] args) {
		
		int [][] arr= {{1,2,3,4},
				{20,30,50}};
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
				
			}
		}
		System.out.print(sum+" ");
		System.out.println();

	}

}
