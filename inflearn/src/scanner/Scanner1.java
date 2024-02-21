package scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// 스캐너 입력 타입이 맞아야함!
		
		// 스캐너 생성
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 스캐너 생성 후 출력문
		System.out.print("문자열을 입력하세요: ");
		String str = scanner.nextLine(); //입력을 String으로 가져온다.
		System.out.println("입력한 문자열: " + str);
		
		// 정수 스캐너
		System.out.print("정수를 입력하세요: ");
		int intvalue = scanner.nextInt(); //입력을 String으로 가져온다.
		System.out.println("입력한 정수: " + intvalue);
		
		// 실수 스캐너
		System.out.print("실수를 입력하세요: ");
		Double doublevalue = scanner.nextDouble(); //입력을 String으로 가져온다.
		System.out.println("입력한 정수: " + doublevalue);
	
	}
}
