package bogang0215;

import java.util.Scanner;

public class arrary2 {

	public static void main(String[] args) {
		// 2번
		
		// 길이가 10인 배열 생성
		// 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열에 추가
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 3번
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = scan.nextInt();
		
		int[] arr3 = new int[num];
		
		for(int i = 0; i<arr3.length; i++) {
			arr3[i] = i + 1;
			System.out.print(arr3[i] + " ");
		}
		
	}

}
