package quiz;

public class AccountExam {

	public static void main(String[] args) {
		
		Account acc1 = new Account("기업통장"); // 괄호안에 String 넣어줘야함
		acc1.print(); // 전달인자 쓸데없으면 안 받아도됨
		
		acc1.in(5000);	// 5000원 입금
		acc1.print();	// 잔고: 6000원
		acc1.in(-500);	// 입금액 -는 안되게 막아서 else
		
		acc1.out(4000);	// 4000원 출금
		acc1.print();	// 잔액 2000원
		
		acc1.out(4000);	// 4000원 출금 잔액이 2000이라 출력안됨
		acc1.out(-4000); // 출금액 -는 안되게 막아서 else
		
		acc1.printAccInFo(); // 계좌번호 : 기업통장
		
		Account acc2 = new Account("농협통장"); // 다른은행통장 개설
		acc2.in(1000000);	// 100만원 입금
		
		acc1.print();	// 기업은행.....잔액 : 2000원
		acc2.print();	// 농협은행.....잔액 : 1001000원	초기값 1000원이라서 100만천원
		// acc1 : 기업  acc2 : 농협
		
		acc2.balance = 5000; // 값을 바꿔줌 5000원으로
		acc2.print();	// 따라서, 잔고가 5000원이 됨
		
		
		
		
	}

}
