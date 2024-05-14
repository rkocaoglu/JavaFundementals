package function_structure;

public class Function {

	public static int toplama(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static void main(String[] args) {
		int sayi1=8, sayi2=13, cevap;
		System.out.println(sayi1+"+"+sayi2+"="+toplama(sayi1, sayi2));

	}

}
