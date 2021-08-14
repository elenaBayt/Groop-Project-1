package GroopProject;

public class Task5 {

	public static void main(String[] args) {
		
		int x=7;
		int counter=0;
		
		for (int i=2; i<=x-1; i++) {
			if (x%i==0) {
				counter++;
			}
		}
		if (counter !=0) {
			System.out.println("Not prime");
		} else {
			System.out.println("prime");
		}
		
		
	}

}
