package hello;

import java.util.Scanner;

public class java5_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		for(int i=1;i<=2;i++) {
			int a=year-1;
			int h=(1+2*(i+12)+3*((i+12)+1)/5+a+a/4-a/100+a/400)%7;
			switch(h)
		    {
		    case 0: System.out.println(i+" 1,"+year+"is"+"����һ"); break;
		    case 1: System.out.println(i+" 1,"+year+"is"+"���ڶ�"); break;
		    case 2: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    case 3: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    case 4: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    case 5: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    case 6: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    }
			
		}
		for(int i=3;i<=12;i++) {
			
			int h=(1+2*(i)+3*((i)+1)/5+year+year/4-year/100+year/400)%7;
			switch(h)
		    {
		    case 0: System.out.println(i+" 1,"+year+"is"+"����һ"); break;
		    case 1: System.out.println(i+" 1,"+year+"is"+"���ڶ�"); break;
		    case 2: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    case 3: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    case 4: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    case 5: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    case 6: System.out.println(i+" 1,"+year+"is"+"������"); break;
		    }
			
		}
		
	}

}
