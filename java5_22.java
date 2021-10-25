package hello;
import java.util.Scanner;
public class java5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Loan Amout: ");
        double loan = input.nextDouble();
        System.out.print("Number of Year: ");
        double year = input.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble();
        rate=rate/100;
        double mon_loan = loan * (rate / 12.0) / (1.0 - 1.0 / Math.pow((1.0 + rate / 12.0), year * 12.0));
        System.out.printf("Monthly Payment: %.2f\n", mon_loan);
        System.out.printf("Total Payment: %.2f\n", mon_loan * year * 12);
        
        
        System.out.println("Payment#\tInterest\tPrincipal\tBalance\n");
        
        for (int i = 1; i <= year*12; i++) {
            double interest=rate/12*loan;
            double principal=mon_loan-interest;
            loan=loan-principal;
        	System.out.print(i);
        	System.out.printf("\t\t%.2f",interest);
        	System.out.printf("\t\t%.2f",principal);
        	System.out.printf("\t\t%.2f",loan);
        	System.out.println("");
            
        }
	}

}
