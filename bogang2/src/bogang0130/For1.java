package bogang0130;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/* 1번 1~5까지 출력*/
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");			
		}
		
		System.out.println();
		System.out.println("========2번=========");
		/* 2번 1~5까지 합 출력*/
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		System.out.println("========3번=========");
		/* 3번 1~10까지 짝수*/
		for(int i =2; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("========4번=========");
		/* 4번 1~10까지 짝수의 개수*/
		int count = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 ==0) {
				count++;
			}
		}
		System.out.print(count);
		
		System.out.println();
		System.out.println("=========5번========");
		/* 5번 0보다 큰 두 수를 입력받고 더 높은 값 출력*/
		
		Scanner a = new Scanner(System.in);
		
		int num1 = a.nextInt();
		int num2 = a.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		} else if(num2 > num1) {
			System.out.println(num2);			
		} else {
			System.out.println(num1);
		}
			
		System.out.println("=========6번========");
		/* 6번 배열의 값 출력*/
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
	}

}
