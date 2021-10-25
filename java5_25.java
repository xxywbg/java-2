package hello;

import java.util.Scanner;

public class java5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double p=0;
		for(int i=1;i<=n;i++) {
			p=p+Math.pow(-1,i+1)/(2*i-1);
		}
		p=p*4;
		System.out.print(p);
	}

}
