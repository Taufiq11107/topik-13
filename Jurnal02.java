package org.d3ifcool.ima13;
import java.util.Scanner;

public class Jurnal02 {

	private static String tukarHuruf (String x) {
		String output = "";
		switch (x.length()%5) {
			case 0 :
				output = x.replaceAll("[aeiouAEIOU]", "a");
				break;
			case 1 :
				output = x.replaceAll("[aeiouAEIOU]", "e");
				break;
			case 2 :
				output = x.replaceAll("[aeiouAEIOU]", "i");
				break;
			case 3 :
				output = x.replaceAll("[aeiouAEIOU]", "o");
				break;
			case 4 :
				output = x.replaceAll("[aeiouAEIOU]", "u");
				break;
		}
		return output;
	}
	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		
		String lirikLagu = input.nextLine();
		
		System.out.println(tukarHuruf(lirikLagu));
	}
}
