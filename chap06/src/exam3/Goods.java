package exam3;

public class Goods {
	
	// 필드
	private String name; // 상품명
	int price; // 가격
	
	// 상품을 반환하는 메서드
	String getName() {
		return name;
	}
	// 상품을 설정하는 메서드
	void setName(String name) {
		this.name = name;
	}
		
	
	int getPrice() {
		return price;
	}
	// 가격을 설정하는 메서드
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
