package main;

import java.util.Scanner;

import entities.CharsetGenerator;
import entities.PasswordGenerator;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Password generator:");
		
		System.out.print("With numbers? (true/false) ");
		boolean withNumbers = Boolean.parseBoolean(scan.nextLine());
		System.out.print("With uppercase letters? (true/false) ");
		boolean withUpper = Boolean.parseBoolean(scan.nextLine());
		System.out.print("With lowercase letters? (true/false) ");
		boolean withLower = Boolean.parseBoolean(scan.nextLine());
		System.out.print("With special characters? (true/false) ");
		boolean withSpecialChar = Boolean.parseBoolean(scan.nextLine());
		System.out.print("Enter the password size? ");
		Integer passLength = scan.nextInt();
		
		CharsetGenerator charGen = new CharsetGenerator();
		PasswordGenerator passGen = new PasswordGenerator(
				withNumbers, 
				withUpper,
				withLower,
				withSpecialChar,
				passLength
		);
		
		String password = passGen.generate(charGen);
		System.out.println("Your new password is:");
		System.out.println(password);

		scan.close();
		
	}

}
