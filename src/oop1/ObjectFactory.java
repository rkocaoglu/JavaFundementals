package oop1;

public class ObjectFactory {

	public static void main(String[] args) {
		Pen firstPen = new Pen();
		String message = "İlk kalem üretildi";
		firstPen.color = "Pembe";
		firstPen.height = 10;
		firstPen.writeMessgae(message);
		
		Pen secondPen = new Pen();
		secondPen.color="Mavi";
		secondPen.height=8;
		secondPen.writeMessgae(secondPen.color+" "+secondPen.height);

	}

}
