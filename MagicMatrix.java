package by.array.array.main;

public class MagicMatrix {
	public static int[][] magicMatrix (int n) {

		if (n % 2 != 0) {
			return MagicOddMatrix.magicOddMatrix(n);
		}
		if (n % 4 != 0) {
			return MagicEvenOddMatrix.magicEvenOddMatrix(n);
		}
		return MagicEvenMatrix.magicEvenMatrix(n);
	}

}
