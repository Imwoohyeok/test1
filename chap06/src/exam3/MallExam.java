package exam3;

public class MallExam {

	public static void main(String[] args) {
		// 요구사항분석
		// 기획
		// 개발
		// 테스트
		// 출시
				
		/*
		 * 회원이
		 * 장바구니에
		 * 상품을 
		 * 담는다
		 */
		
		// 상품 2개만듬
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		
		g1.setName("소주");
		g1.setPrice(4000);
		
		g2.setName("족발");
		g2.setPrice(20000);
		
		
		Member m1 = new Member();
		m1.add(g1);
		m1.add(g2);
		m1.add(g1);

		m1.add(null); // 담기 실패
		
		m1.print();
	}

}
