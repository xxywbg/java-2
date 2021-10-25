package hello;

import java.util.Scanner;

public class java3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-,y-coordinates, and radius:  ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		
		
		System.out.print("Enter circle1's center x-,y-coordinates, and radius:  ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double r2=input.nextDouble();
		
		
		double n1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))+r2;
		
		double n2=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))-r2;
		
		if(n1<r1) {
			System.out.print("clrcle2 is inside circle1");
		}
		else if(n2>r1) {
			System.out.print("circle2 does not overlap circle1");
		}
		else {
			System.out.print("circle2 overlaps circle1");
		}
	}

}
