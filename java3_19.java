package hello;

import java.util.Scanner;

public class java3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������һ�������εı�a�� ");
		int a=input.nextInt();
		System.out.print("������һ�������εı�b�� ");
		int b=input.nextInt();
		System.out.print("������һ�������εı�c�� ");
		int c=input.nextInt();
		if((a+b<=c)|(a+c<=b)|(b+c<=a)) {
			System.out.print("����ֵ���Ϸ�");
			
		}
		else {
			int sum=a+b+c;
			System.out.print(sum);
		}
	}

}
