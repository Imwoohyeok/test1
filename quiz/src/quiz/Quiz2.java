package quiz;

public class Quiz2 {

	public static void main(String[] args) {

		// 1번 15와 20이 주어졌을 때 세번째값이 그 사이에 있는지 확인
		// 수직선을 생각
		int a1 = 15;
		int a2 = 20;
		int a3 = 19;

		// 방법 1
		if (a3 >= 15) {

			System.out.println("일단 15이상임");

			if (a3 <= 20) {
				System.out.println("사이에 있음");
			}
		}
		// 방법2
		if (a3 >= 15 && a3 <= 20) {
			System.out.println("사이에 있음");
		}

		
		
		
		
		
		
		
		
		System.out.println("2번문제---------------------");
		// 2번
		// 사각형의 좌상단좌표, 우하단좌표가 있고 점의 좌표가 있을때 그 점이
		// 사각형에 포함 되는지 확인

		// 2개의 점만 있으면 사각형을 만들 수 있다.
		int bx1 = 10;
		int by1 = 20;
		int bx2 = 100;
		int by2 = 200;

		int bx3 = 50;
		int by3 = 50;

		if ((bx3 >= bx1 && bx3 <= bx2) && (by3 >= by1 && by3 <= by2)) {
			System.out.println("사각형 안에 있다.");
		} else {
			System.out.println("사각형 안에 없다");
		}

		
		
		
		
		
		
		
		System.out.println("3번문제---------------------");
		// 3번 1~100까지 합계 구하기
		int c = (((1 + 2) + 3) + 4) + 5 + 6 + 7;
		int ci = 1;
		c = 0;
//		c = c + ci;
//		c = c + ci;
//		c = c + 3;
//		c = c + 4;
//		c = c + 5;
//		c = c + 6;
//
//		ci = 7;
//		c = c + ci;

		for (int i = 1; i <= 100; i++) {
			c = c + i;
		}
		System.out.println("1~100까지 합 :" + c);

		
		
		
		
		
		
		
		
		System.out.println("4번문제---------------------");
		// 4번 1~100까지 짝수의 합계 구하기
		int d = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				d = d + i;
			}
		}
		// 방법 2
//		for (int i = 2; i <= 100; i+=2 ) {
//		}
		System.out.println("짝수의 합 :" + d);

		
		
		
		
		
		
		
		System.out.println("5번문제---------------------");
		// 구구단 2~3단씩 출력
//		2x1=2   3x1=3
//		2x2=4   3x2=6
//		2x3=6	(2+1)x3 =(2+1)*3

		int dan = 2;
//		for (int i =1; i<= 9; i++) {
//			System.out.println(dan + "x" + i + "=" + (dan*i) + "\t"
//					+ (dan+1) + "x" + i + "=" + ((dan+1)*i));
//		}
//		System.out.println();	//한줄 띄우기

//		dan = dan +2;
//		for (int i =1; i<= 9; i++) {
//			System.out.println(dan + "x" + i + "=" + (dan*i) + "\t"
//					+ (dan+1) + "x" + i + "=" + ((dan+1)*i));		
//		}
		System.out.println();

		for (dan = 2; dan <= 9; dan += 2) {
			for (int i = 1; i <= 9; i++) {
				System.out
						.println(dan + "x" + i + "=" + (dan * i) + "\t" + (dan + 1) + "x" + i + "=" + ((dan + 1) * i));
			}
			System.out.println();
		}

		// 구구단 3단씩 옆으로 출력
		for (dan = 2; dan <= 9; dan += 3) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "x" + i + "=" + (dan * i) + "\t" + (dan + 1) + "x" + i + "=" + ((dan + 1) * i)
						+ "\t" + (dan + 2) + "x" + i + "=" + ((dan + 2) * i));
			}
			System.out.println();
		}

		// 4단씩 옆으로 출력
		System.out.println("4단씩출력 =================");
		int se = 4;
		for (dan = 2; dan <= 9; dan += se) {
			for (int i = 1; i <= 9; i++) {
//				System.out.println((dan+0) + "x" + i + "=" + (dan*i) + "\t"
//								 + (dan+1) + "x" + i + "=" + ((dan+1)*i) + "\t"
//								 + (dan+2) + "x" + i + "=" + ((dan+2)*i) + "\t"
//								 + (dan+3) + "x" + i + "=" + ((dan+2)*i));
				for (int j = 0; j < se; j++) {
					if (dan + j <= 9) {
						System.out.println((dan + j) + "x" + i + "=" + ((dan * j) * i) + "\t");
					}
				}

				System.out.println();
			}
		}

		
		
		
		
		
		
		System.out.println("6번문제---------------------");
//		[3,4,7,5,1]
//		[3,4]
//		6번 숫자 배열이 있을때 최대값 구하기(단, sort쓰지 말고)
		
		int[] target = {3,4,5,10,7,5,9,0};	// 객체에 음수가 오면 e 값을 더 낮게 잡아야함
		int e = -99999;		// 양수만 담고 있으면 -1 보다 커야하기때문에 -1로 둠
//		if(target[0] > e) {
//			e = target[0];
//		}
//		if(target[1] > e) {
//			e = target[1];
//		}
		
		for(int i = 0; i<target.length; i++) {
			if(target[i] > e) {
				e = target[i];
			}
		}
		System.out.println("최대값 :" + e);
		
		
		
		
		
		
		
		
		System.out.println("7번문제---------------------");
//		7번 2번째 최대값구하기
		int f = -9999;
		for(int i = 0; i<target.length; i++) {
//			if(e == target[i]) continue;
			
			if(e != target[i] && target[i] > f) {
				f = target[i];
			}
		}
		System.out.println("2번째 최대값 :" + f);
		
		
		
		
		
		
		
		
		
		System.out.println("8번문제---------------------");
		// 8번 내림차순 정렬
		int[] desc = new int[target.length];

//		for(int i=0; i<target.length; i++) {
//			if(target[i] > desc[0]) {
//				desc[0] = target[i];
//			}
//		}
//		
//		for(int i=0; i<target.length; i++) {
//			if(target[i] == desc[0] ) continue;
//			
//			if(target[i] > desc[1]) {
//				desc[1] = target[i];
//			}
//		}
//
//		
//		for(int i=0; i<target.length; i++) {
//
//			boolean isContinue = false;
//			for(int j=0; j<2;j++) {
//				if(target[i] == desc[j] ) {
//					isContinue = true;
//					break;
//				}
//			}
//			if(isContinue) {
//				continue;
//			}
//			
//			
//			if(target[i] > desc[2]) {
//				desc[2] = target[i];
//			}
//		}
//		
		for(int k=0; k<target.length; k++) {
			
			for(int i=0; i<target.length; i++) {
				
				boolean isContinue = false;
				for(int j=0; j<k;j++) {
					if(target[i] == desc[j] ) {
						isContinue = true;
						break;
					}
				}
				if(isContinue) {
					continue;
				}
				
				if(target[i] > desc[k]) {
					desc[k] = target[i];
				}
			}
		}
		// 출력
		System.out.println("원본");
		for(int i=0; i<target.length; i++) {
			System.out.println(target[i]);
		}
		System.out.println("내림차순");
		for(int i=0; i<desc.length; i++) {
			System.out.println(desc[i]);
		}
		
		
		
		
		
		
		
		
		
				
	
		System.out.println("9번문제---------------------");
//		9번 예약
//			자리가 10개 있는 소극장 예약 시스템을 만들건데
//			1~10번 자리까지 있음
//			예약 가능하면 "예약했습니다"
//			예약 불가능하면 "이미 예약 되어있습니다"
//		첫번째 사용자가 2번 자리를 예약?
//		두번째 사용자가 2번 자리를 예약?
		
		boolean[] g = new boolean[10];	//배열 10개 생성
		int rsv = 2;
		
		g[rsv -1] = true;
		
		rsv = 3;	//3번자리확인
		if(!g[rsv - 1]) {
			g[rsv - 1] = true;
			System.out.println(rsv + "번 자리가 예약이 되었습니다.");
		} else {
			System.out.println(rsv + "번 자리는 예약이 불가능합니다.");
		}
		
		rsv = 2;	//2번자리확인
		if(!g[rsv - 1]) {
			g[rsv - 1] = true;
			System.out.println(rsv + "번 자리가 예약이 되었습니다.");
		} else {
			System.out.println(rsv + "번 자리는 예약이 불가능합니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
