package bogang0104;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * class는 객체를 생성하기 위한 변수와 메소드를 정의하는 틀
		 * 
		 * 클래스 내부에 변수 + 메소드를 틀을 완성합니다.
		 * 
		 * 객체지향 언어의 4대 특징 -> 캡상추다!
		 * 
		 * 1. 캡슐화 : 정보를 캡슐안에 담아서 숨기는 특성 -> 접근제한자(private,public)
		 * 2. 상속화 : 부모자식 관계, 상속을 통해 재사용성, 확장성을 증가 -> extends,implements
		 * 3. 추상화 : 공통되는 특징을 추출해서 부모 클래스로 만듬
		 * 4. 다형성 : 다양한 형상을 가질 수 있음 -> 오버라이딩, 오버로딩
		 * 
		 */
		
		// class: 무기
		// 무기() : 무기를 생성할 수 있게 해주는 생성자
		// 생성자 : 클래스를 생성하는데 도움을 주는 메소드
		무기 a = new 무기();
		
//		a.이름 = "몽둥이";
//		a.데미지 = 1;
//		a.크리티컬확률 = 0;
		
//		System.out.println(a.데미지);
		
		a.set이름("몽둥이");
		
		System.out.println(a.get이름());
		
		System.out.println("=========");
		
		/**
		 *  new는 메모리 값을 가져옴
		 *  창() : 생성자 호출
		 *  
		 */
		무기 b = new 창();
		
		b.set이름("죽창");
		
		System.out.println(b.get이름());
		System.out.println("==========");
	
		무기 b1 = new 창();
		b1.공격();
		
		무기 b2 = new 활();
		b2.공격();
		
		무기 b3 = new 칼();
		b3.공격();
	}

}
