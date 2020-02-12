package jc01_2020.shvaichuk.lesson07.task02;

/*
*
* Реализовать валидацию хода шахматной фигуры
*
* Даны шахматные фигуры, которые должны являться наследниками класса Figure. В конструктор передается начальное положение
* фигуры в виде char e, int 2 (char g, int 8 и т.д.). Реализовать для каждой фигуры метод moveTo(char c, int i), который
* вернет логическое значение доступен ли такой ход для этой фигуры. Постарайтесь максимально использовать принципы ООП.
* Не добавляйте новые поля в классах-фигурах
* Ссылку на созданный объект фигуры в методе main хранить в переменной типа Figure
*
*/

public class Application {

	public static void main(String[] args) {
		Figure bishop = new Bishop('c', 1);
		System.out.println(bishop.moveTo('g', 5));
		System.out.println(bishop.moveTo('d', 3));
		System.out.println(bishop.moveTo('b', 2));
		
		
	}
}
