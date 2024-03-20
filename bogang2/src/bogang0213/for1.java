package bogang0213;

//import java.util.Scanner;
public class for1 {

	public static void main(String[] args) {
//		별찍기
		// 1번
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("========================");

		// 2번
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("========================");

		// 3번
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("========================");
		// 4번
		// j = 5번 돌아서 print ***** 다 찍고
		// println
		// k = 1, i = 1/ 공백
		// k = 2; i = 2; 공백 두개
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==========================");
		// 5번 피라미드
		// i=1; j=1; 5번도니까 공백 5개 하고 i=1; k=1; 별 하나 찍히고
		// i=2; j=2; 4번도니까 공백 4개 찍고 i=2; k=2; 별 3개찍히고
		// i=3; j=3; 3번도니까 공백 3개 찍고 i=3; k=3; 별 5개찍힘
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("==========================");
		// 6번 피라미드
//		9	1일때 9개
//		7	2일때 7
//		5	3일때 5
//		3	4일때 3
//		1	5일때 1
//		11 - (2*i)
//		2 * (n - i + 1) - 1
//		2 * i - 1
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 11 - (2 * i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("==========================");
		// 7번 피라미드
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("==========================");
		// 8번 피라미드
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("==========================");
		// 9번 피라미드
		// 알파벳도 for문 돌리면 abcdef 이렇게 증가한다
		
		// #증가될 문자를 변수에 담고 출력할 때 ++하면서 for문 돌리기#
		
		char ch = 'a'; // char타입은 ''를 쓴다
		int num = 1;
		System.out.println("===============");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++);
			}
			for (int a = i; a <= 4; a++) {
				System.out.print(num++);
			}
			System.out.println();
		}
//		9번 피라미드 해석
//		i=1;
//		j=1; for문 한번 돌아서 a하나 찍힘/ a=1; for문 4번 돌려서 1234 4개찍힘
//		j=2; 2번돌아서 bc 2개찍힘	     / a=2; for문 3번 돌아서  567 3개찍힘
//		j=3; 3번 돌아서 def 3개찍힘       / a=3; for문 2번 돌아서 89 2개찍힘
//		j=4; 4번 돌아서 ghij 4개찍힘      / a=4; for문 1번 돌아서 10 1개찍힘

	}

}
