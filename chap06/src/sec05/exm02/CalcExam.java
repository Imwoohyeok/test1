package sec05.exm02;

import sec05.exam04.Singleton;
// 모든 클래스
// 단, 하위 패키지는 포함하지 않음
import sec05.exam04.Singleton.*;
import sec05.exam04.SingletonExam;

//단, 하위 패키지는 포함하지 않음
import sec04.*;
import sec04.exam02.Computer;

public class CalcExam {

	private static int bb;

	public static void main(String[] args) {
		
		Singleton s = null;
		SingletonExam se = null;
		
		Computer c =null;
		
		// 패키지 정보를 직적 적을 수 있음
		sec04.exam01.Calculator c2 = new sec04.exam01.Calculator();
		
		System.out.println("Calc.pi :" +Calc.pi);
		Calc.pi = 3.1;	// pi 는 하나
		
		int aa = Calc.plus(10, 15);		// new 하지 않고 사용했다
		System.out.println("a :" + aa);
		
		Calc c1 = new Calc(aa);
		c1.a = 20;
		
		Calc c21 = new Calc(bb);
		c21.a = 40;
		
		System.out.println("c1.a :" + c1.a);
		System.out.println("c2.a :" + c21.a);
		
		System.out.println("c2.pi :" + c21.pi);
		
//		Calc.Exam ce = new CalcExam();
//		ce.test();
	
		double p = 2;
		
	}	
		
		void test() {
			System.out.println("테스트중...");			
		}
	
}
	
