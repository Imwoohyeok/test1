package bogang0215;

import java.util.Scanner;

public class arrary {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,50,3,60};
		
		// 1-1 인덱스가 1인 곳 값을 출력
		System.out.println(arr[1]);
		
		// 1-2  값이 60인 곳의 인덱스를 출력
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 60) {
				System.out.println(i);
			}
		}
		
		// 1-3  arr 배열 안의 모든 값을 더하고, 총합과 평균
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			avg = sum / arr.length;
		}
		System.out.println("합: " + sum);			
		System.out.println("평균: " +avg);			
		
		// 1-4 인덱스 번호를 입력받아, 그 값을 1000으로 변경
		Scanner scan = new Scanner(System.in);
		
		arr[ scan.nextInt() ] = 1000;
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 1-5. arr 배열의 요소에서 최대값과 최소값
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) { // max보다 arr[i]가 크면
				max = arr[i]; // max가 바뀜
			} else { // 그 반대면 min값이 됨
				min = arr[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		
	}

}
