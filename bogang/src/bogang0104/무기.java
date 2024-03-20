package bogang0104;

public class 무기 {
	
	// 클래스의 필드
	// private 라는 접근제한자를 추가
	// private: 나만 사용할 수 있음
	private String 이름;
	
	// protected : 자식에게 접근할 수 있음
	protected int 데미지;
	
	private int 크리티컬확률;
	
	int 내구도;
	
	// getter로 접근이 제한된 요소에 접근하게 하자
	public String get이름() {
		return this.이름; // 필드에 이름을 반환함
	}
	
	// setter는 접근이 제한된 요소를 수정할 수 있게 함
	// setter는 리턴타입이 없어서 void를 쓴다
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	
	// 오버라이딩
	public void 공격 () {
		System.out.println(this.데미지 + "의 데미지로 공격을 했습니다.");
	}
}
