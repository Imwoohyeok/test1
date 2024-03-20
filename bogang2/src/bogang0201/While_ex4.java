package bogang0201;

import java.util.Scanner;

public class While_ex4 {

	public static void main(String[] args) {
//		키보드로부터 입력한 숫자를 입력한 숫자를 입력받아 홀수와 짝수가 각각 몇 개 입력되었는지 출력 
//		(-1 을 입력한 경우 종료)
		
		Scanner a = new Scanner(System.in);
		
		int num = 0;
		int ww = 0;	//짝수
		int hh = 0; //홀수
		
//		짝수면 ww 에 담고
//		홀수면 hh 에 담아서
//		짝수 개수와 홀수 개수를 출력
		
		while(true) {
			System.out.print("숫자입력 : ");
			num = a.nextInt();
			if(num % 2 == 0) {	// 짝수면
				ww += 1;
			} else if(num % 2 == 1) { // 홀수면
				hh += 1;
			}
			if(num == -1) {
				System.out.println("짝수 개수 :" + ww);
				System.out.println("홀수 개수 :" + hh);
				break;
			}
			
		}
		
	}

}
