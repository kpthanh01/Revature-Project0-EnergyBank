package com.revature.screens;

import java.util.Scanner;

public class HomeScreen implements Screen{
	private Scanner scan = new Scanner(System.in);

	public Screen start() {
		System.out.println("Please choose the following options");
		System.out.println("Enter 1 to View Balance");
		System.out.println("Enter 2 to Deposit Energy");
		System.out.println("Enter 3 to Withdraw Energy");
		System.out.println("Enter 4 to View Transaction History");
		String input = scan.nextLine();
		
		switch (input) {
		case "1":
			break;
			
		case "2":
			break;
			
		case "3":
			break;
			
		case "4":
			break;
			
		default:
			break;
		}
		return this;
	}

}
