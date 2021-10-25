package hello;

import java.util.Scanner;

public class java3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个三角形的边a： ");
		int a=input.nextInt();
		System.out.print("请输入一个三角形的边b： ");
		int b=input.nextInt();
		System.out.print("请输入一个三角形的边c： ");
		int c=input.nextInt();
		if((a+b<=c)|(a+c<=b)|(b+c<=a)) {
			System.out.print("输入值不合法");
			
		}
		else {
			int sum=a+b+c;
			System.out.print(sum);
		}
	}

}
