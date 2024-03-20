package exam1;

public class Calc {
	
	// 필드
	// 		숫자1
	//		숫자2
	int a;
	int b;
	int c;
	
	// 생성자
	// 		숫자 1과 2를 받았을 경우에만 생성
	Calc(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	// 메소드
	// 	-결과 값만 돌려줌
	// 		덧셈
	// 		뺄셈
	// 		곱셈
	// 		나눗셈
	// 		나머지
	int plus(int x, int y) {
		return x + y;
	}
	int minus(int x, int y) {
		return x - y;
	}
	int times(int x, int y) {
		return x * y;
	}
	int divided(int x, int y) {
		return x / y;
	}
	
	
	static int plus(int x, String str, int y) {
		int result = 0;
		if(str != null) {
			if(str.equals("+")) {
				result = x + y;								
			} else if(str.equals("-")) {
				result = x - y;
			} else if(str.equals("*")) {
				result = x * y;
			} else if(str.equals("/")) {
				// 0으로 못 나눠서 if문 걸기
				if(y != 0) {					
					result = x / y;
				} else {
					// 위에 중 연산자가 없을 때
					System.out.println("0으로 나눌 수 없습니다.");
				}
			} else {
	            // 0일 때
	            System.out.println("다시 입력해주세요");
			}
		} else {
			// null 일 때
			System.out.println("다시 입력해주세요");
		}
		
		// 최종 결과 반환
		return result;
	}
	
	
}
