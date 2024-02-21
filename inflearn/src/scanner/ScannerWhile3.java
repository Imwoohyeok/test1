package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		int sum = 0;	
		
		while(true) {
			System.out.println("정수를 입력하세요 (0을 입력하면 종료): ");
			int number = a.nextInt();
			
			if(number == 0) {
				break;
			}
			sum += number; // 사용자가 입력한 값을 누적함 / 필드에 있는 sum으로 누적
		}
		System.out.println("입력한 모든 정수의 합: " + sum);

	}

}
