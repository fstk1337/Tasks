package jc01_2020.shvaichuk.lesson07.task01;

public class Pyramid extends Shape {

	private double side;
	private double height;
	
	public Pyramid(double side, double height) {
		this.side = side;
		this.height = height;
		calculateVolume();
		printVolume();
	}
    
    @Override
    public void calculateVolume() {
		setVolume(side * height / 3);
    }
}
