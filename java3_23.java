package hello;

import java.util.Scanner;

public class java3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		if(Math.abs(a)>5|Math.abs(b)>2.5) {
			System.out.print("Point("+a+", "+b+") is out in the circle");
		}
		else {
			System.out.print("Point("+a+", "+b+") is in the circle");
		}
	}

}
