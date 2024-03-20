package bogang0104;

// extends : 상속화
// 무기를 상속받는다 즉, 부모는 무기
public class 창 extends 무기{
	
	// 오버라이딩
	@Override
	public void 공격 () {
		System.out.println(this.데미지 + "의 데미지로 창을 날렸습니다.");
	}
	
	
}
