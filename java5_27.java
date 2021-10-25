package hello;

import java.util.Scanner;

public class java5_27 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a=0;
		for(int i=101;i<=2100;i++) {
			
			int n = 0;
			
			if((i%4==0 & i%100!=0) | (i%400==0)) {
				n = 1;
				a++;
			}
			if(n==1&a%10!=0) {
				
				System.out.print(i+" ");
			}
			else if(n==1&a%10==0) {
				System.out.print(i+"\n");
			}
		}
	}

}
