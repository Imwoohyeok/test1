package single;

public class Main {
	public static void main(String[] args) {
		
		// Spring -> 싱글톤
		// 생성자 : Singleton()
		Singleton a = Singleton.getInstance(); 
		Singleton b = Singleton.getInstance(); 
		Singleton c = Singleton.getInstance(); 
		Singleton d = Singleton.getInstance(); 
		
		// 얕은 복사 느낌
		// a를 20으로 바꾸면 a,b,c,d 전부 20으로 바뀐다
		a.a1 = 20;
		
		// 주소값 출력
		// a,b 둘다 주소값이 같다 즉, 값이 같다
		System.out.println(a.a1); 	//20
		System.out.println(b.a1);	//20
		System.out.println(c.a1);
		System.out.println(d);		//주소값
		
	}
}
