package bogang0201;

import java.util.Scanner;

public class While_ex1 {

	public static void main(String[] args) {
//		예제 1번
		int i = 1;
		while(true) {
			System.out.println(i + " ");
			i++;
			if(i > 10) {	// i가 10보다 커졌을 때 반복문을 나간다
				break;
			}
		}
		System.out.println("-------------------");
//		예제2번
		// 입력 받은 수가 10보다 작은 때만 계속 숫자를 입력할 수 있는 프로그램을 작성
		
		Scanner a = new Scanner(System.in);
		
		int num = 0;
		
		while(true) {
			System.out.print("숫자입력 :");
			num = a.nextInt();
			if(num >= 10) {
				System.out.println("입력 종료");
				break;
			}
		}
		System.out.println();
		
		
		
		
		
	}

}
