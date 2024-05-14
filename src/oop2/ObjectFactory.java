package oop2;

public class ObjectFactory {

	public static void main(String[] args) {
		Car car = new Car();
		car.numberOfSeats = 5;
		car.numberOfWheels = 4;

		Bicycle bicycle = new Bicycle();
		bicycle.numberOfSeats = 1;
		bicycle.numberOfWheels = 2;

		Vehicle car2 = new Car();
		
		car.start();
		bicycle.start();
		car2.start();
		
		// İnterfacelerden Obje Üretilemez.
		// Engine engine = new Engine();
		

	}

}
