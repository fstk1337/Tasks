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
		System.out.println("Testing a bishop");
		
		Figure bishop = new Bishop('e', 7);
		System.out.println(bishop.moveTo('e', 7));
		System.out.println(bishop.moveTo('g', 5));
		System.out.println(bishop.moveTo('b', 4));
		System.out.println(bishop.moveTo('g', 9));
		System.out.println(bishop.moveTo('t', 3));
		
		System.out.println("Testing a rook");
		
		Figure rook = new Rook('f', 3);
		System.out.println(rook.moveTo('f', 3));
		System.out.println(rook.moveTo('c', 3));
		System.out.println(rook.moveTo('f', 7));
		System.out.println(rook.moveTo('g', 9));
		System.out.println(rook.moveTo('t', 3));
		
		System.out.println("Testing a queen");
		
		Figure queen = new Queen('g', 2);
		System.out.println(queen.moveTo('g', 2));
		System.out.println(queen.moveTo('d', 5));
		System.out.println(queen.moveTo('a', 2));
		System.out.println(queen.moveTo('g', 9));
		System.out.println(queen.moveTo('t', 3));
		
		System.out.println("Testing a king");
		
		Figure king = new King('f', 7);
		System.out.println(king.moveTo('f', 7));
		System.out.println(king.moveTo('f', 6));
		System.out.println(king.moveTo('e', 8));
		System.out.println(king.moveTo('g', 9));
		System.out.println(king.moveTo('t', 3));
		
		System.out.println("Testing a knight");
		
		Figure knight = new Knight('e', 6);
		System.out.println(knight.moveTo('e', 6));
		System.out.println(knight.moveTo('c', 7));
		System.out.println(knight.moveTo('f', 4));
		System.out.println(knight.moveTo('g', 9));
		System.out.println(knight.moveTo('t', 3));
		
		System.out.println("Testing a pawn");
		
		Figure pawn = new Pawn('a', 2);
		System.out.println(pawn.moveTo('a', 2));
		System.out.println(pawn.moveTo('a', 3));
		System.out.println(pawn.moveTo('a', 4));
		System.out.println(pawn.moveTo('g', 9));
		System.out.println(pawn.moveTo('t', 3));
	}
}
