package by.array.array.main;

public class MagicOddMatrix {
	public static int[][] magicOddMatrix(int n) {

		int[][] a = new int[n][n];
		int i = 0;
		int j = n / 2;

		for (int k = 1; k <= Math.pow(n, 2); k++) {

			a[i][j] = k;

			if (k % n == 0) {
				i++; // если число кратно n спускаемся на одну строку вниз
			} else {// если число не кратно n поднимаемся на одну строку вверх и на один столбец
					// влево
				i--;
				j--;
				if (i < 0) {
					i = n - 1;// если вышли за верхний предел, спускаемся в низ матрицы по столбцу
				}
				if (j < 0) {
					j = n - 1;// если вышли за предел строки, возвращиемся в конец строки
				}

			}
		}

		return a;
	}
}
