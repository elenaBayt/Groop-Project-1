package GroopProject;

public class Task2 {

	public static void main(String[] args) {
		
		
		int [][] arr3= {
				{10,11,12,13,14,15,16},
				{23,24,25,26,27}
		};
		
		for (int i=0; i<arr3.length; i++) {
			for (int j=0; j<arr3[i].length; j++) {
				if (arr3[i][j]%2==0) { 
				
					System.out.println(arr3[i][j]);
				
				}
			}
			

	}

}}
