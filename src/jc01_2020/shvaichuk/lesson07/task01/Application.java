package jc01_2020.shvaichuk.lesson07.task01;

/*
 *
 * Собираем чемодан
 *
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Реализовать в нем конструктор, в который
 * передается объем коробки, и метод add(), который принимает на вход Shape и кладет в коробку.
 * Нужно добавлять новые фигуры до тех пор, пока для них хватает места в Box (будем считать только объём, игнорируя форму.
 * Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 * Все сущности должны являться наследниками класса Shape.
 * Параллелепипед - прямоугольный
 *
 */

public class Application {

	public static void main(String[] args) {
		Box box = new Box(10_000);
		
		Cylinder cylinder = new Cylinder(10, 20);
		System.out.println(cylinder.getVolume());
		System.out.println(box.add(cylinder));
		
		Parallelepiped ppd = new Parallelepiped(3, 4, 5);
		System.out.println(ppd.getVolume());
		System.out.println(box.add(ppd));
		
		Pyramid pyramid = new Pyramid(20, 3);
		System.out.println(pyramid.getVolume());
		System.out.println(box.add(pyramid));
		
		Sphere sphere = new Sphere(10);
		System.out.println(sphere.getVolume());
		System.out.println(box.add(sphere));
	}
}
