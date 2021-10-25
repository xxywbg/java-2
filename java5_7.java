package hello;

import java.util.Scanner;

public class java5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double n=Math.pow(1.05, 10)*10000;
		double sum=0;
		for(int i=1;i<=4;i++) {
			sum=sum+n*1.05;
		}
		System.out.println(sum);
	}

}
