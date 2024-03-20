package bogang0201;

import java.util.Scanner;

public class While_ex5 {

	public static void main(String[] args) {
//		정수 2개를 입력받고 연산자를 선택받으면 해당 연산 결과를 출력 
//		( 연산자는 (+ / -) 중에서만 선택 )
		
		Scanner a = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		String pm;
//		pm.equals 문자열을 비교할 때 (if)
		
		while(true) {
			System.out.print("정수1 : ");
			num1 = a.nextInt();
			System.out.print("정수2 : ");
			num2 = a.nextInt();
			
			System.out.print("연산자 (+/-) : ");
			pm = a.next();	// 문자 -/+인지 확인
			
			if(pm.equals("-")) {	/*다시 확인*/
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			} else if(pm.equals("+")) {
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			}
			break;
		}
		

	}

}
