package loops;

public class Loops {

	public static void main(String[] args) {
		System.out.println("----For Döngüsü---");
		for(int i=0;i<=10;i++) {
			System.out.println("i:"+i);
		}
		System.out.println("----While Döngüsü---");
		int sayi=5;
		while (sayi<15) {
			System.out.println(sayi);
			sayi = sayi + 5;
		}
		
		System.out.println("---- Do While Döngüsü---");
		int degisken=35;
		do {
			System.out.println(degisken);
			degisken++;
		}while(degisken!=35);

	}

}
