   package com.bridgelabz.regularexpressions;
  
   import java.util.Scanner;

   public class UserRegistration {
   	Scanner scan = new Scanner(System.in);

   	// UC-1
   	// Function to verify FirstName and print whether it is valid or not:

   	public void verifyFirstName() {
   		System.out.println("Enter First name:");
   		String firstName = scan.next();
   		if (firstName.matches("^[A-Z]{1}[a-z]{2,}$") == true)
   			System.out.println("It is a valid First Name");
   		else
   			System.out.println("It is an invalid First Name");
   		System.out.println("\n");
   	}

   	// UC-2
   	// Function to verify LastName and print whether it is valid or not:

   	public void verifyLastName() {
   		System.out.println("Enter Last name:");
   		String lastName = scan.next();
   		if (lastName.matches("^[A-Z]{1}[a-z]{2,}$") == true)
   			System.out.println("It is a valid Last Name");
   		else
   			System.out.println("It is an invalid Last Name");
   		System.out.println("\n");
   	}

   	// UC-3
   	// Function to verify Email and print whether it is valid or not:

   	public void verifyEmail() {
   		System.out.println("Enter Email ID:");
   		String email = scan.next();
   		if (email.matches("[A-Za-z0-9._+%-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,4}"))
   			System.out.println("It is a valid Email ID");
   		else
   			System.out.println("It is an invalid Email ID");
   		System.out.println("\n");
   	}

   	// UC-4
   	// Function to verify Mobile Number and print whether it is valid or not:

   	public void verifyMobileNumber() {
   		System.out.println("Enter Mobile Number:");
   		String mobileNumber = scan.next();
   		if (mobileNumber.matches("^[0-9]{2}[-][0-9]{10}$") == true)
   			System.out.println("It is a valid Mobile Number");
   		else
   			System.out.println("It is an invalid Mobile Number");
   		System.out.println("\n");
   	}

   	// UC-5
   	// Function to verify if there are minimum 8 characters in password:

   	public void verifyPassword() {
   		System.out.println("Enter Password:");
   		String password = scan.next();
   		if (password.matches("[[a-zA-Z0-9!@#$%^&*]+]{8,}") == true)
   			System.out.println("It is a valid Password");
   		else
   			System.out.println("It is an invalid Password");
   	}

   	public static void main(String[] args) {

   		System.out.println("Welcome to User Registration problem:");
   		UserRegistration object = new UserRegistration();
   		object.verifyFirstName();
   		object.verifyLastName();
   		object.verifyEmail();
   		object.verifyMobileNumber();
   		object.verifyPassword();

   	}

   	   }