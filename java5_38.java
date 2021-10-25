package hello;

import java.util.Scanner;

public class java5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		int i=1;
		int a=0;
		while(n>0) {
			a=n%8;
			sum=sum+a*i;
			i=i*10;
			n=n/8;
			
		}
		System.out.print(sum);
	}

}
