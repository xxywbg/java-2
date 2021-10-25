package hello;

import java.util.Random;

public class java5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int m = rand.nextInt(9) + 1;
		int n = rand.nextInt(9) + 1;
		while(m==n) {
			n = rand.nextInt(9) + 1;
		}
		System.out.print(m);
		
		System.out.print(n);
	}

}
