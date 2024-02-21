package array;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];	// 5칸의 배열 생성

		System.out.println("5개의 정수를 입력하세요");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}

		System.out.println("출력");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if(i < num.length -1) {		// 맨끝에 "," 빼는 if문
				System.out.print(", ");				
			}
		}
		
		// 역순 정렬
		System.out.println("출력");
		// 0,1,2,3,4
		for (int i = 4; i >= 0; i--) {
			System.out.print(num[i]);
			if(i > 0) {	
				System.out.print(", ");				
			}
		}
	}

}
