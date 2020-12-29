package org.d3ifcool.ima13;
import java.util.Scanner;
public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		ftc();
    	System.out.println();
	}
    private static void	ftc(){
		Scanner input = new Scanner(System.in);
		double r1 = input.nextDouble();
		double hasil1 = ((r1 - 32) * 5) /9;
		double r2 = input.nextDouble();
		double hasil2 = ((r2 - 32) * 5) /9;
		double r3 = input.nextDouble();
		double hasil3 = ((r3 - 32) * 5) /9;
		System.out.printf("%.1f %.1f %.1f", hasil1, hasil2, hasil3);
	}
}
