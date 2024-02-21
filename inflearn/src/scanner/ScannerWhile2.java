package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수와 두번째 수 모두 0일 때 프로그램을 종료합니다.");
		
		while(true) {
			System.out.println("첫번째수를 입력하세요");
			int num1 = scanner.nextInt();
			System.out.println("두번째수를 입력하세요");
			int num2 = scanner.nextInt();
			
			if(num1 == 0 && num2 == 0 ) {
				System.out.println("프로그램 종료");
				break;
			}
			int sum = num1 + num2;
			System.out.println("두 숫자의 합: " + sum);
		}
		

	}

}
