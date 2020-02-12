package jc01_2020.shvaichuk.lesson07.task01;

public class Box extends Shape {
	
	public Box(double volume) {
		setVolume(volume);
	}
	
	public boolean add(Shape shape) {
		if (this.getVolume() >= shape.getVolume()) {
			setVolume(this.getVolume() - shape.getVolume());
			return true;
		} else return false;
	}		
}
