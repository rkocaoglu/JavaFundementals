package arrays;

import java.util.Iterator;

public class MyArray {

	public static void main(String[] args) {
		int[] sayiDizisi = new int[10];
		sayiDizisi[0] = 3;
		sayiDizisi[1] = 4;
		sayiDizisi[8] = 9;

		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.println(sayiDizisi[i]);
		}

		String[] yaziDizisi = { "Mustafa", "Faruk", "Güllü" };
		// Çok Boyutlu Diziler
		int[][] ikiBoyutlu = new int[3][10];
		ikiBoyutlu[2][7] = 35;
		ikiBoyutlu[0][0] = 54;
		ikiBoyutlu[1][3] = 9;

		for (int i = 0; i < ikiBoyutlu.length; i++) {
			for (int j = 0; j < ikiBoyutlu[0].length; j++) {
				System.out.print(ikiBoyutlu[i][j]+" ");
			}
			System.out.println();
		}

	}

}
