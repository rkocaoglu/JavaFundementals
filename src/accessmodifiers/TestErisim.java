package accessmodifiers;

public class TestErisim {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Erişebildiğim değişkenler" 
		+ test.düz 
		+ " " 
		+ test.herkese 
		+ " " 
		+ test.korumalı);

	}

}
