package hello;

import java.util.Random;
import java.util.Scanner;

public class java3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
	    int m = rand.nextInt(899) + 100;
	    int[] x=null;
	    int[] a=null;
	    x = new int[3];
	    a = new int[3];
	    x[0]=m/100;
	    x[1]=(m/10)%10;
	    x[2]=m%10;
	    
	    //System.out.print(m);
	    System.out.print("请输入一个三位数： ");
	    
	    int y=input.nextInt();
	    a[0]=y/100;
	    a[1]=(y/10)%10;
	    a[2]=y%10;
	    
	    int i,j,sum=0;
	    for(i=0;i<=2;i++) {
	    	if(a[i]!=x[i]) {
	    		break;
	    	}
	    }
	    if(i==3) {
	    	System.out.print("奖金是10000美元");
	    }
	    else {
	    	for(i=0;i<=2;i++) {
	    		for(j=0;j<=2;j++) {
		    		if(a[i]==x[j]) {
		    			sum += 1;
		    			x[j]=-1;
		    			break;
		    		}
	    		}
	    	}
	    	System.out.print("奖金是"+sum*1000+"美元");	
	    }
	}

}
