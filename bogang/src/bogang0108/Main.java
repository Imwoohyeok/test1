package bogang0108;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * 자바는 객체지향 언어 => 실존 사물을 객체로 표현하고자 함
 * 
 * 클래스 -> 객체
 * 1. 캡슐화 : 정보를 캡슐안에 담아서 숨기는 특성 -> 접근제한자(private,public, getter,setter)
 * 2. 상속화 : 부모자식 관계, 상속을 통해 재사용성, 확장성을 증가 -> extends,implements
 * 3. 추상화 : 공통되는 특징을 추출해서 부모 클래스로 만듬
 * 4. 다형성 : 다양한 형상을 가질 수 있음 -> 오버라이딩, 오버로딩
 * 
 */
/**
 * 인터페이스, 추상클래스 둘 다 인스턴스 생성 불가
 * 
 * 인터페이스 : 스프링 프레임워크, 100%추상적임
 * -특정 구현을 미리 정의해놓음
 * -다중 상속이 가능
 * -구현 객체가 같은 동작을 한다는 것을 보장하기 위해 사용하는 것에 초점
 * -생성자를 가질 수 없다
 * 
 * 
 * 추상클래스 : 추상적이긴함
 * -미리 논리적인 상속 구조를 만들어 놓음
 * -단일 상속이 가능
 * -클래스 간의 연관 관계를 구축하는 것에 초점
 * 
 */
public class Main {
	
	public static void main(String[] args) {
//		아이폰 a = new 아이폰();		
//		a.전화();
		
		스마트폰 a = new 아이폰(); //아이폰클래스를 부모클래스에 담을 수 있다
		스마트폰 a1 = new 갤럭시(); //갤럭시클래스를 부모클래스에 담을 수 있다
		
//		List<String> list = new Vector<>();
		
	}
	
}

//인터페이스
interface 날수있음 {
	void 날기();
	int a = 1;	// 상수 값이 바꿀 수 없다.
}

interface 먹을수있음 {
	void 먹기();
}


class 개 implements 먹을수있음 {
	public void 먹기() {
		
	}
}

// implements : 상속
class 새 implements 날수있음, 먹을수있음{

	@Override
	public void 먹기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 날기() {
		// TODO Auto-generated method stub
		
	}
	
}








	// 추상클래스 : 인스턴스를 생성할 수 없음
	// 즉, 추상클래스는 new 스마트폰을 만들 수 없다
	abstract class 스마트폰 {
	
		abstract void 전화();	
		abstract void 설정();
		abstract void 카톡();
		int a = 1;	// 값을 바꿀 수 있다
	
	}
	// extends: 상속
	class 아이폰 extends 스마트폰 {
	
		@Override // 붙이는 걸 추천
		void 전화() {
			System.out.println("아이폰 전화");
		}
	
		@Override
		void 설정() {
			System.out.println("아이폰 설정");
		}
		
		void 카톡() {
			System.out.println("아이폰 설정");
		}

	}
	
	class 갤럭시 extends 스마트폰 {
		
		@Override // 붙이는 걸 추천
		void 전화() {
			System.out.println("아이폰 전화");
		}
	
		@Override
		void 설정() {
			System.out.println("아이폰 설정");
		}
		
		void 카톡() {
			System.out.println("아이폰 설정");
		}

	}
