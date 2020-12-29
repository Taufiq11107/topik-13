package org.d3ifcool.ima13;
import java.util.Scanner;

public class Jurnal01 {
	
	private static String sapaanSaat (int jam){
		if (jam >= 6 && jam <= 11) {
			return "pagi";
		}else if (jam >= 12 && jam <= 14) {
			return "siang";
		}else if (jam >= 15 && jam <= 17) {
			return "sore";
		}else{
			return "malam";
		}
	}

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		String nama1 = input.nextLine();
		String nama2 = input.nextLine();
		int jam = input.nextInt();

		System.out.println("Halo, " + nama1 + ". Selamat " + sapaanSaat(jam) + ".");
		System.out.println("Halo, " + nama2 + ". Selamat " + sapaanSaat(jam) + ".");
	
	
	}
}
