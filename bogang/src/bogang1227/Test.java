package bogang1227;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		/*
		 * 짝수는 어떤 숫자로 2로 나눴을 때 나머지가 0인 수
		 * 홀수는 어떤 숫자로 2로 나눴을 때 나머지가 1인 수
		 * 
		 * 10/2 나머지가 0-> 짝수
		 * 9/2 나머지가 1-> 홀수
		 * 
		 * 10%2 나머지가 반환이 돼요
		 * 9%2 나머지가 1이 반환이 됨
		 * 
		 */
		if (num % 2 == 0){
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}
}
