package bank;

public class BankDAO {
	
	// 필드에 왜 값이 안 변하지..
	int balance;	// 잔액
	
	
	// 입금하는 메소드
	void in(int won) {
		if(won > 0) {	// 입금액이 0보다 클 때
			this.balance = this.balance + won; // (filed)잔액 + 예금
			System.out.println(won +"원이 입금되었습니다");
		} else {	
			System.out.println("입금할 수 없습니다");
		}
	}
	
	// 출금하는 메소드
	void out(int won) {
		// 잔액이 balance보다 크거나 같거나 balance가 0보다 클 때
		// 잔액에서 balance를 뺌
		if((this.balance >= won) && (won > 0) ) {		
			this.balance = this.balance - won; // (filed)잔액 - 출금
			System.out.println(won +"원이 출금되었습니다");
		} else {				
			System.out.println("출금액을 확인해주세요. 출금액 :" + won);
		}
	}
	
	// 잔액 확인 메소드
	int print(int won) {
//		System.out.println("잔액 :" + this.balance);
		return won;
	}
	
}
