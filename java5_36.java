package hello;

import java.util.Scanner;

public class java5_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String a=input.next();
		System.out.print("The ISBN-10 number is ");
		int ans=0;
		for(int i=0;i<a.length();i++) {
			ans=ans+(a.charAt(i)-'0')*(i+1);
		}
		if((ans%11)==10) {
			a=a+(char)('X');
		}
		else {
			a=a+(char)(ans%11+'0');
		}
		
		
		System.out.println(a);
	}

}
