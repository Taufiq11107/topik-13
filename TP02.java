package org.d3ifcool.ima13;
import java.util.Scanner;

public class TP02 {

	private static String hapusVokal (String x) {
		return x.replaceAll("[aeiouAEIOU]", "");
	}


	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);

		String kalimat = in.nextLine();

		System.out.println(hapusVokal(kalimat));
	}
}
