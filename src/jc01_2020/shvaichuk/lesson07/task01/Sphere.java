package jc01_2020.shvaichuk.lesson07.task01;

public class Sphere extends Shape {

	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
		calculateVolume();
		printVolume();
	}
    
    @Override
    public void calculateVolume() {
		setVolume(4 * Math.PI * Math.pow(radius, 3) / 3);
    }
}
