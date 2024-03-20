package chap05;

public class quiz0213 {

	public static void main(String[] args) {
//		1 x 1 x 1 = 1
//		1 x 1 x 2 = 2
//		...
//		9 x 9 x 8 = 648
//		9 x 9 x 9 = 729

		for (int k = 1; k <= 9; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = 1; i <= 9; i++) {
					System.out.println(k + "x" + j + "x" + i + "=" + (k * j * i ));
				}
			}
		}

	}

}
