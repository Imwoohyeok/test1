package sec04.exam01;

public class Calculator {
	
	/*
	 * 전원이 켜졌다는 내용을 출력함
	 * 
	 *  메소드명 : powerOn
	 *  전달인자 : 없음
	 *  리턴타입 : 없음
	 */
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	/**
	 * 두 수를 받아 더한 결과를 돌려줌
	 * 
	 * 메소드명 : plus
	 * 전달인자 : int, int
	 * 		   두 정수
	 * 리턴타입 : int (두 수를 더한 결과)
	 * 
	 */
	int plus(int x, int y) {
		int result = x + y;
		System.out.println("int, int");
		return result;
	}
	
	double plus(double x, double y) {
		double result = x + y;
		System.out.println("double, double");
		return result;
	}
	
	// 오버로딩
	// 전달인자의 타입의 개수와 순서를 다르게해서
	// 메소드 명을 동일하게 만들 수 있는 것
	int plus(int x) {
		int result = x + x + 1;
		
		return result;
	}
	
	void join(String name, int age, int a, int b, int c) {
		System.out.println("이름은 :" + name);
		System.out.println("나이는 :" + age);
		System.out.println("a" + a);
		System.out.println("b :" + b);
		System.out.println("c :" + c);
	}
//	void join(String addr, int count) {
//		
//	}
//	void join (int a) {
//	}
	void join(int age) {
		String name = "noname";
		int a = -1;
		int b = -1;
		int c = -1;
		
		join(name, age, a, b, c);
	}
	void join(int age, String name) {
		
	}
	
	/*
	 * 두 수를 받아서 나누기한 결과를 소수점까지 돌려줌
	 * 메소드명 : divide
	 * 전달인자 : int, int
	 * 리턴타입 : double; 소수점까지 결과를 알려주기 위해서
	 */
	
	double divide(int x, int y) {
		// = 을 기준으로 오른쪽이 먼저 실행되므로
		// x/y 를 실행
		//			(double) : int를 double 타입으로 변경
		//			왜? double / int는 double/double 자동 변경됨
		// 계산 결과를 result 변수로 담는다
		double result = (double)x / y;
		
		// 결과를 돌려줌
		// result의 타입이 double이니까 리턴타입도 double
		return result;
	}
	
	void powerOff() {
			System.out.println("전원을 끕니다.");
			// void의 경우 return 생략가능
			// 하지만 필요한 경우 return을 이용해 메소드 종료
//			return;
	}
	
	
}
