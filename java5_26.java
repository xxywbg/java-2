package hello;

import java.util.Scanner;

public class java5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double e=2;
		double j=1;
		for(int i=2;i<=n;i++) {
			j=j*i;
			
			e=e+1/j;
		}
		System.out.print(e);
	}

}
