package for_;

public class For1 {

	public static void main(String[] args) {
		// 1부터 10까지 출력하기
		
		// for문
		for(int i=1; i <= 10; i++) {
			System.out.println(i);
		}

		// while문
		int count = 1;
		while(count <=10) {
			System.out.println(count);
			count++;
		}
		
		System.out.println("=======================");	
		
		// for문
		for(int i=2; i <= 10; i= i+2) {
			System.out.println(i);
		}
		
		int max = 100;
		int sum = 0;	// sum 초기값 0
		
		// 0부터 100까지 도는 반복문
		for(int i = 0; i<=max; i++) {
			sum += i;	// sum 변수에 누적시킴 1부터 100까지 더함
		}
		System.out.println(sum);	// 그 누적시킨 sum 출력 
		
		System.out.println("=======================");
		
		// 구구단 출력
		
		for(int i = 1; i<=9; i++) {			
			for(int j = 1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);			
			}
		}
		
		System.out.println("=======================");
		
		// 피라미드 출력
		int rows = 4;
		
		// row의 값이 4면 별4개까지 찍힘
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// i=1, j=1; 별하나찍고 줄바꿈
		// i=2, j=2; **찍고 줄바꿈
		// i=3, j=3; ***찍고 줄바꿈
		// i=4, j=4; ****찍고 줄바꿈
		
		
		
	}
}
