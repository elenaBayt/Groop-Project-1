package GroopProject;

public class Task7 {

	public static void main(String[] args) {
		
		int[]arr= {10,-2,16,43};
		int largest=arr[0];
		int least=arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>largest) {
				largest=arr[i];
			} else if (arr[i]<least) {
				least=arr[i];
			}
		}
		System.out.println("Largest number in array= "+largest);
		System.out.println("Least number in array= "+least);

	}

}
