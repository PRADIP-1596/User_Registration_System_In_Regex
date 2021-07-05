   package com.bridgelabz.regularexpressions;
	import java.util.Scanner;

	public class UserRegistration {
		
//Scanner Class Declared
		Scanner scan = new Scanner(System.in);

//Declared Method
		public void verifyFirstName() {
			System.out.println("Enter First name:");
			String firstName = scan.next();
//Check The Conditions 
			if (firstName.matches("^[A-Z]{1}[a-z]{2,}$") == true)
				System.out.println("It is a valid First Name");
			else
				System.out.println("It is an invalid First Name");
		}

		public static void main(String[] args) {
//Print SOP MSG
			System.out.println("Welcome to User Registration problem:");
			
			//Calling Objects 
			UserRegistration object = new UserRegistration();
			object.verifyFirstName();
		}

	}

