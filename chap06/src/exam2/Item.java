package exam2;

// 한가지 제품의 정보를 담기 위한 클래스
// VO : value object
// DTO : data ransfet object
public class Item {
	
	// 필드
	// 제품의 이름을 저장
	private String name;

	// 제품의 이름을 반환하는 메서드
	String getName() {
		return this.name;
	}

	// 제품의 이름을 설정하는 메서드
	void setName(String name) {
		// 입력된 이름이 null이 아닐 때 이름을 필드에 올려서 저장함
		if (name != null) {
			this.name = name;
		}
	}
}
