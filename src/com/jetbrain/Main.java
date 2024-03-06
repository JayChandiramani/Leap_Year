package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int Input_Year;
	Scanner Year= new Scanner(System.in);

	System.out.println("Please enter a year.");
	Input_Year=Year.nextInt();

	if (Input_Year % 4 == 0) {
		if (Input_Year % 100 == 0) {
			if (Input_Year % 400 == 0)
				System.out.println("The year is a leap year (it has 366 days).");
			else
				System.out.println("The year is not a leap year (it has 365 days).");
		}
		else
			System.out.println("The year is a leap year (it has 366 days).");
	}
	else
		System.out.println("The year is not a leap year (it has 365 days).");
    }
}
