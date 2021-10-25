package hello;

import java.util.Scanner;

public class java3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-,y-coordinates, width,and height:  ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double w1=input.nextDouble();
		double h1=input.nextDouble();
		
		System.out.print("Enter r2's center x-,y-coordinates, width,and height:  ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double w2=input.nextDouble();
		double h2=input.nextDouble();
		
		double n1=Math.abs(x1-x2)+w2/2;
		double m1=Math.abs(y1-y2)+h2/2;
		double n2=Math.abs(x1-x2)-w2/2;
		double m2=Math.abs(y1-y2)-h2/2;
		if(n1<w1/2 & m1<h1/2) {
			System.out.print("r2 is inside r1");
		}
		else if(n2>=w1/2 & m2>=h1/2) {
			System.out.print("r2 does not overlap r1");
		}
		else {
			System.out.print("r2 overlaps r1");
		}
	}

}
