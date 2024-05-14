package oop2;

public class Vehicle implements Engine {

	int numberOfSeats;
	int numberOfWheels;

	@Override
	public void start() {
		System.out.println("Araç çalışıyor");
	}

	@Override
	public void stop() {
		System.out.println("Araç durdu");

	}
}
