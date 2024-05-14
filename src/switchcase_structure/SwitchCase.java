package switchcase_structure;

public class SwitchCase {
	
	public static void main(String[] args) {
		int kontrol = 6;
		switch (kontrol) {
		case 1: System.out.println("Bir");
		break;
		case 2: System.out.println("İki");
		break;
		case 3: System.out.println("Üç");
		break;
		case 4: System.out.println("Dört");
		break;
		case 5: System.out.println("Beş");
		default:
			System.out.println("Default:"+ kontrol);
		}
	}

}
