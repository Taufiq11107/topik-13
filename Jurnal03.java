package org.d3ifcool.ima13;
import java.util.*;

public class Jurnal03 {

	private static double luasKerucut(int jari_jari, int tinggi){
		double akar = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jari_jari, 2));
		double dalamKurung = jari_jari + akar;
		double luas = Math.PI * jari_jari * dalamKurung;

		return luas;
	}
	
	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Locale.setDefault(new Locale("en", "US"));
		Scanner in = new Scanner(System.in);

		int jari_jari = in.nextInt();
		int tinggi = in.nextInt();

		String output = String.format("%.3f", luasKerucut(jari_jari, tinggi));
		System.out.println(output);
	}
}
