package bogang1227;

import java.io.IOException;
import java.util.Scanner;

public class Star {
//	throws IOException : input output 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int input = scanner.nextInt();

		for (int i = 1; i <= input; i++) { // 행(가로줄): i
			for (int j = 1; j <= input; j++) { // 열(세로줄) : j 
				
				// 1행 이거나 1열 이거나 input행 이거나 input열 일 때 별을 출력
				// 이외의 경우에는 공백을 출력
				if(i == 1 || j == 1 || i == input || j == input ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
	}

}
