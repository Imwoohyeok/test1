package bogang1227;

import java.util.Scanner;

public class TM {

	public static void main(String[] args) {
		//1번문제 1~10
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
		//2번문제 10~1
//		for (int i = 10; i >= 1; i--) {
//			System.out.print(i + " ");
//		}
		
		//3번문제 별사각형
		// 5번씩 5번 총25번돈다.
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		//4번문제 삼각형
		// j=1, i=1 별1개출력
		// j=2, i=2 별2개출력
		for(int i =1; i<=5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//구구단
		Scanner scanner = new Scanner(System.in);

		System.out.print("몇 단? : ");
		int dan = scanner.nextInt();
		
		for(int i = 1; i<= 9; i++) {
			System.out.println(dan + "*" + i + "=" + i*dan);
		}
		
		// 별찍기 문제 (좌표, 행과열)
		
		
		
	}

}
