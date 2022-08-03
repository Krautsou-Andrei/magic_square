package by.array.array.main;

public class MagicEvenMatrix {
	public static int[][] magicEvenMatrix(int n) {
		int[][] a = new int[n][n];
		int[][] temp = new int[n][n];
		int k = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = k;
				k++;
			}
		}

		k = (int) Math.pow(n, 2);

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {

				temp[i][j] = k;
				k--;
			}
		}

		int sizeTemp = 4; // делим на квадраты размерностью 4х4

		int x = 0;
		int y = 0; // движемся по квадратам

		for (int i = 0; i < Math.pow(n, 2) / 16; i++) {
			if (x == (int) Math.sqrt(Math.pow(n, 2) / 16)) { // После прохода по первому квадрату обнуляемся и
																// переходим
																// во второй
				x = 0;
				y++;
			}

			for (int j = 0; j < 4; j++) {

				a[sizeTemp * y + j][sizeTemp * x + j] = temp[sizeTemp * y + j][sizeTemp * x + j];// Главная
																									// диагональ
																									// малых
																									// квадратов
				a[sizeTemp * y + j][sizeTemp * x + sizeTemp - 1 - j] = temp[sizeTemp * y + j][sizeTemp * x + sizeTemp
						- 1 - j]; // Вторая диагональ малых квадратов

			}
			x++;

		}
		return a;
	}

}
