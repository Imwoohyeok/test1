package bogang0130;

import java.util.Scanner;

public class For_7_8 {

	public static void main(String[] args) {
		System.out.println("=========7번========");
		/* 7번: 숫자 입력받고, 각 자리의 합
		 * ex)123000이면 
		 * 1+2+3
		 * >6
		 */
		Scanner scanner = new Scanner(System.in);
		// 123
		int n1 = scanner.nextInt();
		
		int add = 0;
		
		//10으로 나머지를 더해서 add에 저장
		while(true) {
			add = add + (n1 % 10); // add = 3, add= 3+2, add = 3+2+1
			n1 = (n1/10);
			if(n1 < 1) {
				break;
			}
		}
		System.out.println(add);
		
		// n1의 값이 123이였는데 10을 나눠서 12로 바꿔줌
		// 반복문으로 12를 1로 바꿔줌
		
		
		
		
		System.out.println("=========8번========");
		/* 8번:  2x + 4y = 10 의 모든 해를 구하는 코드를 작성해주세요.
				단, x와 y는 10 이하의 자연수입니다.
				결과는 다음과 같이 나옵니다.*/
//		ex) x = 1, y = 2
//			x = 3, y = 1
		
//		1부터 10까지 대입해봐야해서 for문 써야함
		
		for(int x = 1; x <= 10; x++) {
			for(int y=1; y <= 10; y++) {
				if((2 * x) + (4 * y) == 10) {
					System.out.println("x" + "=" + x);
					System.out.println("y" + "=" + y + ",");
				}
			}
		}
		
		
		
	}

}
