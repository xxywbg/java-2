package hello;

import java.util.Scanner;

public class java3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year£º ");
		int year=input.nextInt();
		System.out.print("Enter month:1-12£º ");
		int m=input.nextInt();
		System.out.print("Enter the day of the month:1-31£º ");
		int q=input.nextInt();
		if(m==1|m==2) {
			m=m+12;
			year=year-1;
		}
		int j=(int)year/100;
		int k=year%100;
		
		
		int h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		if(h==0) {
			System.out.print("Day of the week is Saturday");
		}
		if(h==1) {
			System.out.print("Day of the week is Sunday");
		}
		if(h==2) {
			System.out.print("Day of the week is Monday");
		}
		if(h==3) {
			System.out.print("Day of the week is Tuesday");
		}
		if(h==4) {
			System.out.print("Day of the week is Wednesday");
		}
		if(h==5) {
			System.out.print("Day of the week is Thursday");
		}
		if(h==6) {
			System.out.print("Day of the week is Friday");
		}
		
		
	}

}
