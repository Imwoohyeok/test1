package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;	// 선언부	,재선언 안됨
		score = 90;	// 할당
		
//		int value = 30; // 선언과 동시에 초기화
		
//		int value;		// value 값이 없어서 에러가 남
//		int result = value + 10;
		
		int var1 = 10; //전역변수
		
		{
			int var2 = 20;	// 지역변수
			System.out.println("var1 :" + var1); //10
			System.out.println("var2 :" + var2); //20
		}
//		System.out.println("var2 :" + var2); 
		//변수var2 가 중괄호 안에 있어서 에러남
		
//		byte b = 128;	//byte는 127까지만 담을 수 있다.
		
		char c1 = 'A';
		System.out.println(c1);	// >> A
		c1 += 2;
		System.out.println(c1); // >> C
		
		c1 = 97;	//소문자
		System.out.println(c1);	// >> a
		
		String s1 = "문자";
		System.out.println(s1);	// >> 문자
		
		
		// 소수점 7번째까지 믿을 수 있다 그 밑에는 못믿음
		float f = 0.1234567890123456789f;	//f를 붙여야 컴파일 에러가 안남
		// 소수점 16번째까지 믿을 수 있다 그 밑에는 못믿음
		double d = 0.1234567890123456789;
		System.out.println("float :" + f);	// >> 0.1234567
		System.out.println("double :" + d);	// >> 0.1234567890123456
		
		boolean stop = true;
		boolean state = false;
		
		long balance = 3000000000L; //L을 붙여야 컴파일 에러가 안남
		
		int a = 10;
//		long b = (long)a; // >> 타입 cast 연산자 (생략가능)
		long b = a;
		System.out.println("b : "+ b); // >> 10
		
		b = 3000000000L;
		a = (int)b;
		System.out.println("a : "+ a); 
		
		double d2 = 3.14;
		int i2 = (int)d2;
		System.out.println("i2 : "+ i2); // >> 3
		
		
		int result = 10;
		int count = 4;
		System.out.println(result / count);
		
		double n = result / count; // > 2
		System.out.println("n1 :" + n);
		
		double r2 = 10;
		double c2 = 4;
		n = r2 / c2;
		System.out.println("n2 :" + n); // >> 2.5
		
		n = result / c2;
		System.out.println("n3 :" + n); // >> 2.5
		
		String str = "15";
		int val = Integer.parseInt(str);	// >>숫자로 변환
		System.out.println(val + 1); // >> 16
		
		int ii = 123;
		String s = "" + ii;
		
		System.out.print("a");
		System.out.print("b");
		
		
//		try {
//			System.out.println("아무키나 입력하세요 ");
//			int read = System.in.read();
//			System.out.println("read :" + read);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("또 아무키나 입력하세요");
		Scanner scan = new Scanner(System.in);
		String inputData = scan.nextLine();
		System.out.println("inputData :" + inputData);
		
		boolean bb = inputData.equals("abc");
		System.out.println(bb);
		
		
		/*
		 * quiz : 답을 저장할 변수의 타입
		 * 
		 * 1. 내가 운전하는 자동차가 있다/없다 (boolean)
		 * 2. 우리집에 있는 스마트폰의 개수 (int) byte long
		 * 3. 내 이름	(String)
		 * 4. 1평은 3.3제곱미터입니다 5평에 대한 제곱미터 값 (double)
		 * 
		 * 
		 */	
		boolean car = true;
		System.out.println("내 차가 있는가? :" + car);
		int phone = 3;
		String name = "임우혁";
		double area = (double)5 * 3.3;
		System.out.println(area);
		
//		5 % 3 = 2
		
		/*
		 * quiz2 : 167,234원을 현금으로 출금
		 * 
		 * 5만원, 1만원, 5천원, 1천원, 500원, 100원, 50원, 10원, 1원 
		 * 각각의 통화권은 몇개씩 필요한지
		 * 
		 */
		
		/*
		 * quiz3 : n 분의 1 계산기
		 * 비용 : 50,000원
		 * 인원 : 7명
		 * 단, 내가 조금 더 냅니다.
		 * 
		 */
		
		/* 			2번 문제 
		 * 5만원 : 3			167,234
		 * 1만원 : 1
		 * 5천원 : 1
		 * 1천원 : 2
		 * 500원 : 0
		 * 100원 : 2
		 * 50원 : 0
		 * 10원 : 3
		 * 1원 : 4
		 *
		 */
		int mon = 167234;
		int m5 = mon/ 50000;
		System.out.println("5만원권 :" + m5);
//		mon = mon-150000;
		mon = mon -(50000*m5);
		
		int m1 = mon/10000;
		System.out.println("1만원권 :" + m1);
//		mon = mon-10000;
		mon = mon -(10000*m1);
		
		int m5c = mon/5000;
		System.out.println("5천원권 :" + m5c);
//		mon = mon-5000;
		mon = mon -(5000*m5c);
		
		int m1c = mon/1000;
		System.out.println("1천원권 :" + m1c);
//		mon = mon-2000;
		mon = mon -(1000*m1c);
		
		int m5w = mon/500;
		System.out.println("500원 :" + m5w);
//		mon = mon-0;
		mon = mon-(500*m5w);
		
		int m1w = mon/100;
		System.out.println("100원 :" + m1w);
//		mon = mon-200;
		mon = mon-(100*m1w);
		
		int m_10 = mon/10;
		System.out.println("10원 :" + m_10);
//		mon = mon-30;
		mon = mon-(10*m_10);
		
		int m_1= mon/1;
		System.out.println("1원 :" + m_1);
//		mon = mon-4;
		mon = mon-(1*m_1);
		
		//3번 문제
		
		int m2 = 50000;
		int p2 = 7;
		int n2 = m2/p2;	
		System.out.println("n분의 1 :" + n2); // >>7142
		System.out.println("n2로 " + p2 + "명의 돈은 :" + n2 *p2); //>> 49994
		System.out.println("내가 더 내야 하는 돈은 :" + (m2 - (n2*p2))); // >> 6
		System.out.println("더 내야하는 돈은 :" +(n2 +(m2-(n2*p2))));
		
		
		
		
		
		
		int i3 = 0;
		int i4 = 10;
		
		int i5 = 1, i6 = 8;
		
//		for(int i=0; i<10; i++) {
//			i--;
//		}
//		for(int i=0; j=0;;) {
//			
//		}
		
		
		
		
	}

}







