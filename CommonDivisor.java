package edu.pasadena.cs.cs03b;
import java.util.Scanner;
public class CommonDivisor {

	public static void main(String[] args) {
		// TODO: add code to read two integers from the user and print their GCD
				Scanner input = new Scanner(System.in);
				String choose = "";
				int gcd = 0;
		        int Num1, Num2, Num3;
		
		do {
			do{
				System.out.println("Enter 1 to calculate the Gcd of 2 integers, and enter 2 to calculate the Gcd of 3 integers.");
				choose = input.next();
			}while(!choose.equals("1") && !choose.equals("2"));
            System.out.print("Enter first integer: ");
            Num1 = input.nextInt();
            System.out.print("Enter second integer: ");
            Num2 = input.nextInt();
			gcd = gcd(Num1, Num2);
			if (choose.equals("1")) {
				System.out.println("The greatest common divisor for " + Num1 + " and " + Num2 + " is " + gcd);
			} else if (choose.equals("2")) {
				System.out.print("Enter third integer: ");
				Num3 = input.nextInt();
            	gcd = gcd(Num1, Num2, Num3);
				System.out.println("The greatest common divisor for " + Num1 + " and " + Num2 + " and " + Num3 +" is " + gcd);
			}
            	System.out.print("Do you want to find GCD for another pair of numbers? (Y/N): ");
        } while (input.next().equalsIgnoreCase("Y"));

		System.out.println("Thanks for using, byebye! ");
        input.close();
    }
	
	public static int gcd(int num1, int num2) {
		int gcd = 1;
		// TODO: add code to compute the GCD of num1 and num2; use of Debugger to assert your variable states is required
		if (num2 == 0) {
            gcd =  num1;
        } else {
            gcd =  gcd(num2, num1 % num2);
        }
		return gcd;
	}

	// TODO: enhance for GCD on 3 numbers
	public static int gcd(int num1, int num2, int num3) {
		int gcd = gcd(gcd(num1, num2), num3);
		return gcd;
	}
}
