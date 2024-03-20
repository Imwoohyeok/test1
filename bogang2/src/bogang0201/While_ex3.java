package bogang0201;

import java.util.Scanner;

public class While_ex3 {

	public static void main(String[] args) {
		
//		예제 3번
//		1이상의 자연수를 입력받고
//		입력한 숫자를 누적하여
//		누적결과 출력
//		0을 입력하면 프로그램 종료
		
		Scanner a = new Scanner(System.in);
		
		int result = 0;
		int num = 0;
		
		while(true) {
			System.out.print("숫자입력 :");
			num = a.nextInt();
			result = result + num;
			if(num == 0) {
				System.out.println("입력종료");
				break;
			}
			System.out.println("누적 결과 :" + result);
		}

		/* while 설명 */
//		true 일 때 계속 반복문이 도는데
//		num 입력 받은 값을 result 변수에 누적시켜서 더함
//		num = 0 이면 입력 종료
		
		
		
	}

}
