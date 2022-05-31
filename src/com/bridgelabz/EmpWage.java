package com.bridgelabz;

import java.util.Random;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int attendance = random.nextInt(3); // 0 or 1

		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHours = 4;
		int wagePerDay = 0;

		if (attendance == 0)
			System.out.println("Employee Absent ..");

		else if (attendance == 1)

			wagePerDay = partTimeHours * wagePerHour;

		else
			wagePerDay = fullDayHour * wagePerHour;

		System.out.println("Employee wage per Day: " + wagePerDay);
	}
}
