package sec04.exam01;

public class CalculatorExam {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.powerOn();
		
		int result1 = calc.plus(10, 25);
		System.out.println("result1 :" + result1);
		
		// x,y 를 a,b 로 바꿔도 적용된다
//		int x = calc.plus(10, 25);
		int a = 10;
		int b = 25;
		int result1_1 = calc.plus(a,b); // 35
		
		// 전달인자로 함수를 넣을 수 있다
		// * 함수의 결과는 변수로 담을 수 있고
		//   전달인자는 변수를 사용할 수 있으니까
		// * 함수의 return이 int니까 int자리 아무데나 넣을 수 있다
		int result1_2 = calc.plus(calc.plus(a,b),b); // 35+25
		System.out.println("result1_2 :" + result1_2); //60
		
		
		// 나누기
		byte x = 10;
		byte y = 4;
		double result2 = calc.divide(x, y);
		System.out.println("result2 :" + result2); // 2.5
		
		// 전원끄기
		calc.powerOff();
		
		
	}
}
