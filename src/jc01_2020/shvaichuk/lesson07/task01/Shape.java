package jc01_2020.shvaichuk.lesson07.task01;

public abstract class Shape {

	private double volume;
	
	public Shape() {
		System.out.print(getClass().getSimpleName() + " created. ");
		if (!(this instanceof Box)) {
			calculateVolume();
		}
	}

	public double getVolume() {
		return volume;
	}
	
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public abstract void calculateVolume();
	
	public void printVolume() {
		System.out.println(String.format("%s's volume = %.2f", getClass().getSimpleName(), volume));
	}
}
