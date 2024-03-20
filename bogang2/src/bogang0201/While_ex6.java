package bogang0201;

import java.util.Scanner;

public class While_ex6 {

	public static void main(String[] args) {
//		위 문제에서 연산 결과 출력 후 "다시 실행하시겠습니까?(Y/N)"  문구를 출력 후 
//		사용자가 "Y" 문구를 출력 후 사용자가 "Y"를 입력하면 다시 입력받고 
//		"N"을 입력하면 프로그램을 종료
		
		Scanner a = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		String pm;
		String yn;
		
		while(true) {
			System.out.print("정수1 : ");
			num1 = a.nextInt();
			System.out.print("정수2 : ");
			num2 = a.nextInt();
			
			System.out.print("연산자 (+/-) : ");
			pm = a.next();	// 문자 -/+인지 확인
			
			if(pm.equals("-")) {
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			} else if(pm.equals("+")) {
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			}
			System.out.println("다시 실행하시겠습니까? (Y / N)");
			yn = a.next();
			
			if(yn.equals("N")){
				System.out.println("종료합니다");
				break;				
			}
		}
		
	}

}
