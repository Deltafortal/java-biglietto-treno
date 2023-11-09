package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		
		// Starting values
		double standard_price = 0.21; //TODO CHANGE Value to 0.21
		int under_age_sales = 20;
		int over_65_sales = 40;
		
		
		
		Scanner in = new Scanner(System.in);
		
		// Age Selector
		System.out.println("Quanti anni hai? ");
		final String SELECTED_AGE = in.nextLine();
		
		// Km Selector
		System.out.println("Quanti chilometri vuoi percorrere? ");
		final String SELECTED_KM = in.nextLine();
		
		
		// Convert string to numbers
		int age = Integer.valueOf(SELECTED_AGE);
		int km = Integer.valueOf(SELECTED_KM);
		
		
		
		// Calculating price
		double price = km * standard_price;
		double sales = 0;
		
		if(age <= 18) {
			
			sales = (price * under_age_sales) / 100;
			
		} else if(age >= 65) {
			
			sales = (price * over_65_sales) / 100;
			
		}
		
		price -= sales;
		
		
		
		
		// Sending price
		System.out.println("\n -------------------------- \n");
		System.out.print("Il prezzo del tuo biglietto è: ");
		System.out.print(price);
	}
}
