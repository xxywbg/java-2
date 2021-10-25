package hello;

import java.util.Random;

public class java3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("The card you picked is ");
		Random rand = new Random();
	    int m = rand.nextInt(13) + 1;
	    int n = rand.nextInt(4) + 1;
	    if (m==1) {
	    	System.out.print("Aca");
	    }
	    else if (m==2) {
	    	System.out.print("2");
	    }
		else if (m==3) {
			System.out.print("3");  	
		}
		else if (m==4) {
			System.out.print("4");
		}
		else if (m==5) {
			System.out.print("5");
		}
		else if (m==6) {
			System.out.print("6");
		}
		else if (m==7) {
			System.out.print("7");
		}
		else if (m==8) {
			System.out.print("8");
		}	    
		else if (m==9) {
			System.out.print("9");
		}
		else if (m==10) {
			System.out.print("10");
		}
		else if (m==11) {
			System.out.print("Jack");
		}
		else if (m==12) {
			System.out.print("Queen");
		}
		else if (m==13) {
			System.out.print("King");
		}
		
	    
	    if(n==1) {
	    	System.out.print(" of Clubs");
	    }
	    else if (n==2) {
	    	System.out.print(" of Diamonds");
	    }
	    else if (n==3) {
	    	System.out.print(" of Hearts");
	    }
	    else if (n==4) {
	    	System.out.print(" of Spades");
	    }
	    
	}

}
