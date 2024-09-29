//Task: Temperature Converter


package Level_1;

import java.util.Scanner;

public class Task_1 {
	
//	Celsius To Fahrenheit Convertion
	public static double C_To_F(double celsius) {
        return (celsius * 9/5) + 32;
    }
	
//	Fahrenheit To Celsius Convertion
	public static double F_To_C(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Temperature Converter");
		 System.out.println("1. Celsius to Fahrenheit");
	     System.out.println("2. Fahrenheit to Celsius");
	     System.out.print("Enter your choice (1 or 2): ");
	     int ch = sc.nextInt();
	     
	     switch(ch) {
	     case 1: 
		    	 System.out.print("Enter temperature in Celsius: ");
		    	 double celsius = sc.nextDouble();
		    	 double fahrenheit = C_To_F(celsius);
		    	 System.out.printf("%.2f°C is %.2f°F.\n", celsius, fahrenheit);
		    	 break;
	     case 2:
		    	 System.out.print("Enter temperature in Fahrenheit: ");
		         double fahrenheit1 = sc.nextDouble();
		         double celsius1 = F_To_C(fahrenheit1);
		         System.out.printf("%.2f°F is %.2f°C.\n", fahrenheit1, celsius1);
		         break;
	     default:
	    	 	System.out.println("Invalid choice. Please enter 1 or 2.");
	     }
	     sc.close();
	}

}
