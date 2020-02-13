package jc01_2020.shvaichuk.lesson07.task01;

public class Sphere extends Shape {

	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
		setVolume(4 * Math.PI * Math.pow(radius, 3) / 3);
	}
}
