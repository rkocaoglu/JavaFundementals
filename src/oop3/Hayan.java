package oop3;

abstract class Hayan implements Boy {
	private int boy;
	private int kilo;

	public abstract boolean canlimi();

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

}
