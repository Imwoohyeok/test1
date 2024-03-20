package bogang0103;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 세로읽기
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][5];
		
		// 입력
		for (int i = 0; i <5; i++) {
			String s = sc.next();
			for(int j =0; j <5; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		// 출력
		for(int i = 0; i < 5; i++) {
			
			for (int j=0; j<5; j++) {
				System.out.print(arr[j][i]);
				
			}
			
		}
		
//		arr[0][0]
//		arr[1][0]
//		arr[2][0]
//		arr[3][0]
//		arr[4][0]
		
//				
//				arr[0][1]
//				arr[1][1]
//				arr[2][1]
		

	}

}
