package GroopProject;

public class Task6 {

	public static void main(String[] args) {
		
		int[] fibo=new int[10];
		
		fibo[0]=1;
		fibo[1]=1;
		
		for (int i=2; i<fibo.length; i++) {
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		for (int f:fibo) {
			System.out.println(f+" ");
		}
	

	}

}
