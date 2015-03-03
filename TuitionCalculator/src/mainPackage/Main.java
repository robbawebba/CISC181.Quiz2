package mainPackage;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double initialCost, rate, totalCost;
		
		// get the initial tuition cost
		System.out.print("What is the initial tuition cost?");
		initialCost = input.nextDouble();
		// get the percentage increase
		System.out.print("What is the percentage increase in tuition each year?");
		rate = input.nextDouble()/100;

		input.close(); // closes the scanner
		
		totalCost = initialCost; 
		// variable to hold the working cost each iteration
		double workingCost = initialCost; 
		
		for (int i = 0; i < 3; i++) {
			workingCost += rate*workingCost;
			totalCost += workingCost;
		}
		
		System.out.printf("\nYour total tuition expense is $%.2f", totalCost);		
		
	}

}
