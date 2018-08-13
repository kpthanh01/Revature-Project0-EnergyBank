package com.revature.screens;

import java.util.Scanner;

public class LoginScreen implements Screen{
	private Scanner scan = new Scanner(System.in);

	public Screen start() {
		System.out.println("Enter a Username or type Register to create an account");
		String username = scan.nextLine();
		
		if("register".equalsIgnoreCase(username)) {
			return new RegisterUserScreen();
		}
		
		
		
		return new HomeScreen();
	}

	
}
