package com.java_guide;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		try(Scanner scanner =new Scanner(System.in)){
			
			System.out.println("Enetr your date of borth as yyyy-mm-dd format");
			
			String dob = scanner.nextLine();
			
			LocalDate birthDate = LocalDate.parse(dob);

			LocalDate currentDate = LocalDate.now();
			
			Period age = Period.between(birthDate, currentDate);
			
			System.out.println("Your age is "+ age.getYears()+" years old");
		}
	}

}
