package variables;

public class Variables {

	public static void main(String[] args) {
	 String metin ="Değişkenlerim";
	 System.out.println(metin);
	 
	 char firstChar = 'A';
	 System.out.println(metin+" "+firstChar); 
	 
	 int yas = 43;
	 int boy = 178;
	 System.out.println(metin+yas);
	 System.out.println(yas+boy);
	 System.out.println(metin+yas+boy);
	 
	 double kilo = 112.5;
	 System.out.println("Kilo:"+ kilo);
	 System.out.println(yas+kilo);
	 //Hatalı toplama; 
	 //int toplam1 = yas + 42.5;
	 double toplam2 = yas + 42.5; 

	}

}
