package bogang0103;

import java.util.Arrays;

public class Quiz3 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 5 };

		// 3-1 문제
		// 여기부터
		// i=0, j=1
		// i=1, j=2
		// i=2, j=3
		// i=3, j=4
		// i=4, j=5

		// 두 값을 비교하고 작은 수를 앞으로 보낸다
		// 선택 + 버블 알고리즘 짬뽕
		// arr[i] arr[j]를 비교해서 arr[j]가 더 작다면 두 값을 교환
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[i]) {
					int temp = 0; // 임시변수
					temp = arr[i]; // arr[i]를 temp의 저장
					arr[i] = arr[j]; // arr[j]를 arr[i]의 저장
					arr[j] = temp; // temp를 arr[j]의 저장
				}

			}
		}
		// 여기까지 수정

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 3-2
		// 로또 번호 생성기 (정렬) + 중복 값 확인
		int[] arr1 = new int[6];

		// 여기부터
		for (int i = 0; i < arr1.length; i++) {
			
			arr1[i] = ((int) (Math.random() * 45)) + 1;
			
			// 중복 확인 로직
			for (int j = 0; j < i; j++) {
				if (arr1[i] == arr1[j]) {
					i--;	// 중복값이면 1을 감소시킴
				}
			}
		}
		Arrays.sort(arr1); // 정렬

		// 여기까지 수정

		// 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
