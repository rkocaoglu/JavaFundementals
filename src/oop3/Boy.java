package oop3;

//interface tanımlanan tüm değişkenler ve metodlar publictir
//ayrıca değikenler final'dir.
public interface Boy {
	int degisken = 0;

	int boySantimetre();

	double boyMetre();

	default double boyKilometre() {
		return 0;
	}

	static String tanim() {
		return "Bu interface implement eden class için boy bilgileri dönülmesini garanti eder";
	}

}
