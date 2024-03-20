package sec03.exam01;

public class Car {
	
	int gas = -1;
		// 기본생성자
		// 전달인자와 실행내용이 없음
		// 생성자가 "없는" 경우 자동 생성됨
//	Car(){}  기본생성자
	
//	Car() {
//		this(5); // 생성자 호출 (맨첫줄에 있어야함) 
//		// 필드 초기화
//		int gas = 5;
//		
//		this.gas = gas;
//		System.out.println("Car 생성자 실행");
//	}
	
	Car() {
		// 생성자에서 다른 생성자(즉, 오버로드된 생성자) 호출법
		// 단, 생성자의 맨 첫줄에 적어야함!
		this(7);
		System.out.println("Car 생성장 실행");
	}

//	Car(int g) {
//		gas = g;
//		System.out.println("Car(int g) 생성자 실행");
//	}
	Car(int gas) {
		this.gas = gas;
		System.out.println("Car(int g) 생성자 실행");
	}
	
}
