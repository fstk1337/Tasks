package jc01_2020.shvaichuk.lesson07.task01;

public class Parallelepiped extends Shape {

	private double length;
	private double width;
	private double height;
	
	public Parallelepiped(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		setVolume(length * width * height);
	}
}
