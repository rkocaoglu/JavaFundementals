package ifelse_structure;

import java.util.Scanner;

public class IfElseStructure {

	public static void main(String[] args) {
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("İsminiz Nedir?");
		String isim = okuyucu.next();
		System.out.println("Merhaba " + isim);
		System.out.println("Yaşınız Kaç");
		int yas = okuyucu.nextInt();
		System.out.println("Şanslı sayınız:");
		int harfSayisi = isim.length();
		int sansliSayi = 0;
		if (yas < 15) {
			sansliSayi = (harfSayisi * yas) % 10;
		} else if (yas < 20) {
			sansliSayi = (yas * yas - harfSayisi) % 10;
		} else if (yas < 40) {
			sansliSayi = (harfSayisi - yas) % 10;
		} else if (yas < 60) {
			sansliSayi = (yas + harfSayisi) % 10;
		} else {
			sansliSayi = (harfSayisi * 5 - yas) % 10;
		}
		System.out.print(sansliSayi);
	}
}
