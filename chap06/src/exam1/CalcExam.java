package exam1;

public class CalcExam {

	public static void main(String[] args) {

		// 계산기1을 생성 [10,20]
		// 연산 테스트 결과 출력

		// 계산기2를 생성 [10+20, 50]
		// 단, 10+20은 계산기 1을 사용한 결과만 쓴다
		// 연산 테스트 출력

		Calc mycalc1 = new Calc(10, 20);
		Calc mycalc2 = new Calc(mycalc1.plus(10, 20), 50);

		int q = mycalc1.a + mycalc1.b;
		int w = mycalc1.a - mycalc1.b;
		System.out.println(q); // 30
		System.out.println(w); // -10

		int plus = mycalc2.plus(10, 20);
		int minus = mycalc2.minus(10, 20);
		int times = mycalc2.times(10, 20);
		int divided = mycalc2.divided(100, 20);

		System.out.println("mycalc2 덧셈 : " + plus); // 30
		System.out.println("mycalc2 뺄셈 : " + minus); // -10
		System.out.println("mycalc2 곱셈 : " + times); // 200
		System.out.println("mycalc2 나눗셈 : " + divided); // 5

		
		System.out.println(Calc.plus(10, "+", 4) ); // 14
		System.out.println(Calc.plus(10, "-", 4) ); // 6
		System.out.println(Calc.plus(10, "*", 4) ); // 40
		System.out.println(Calc.plus(10, "/", 2) ); // 5
		
	}

}
