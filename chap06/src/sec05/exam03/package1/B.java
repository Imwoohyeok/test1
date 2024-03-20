package sec05.exam03.package1;

// 클래스의 public은 파일명과 동일한 클래스만 허용됨
//public class D {
class D {
	
}

public class B {
	
	A a = null;
	
	// 필드
	int a1 = 0;
	public int a2 = 10;
	private int a3 = 20;
	
	// 생성자 오버로딩 되어있는 상태
	B(){
		this.a1 = 1;
		this.a2 = 10;
		this.a3 = 100;
		
		test1();
		test2();
		test3();
	}
	public B(int a1){
		
	}
	private B(String s1){
		
	}
	
	// 메소드
	void test1() {
		
	}
	
	public void test2() {
		
	}
	
	private void test3() {
		
	}
}
