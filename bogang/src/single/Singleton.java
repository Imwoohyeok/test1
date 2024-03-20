package single;

public class Singleton {
	
	// private : 다른 파일 접근 불가
	// static : static이 둘다 붙어있어야 실행됨 (안전하게 사용)
	// final : 필드초기값 수정불가
	// const : 상수(변경불가)
	// INSTANCE : final을 붙인 상수
	private static final Singleton INSTANCE = new Singleton();
	
	int a1 = 10;
	// 기본생성자 없어도 가능
	// 접근제한을 private으로 막음 다른 파일에서 못 쓰게
	private Singleton() {
		
	}
	
	// getter : 필드 값을 외부로 리턴해주는 메소드
	// private이여서 내 파일에서만 사용가능했지만
	// get+필드이름(대문자) 로 다른파일을 열 수 있다.
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	
	// setter : 외부에서 값을받아 필드를 변경하는 메소드
}
