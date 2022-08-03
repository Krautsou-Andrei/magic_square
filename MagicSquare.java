package by.array.array.main;

//Магическим квадратом порядка n называется квадратная матрица размерами nxn, составленная из 
//чисел 1,2,3..pow(n ,2) так, что суммы по каждому столбцу, строке и каждой из двух больших 
//диагоналей равны между собой. Построить такой квадрат

import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {

		int n;
		int [][] magicMatrix;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();
		
		magicMatrix = MagicMatrix.magicMatrix(n);

		for (int i = 0; i < magicMatrix.length; i++) {
			for (int j = 0; j < magicMatrix.length; j++) {

				System.out.printf("%2d |", magicMatrix[i][j]);
			}
			System.out.println();
		}
	}

	
}
