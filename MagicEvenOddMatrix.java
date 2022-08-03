package by.array.array.main;

public class MagicEvenOddMatrix {
	public static int[][] magicEvenOddMatrix(int n) {

		int[][] a = new int[n][n];
		int[][] temp = MagicMatrix.magicMatrix(n / 2);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i < a.length / 2 && j < a[i].length / 2) {
					a[i][j] = temp[i][j];// записываем значения в первый квадрат равный n/2 (от 1 до 9)
				}

				if (i < a.length / 2 && j >= a[i].length / 2) {
					a[i][j] = temp[i][j - n / 2] + 2 * (int) Math.pow(n / 2, 2);// записываем значения во второй квадрат
																				// равный n/2 (от 19 до 27)
				}

				if (i >= a.length / 2 && j < a[i].length / 2) {
					a[i][j] = temp[i - n / 2][j] + 3 * (int) Math.pow(n / 2, 2);// записываем значения в третий квадрат
																				// равный n/2 (от 28 до 36)
				}

				if (i >= a.length / 2 && j >= a[i].length / 2) {
					a[i][j] = temp[i - n / 2][j - n / 2] + (int) Math.pow(n / 2, 2); // записываем значения в четвертый
																						// квадрат равный n/2 (от 10 до
																						// 18)
				}
			}
		}

		for (int j = 0; j <= 1; j++) {

			if (j == 0) {
				int index = a[0][0];
				a[0][0] = a[temp.length][0];
				a[temp.length][0] = index;
				index = a[temp.length - 1][0];
				a[temp.length - 1][0] = a[a.length - 1][0];
				a[a.length - 1][0] = index;// меняем местами элементы в матрице

			}

			if (j == 1) {
				for (int i = 1; i <= temp.length - 2; i++) {
					int index = a[i][j];
					a[i][j] = a[temp.length + i][j];
					a[temp.length + i][j] = index;
				}

			}
		}

		int move = 0;

		for (int i = 6; i < n; i++) { // меняем местами столбцы, если матрица размером 10х10 и более
			if (i % 4 != 0 && i % 2 == 0) {
				move++;
			}
		}

		for (int j = temp.length - move; j <= temp.length + move - 1; j++) {
			for (int i = 0; i < temp.length; i++) {

				int index = a[i][j];
				a[i][j] = a[temp.length + i][j];
				a[temp.length + i][j] = index;
			}

		}

		return a;
	}

}
