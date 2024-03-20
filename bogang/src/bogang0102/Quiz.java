package bogang0102;

public class Quiz {

	public static void main(String[] args) {

		// 문제 1-1
		String s = "안녕하세요"; // 내부적으로 배열을 이용하는 class
		char[] arr = new char[5]; // length 메소드를 이용함

		// 여기부터
		for (int i = 0; i < s.length(); i++) { // 문자열의 길이
			arr[i] = s.charAt(i); // 타입변환
		}
		// 여기까지 수정

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

		// 문제 1-2
		// a는 영어, 가는 한글 출력하기
		String[][] a = { { "a", "영어" }, { "가", "한글" } };

		System.out.println(a[0][0] + "는 " + a[0][1]);
		System.out.println(a[1][0] + "는 " + a[1][1]);

		System.out.println("==================");

		// 문제 1-3
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int total = 0;

//		arr1[0][0]
//		arr1[0][1]
//		arr1[0][2]
//		arr1[1][0]
//		arr1[1][1]
//		arr1[1][2]

		for (int i = 0; i < 3; i++) {		// 한줄 한줄
			
			for (int j = 0; j < 3; j++) {	// 열 (종류)
				total += arr1[i][j];
			}
		}

		System.out.println("total : " + total);

	}
}
