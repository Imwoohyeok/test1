package sec05.exm02;

public class Calc {

	static double pi = 3.14159; // Calc.pi 하면 출력됨
	int a = 10; // new를 해야지 출력됨
	int b = 100;
	
	// 선언만 되어있고 값을 초기화 하지 않은 경우
	// 생성자에서 딱 한번 값을 초기화 할 수 있다.
	final int d;
	
	Calc(int d) {
		this.d = d;
		System.out.println("");
		this.a = 20;
	}
	
	//static 안에서 static만 쓸 수 있다.
	static int plus(int x, int y) {
		return x + y + (int)pi;
	}

	static int minus(int x, int y) {
		return x - y;
	}
	
	// 원의 둘레 : 2*pi*반지름
 	double circle(int r) {
 		plus(r,r);
		return 2 * r * pi;
	}
}
