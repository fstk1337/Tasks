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
		Figure bishop = new Bishop('e', 7);
		String[] bishopFields = {"e7", "g5", "b4", "g9", "t3"};
		bishop.printTest(bishopFields);
		
		Figure rook = new Rook('f', 3);
		String[] rookFields = {"f3", "c3", "f7", "g9", "t3"};
		rook.printTest(rookFields);
		
		Figure queen = new Queen('g', 2);
		String[] queenFields = {"g2", "d5", "a2", "g9", "t3"};
		queen.printTest(queenFields);
		
		Figure king = new King('f', 7);
		String[] kingFields = {"f7", "f6", "e8", "g9", "t3"};
		king.printTest(kingFields);
		
		Figure knight = new Knight('e', 6);
		String[] knightFields = {"e6", "c7", "f4", "g9", "t3"};
		knight.printTest(knightFields);
		
		Figure pawn = new Pawn('a', 2);
		String[] pawnFields = {"a2", "a3", "a4", "g9", "t3"};
		pawn.printTest(pawnFields);
	}
}
