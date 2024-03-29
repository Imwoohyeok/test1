package exam3;

import java.util.ArrayList;

public class Member {
	
	String id; // 아이디
	String name; // 회원명
	
	Basket basket =  new Basket();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 내 장바구니의 add 메소드 호출
	void add(Goods goods) {
		System.out.println("장바구니에 담는 중..");
		
		boolean result = this.basket.add(goods);
		
		if(result) {
			System.out.println("담기 성공");
		} else {
			System.out.println("담기 실패");
		}
	}
	
	// 내 장바구니의 print 메소드 호출
	void print() {
		this.basket.print();
	}
	

}
