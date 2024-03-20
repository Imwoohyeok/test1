package sec05.exam03.package2;

//import sec05.exam03.package1.B;
import sec05.exam03.package1.B;

public class C {
	
	// public, default 접근 제한자
	// 		클래스, 필드, 생성자, 메소드에서 사용가능
	// private 접근 제한자
	//		필드, 생성자 메소드에서 사용가능(클래스에서는 사용못함)
	
	
	// A는 default 접근 제한자를 가짐으로 x
	//	A a = null;
	B b = null;
	
	// B() default 접근 제한자를 가짐으로 x
//	B b1 = new B();
	// B(int) public 접근 제한자를 가짐으로 x
	B b2 = new B(2);
	
	C(){
		//default 접근 제한자를 가짐으로 x
//		b2.a1 = 3;
		b2.a2 = 3;
		//private 접근 제한자를 가짐으로 x
//		b2.a3 = 3;
		
		//default 접근 제한자를 가짐으로 x
//		b2.test1();
		b2.test2();
		//default 접근 제한자를 가짐으로 x
//		b2.test3();
		
	}
}
