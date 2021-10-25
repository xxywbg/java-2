package hello;

import java.util.Arrays;
import java.util.Scanner;

public class java5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] x=new double[10];
		for(int i=0;i<10;i++) {
			x[i]=input.nextDouble();
			//System.out.println(x[i]);
		}
		double sum1=0;
		double sum2=0;
		for(int i=0;i<10;i++) {
			sum1=sum1+x[i];
			sum2=sum2+x[i]*x[i];
		}
		double mean=sum1/10;
		double s=Math.sqrt((sum2-(sum1*sum1)/10)/9);
		System.out.println("The mean is "+mean);
		System.out.printf("The standard deviation is "+"%.5f",s);
	}
}
