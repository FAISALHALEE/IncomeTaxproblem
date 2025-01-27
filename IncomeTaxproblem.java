import java.util.*;
public class IncomeTaxproblem {
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount to calculate your applicable tax payment: ");
		int income = sc.nextInt();
		int tax;

		if(income < 500000){
			tax = 0;
		}
		else if(income >= 500000 && income < 1000000){
			tax = (int) (income * 0.2);
		}
		else{
			tax = (int) (income * 0.3);
		}
		System.out.println("You has to pay the tax amount is: " + tax);
        // your code goes here
    }
}
