package jc01_2020.shvaichuk.test01;

/*
*
* Написать программу для умножения произвольных матриц. Вывести в консоль матрицу А, матрицу В и результирующую матрицу С.
*
* Теория:
* 1) количество строк матрицы А должно быть равно количеству столбцов матрицы В
* 2) Результатом умножения матрицы Am×n на матрицу Bn×k будет матрица Cm×k такая, что элемент матрицы C,
* стоящий в i-той строке и j-том столбце (Сij), равен сумме произведений элементов i-той строки матрицы A на
* соответствующие элементы j-того столбца матрицы B.
*
*
*    A
* 1  2  3
* 4	 5	6
* 7	 8	9
*
*    B
* 1  2  3  4
* 4  3  2  1
* 1  2  3  4
*
* С = A * B
* 12  14  16  18
* 30  35  40  45
* 48  56  64  72
*
*/

import java.util.Scanner;

public class MatrixMultiplication {

	static int[][] a;
	static int[][] b;
	static int[][] c;
	static int rowsA;
	static int columnsA;
	static int rowsB;
	static int columnsB;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Кол-во строк матрицы А
		rowsA = scanner.nextInt();
//		Кол-во столбцов матрицы А
		columnsA = scanner.nextInt();
//		Кол-во строк матрицы B
		rowsB = scanner.nextInt();
//		Кол-во столбцов матрицы B
		columnsB = scanner.nextInt();

		a = new int[rowsA][columnsA];
		b = new int[rowsB][columnsB];
		c = new int[rowsA][columnsB];

		// Заполнить массивы А и В с помощью scanner.nextInt(). Тестовые данные заполняются построчно для каждого массива
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
		// Вывести в консоль матрицу А
        printMatrix(a);
		// Вывести в консоль матрицу В
        printMatrix(b);
		// Перемножить матрицы
        c = productMatrixes(a, b);
		// Вывести результирующую матрицу по одному значению через пробел (порядок вывода - построчно)
        printMatrix(c);
	}

	private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    private static int[][] productMatrixes(int[][] matrixA, int[][] matrixB) {
	    int[][] result = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
	    return result;
    }
}
