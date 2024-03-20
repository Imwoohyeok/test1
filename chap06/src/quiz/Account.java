package quiz;

/*
 * 계좌 개설 
 * 
 * 계좌번호, 잔액, 사용여부 (은행명, 예금주, 히스토리, 이체기능)
 * 예금기능, 출금기능, 잔액조회
 * 
 * 기능 : 메소드
 * 
 * this 는 전역변수 즉, 밖에 변수를 쓸 때 사용
 */
public class Account {
	// 필드, 맴버변수
	String accNo;		// 계좌번호
	long balance = 0;	// 잔액
	boolean isUse = false; // 계좌 사용여부
	
	// 기본 생성자는 없어도 되긴함
	Account(String accNo) {
		this.accNo = accNo;	// (filed)계좌번호 = 계좌번호
		this.balance = 1000; // 잔액이 1000원이 됨
	}
	
	
	// 예금기능
	// 잔액에 일정금액을 더해서 저장
//	예금 = balance + 금액;
	
	/**
	 * 예금기능
	 * 
	 * 메소드명 : in
	 * 전달인자 : long 일정 금액
	 * 리턴타입 : 없음
	 * 
	 */
	void in(long balance) { 		// void : 리턴타입
		if(balance > 0) {
			this.balance = this.balance + balance; // (filed)잔액 + 예금
			System.out.println(balance +"원이 입금되었습니다");
		} else {				// 0보다 작으면 입금이 안되는 조건문
			System.out.println("입금액을 확인해주세요. 입금액 :" + balance);
		}
	}
	
	
	/**
	 * 출금기능
	 *  - 출금이란? 잔액에서 일정금액을 빼고 저장하기
	 *  메소드명 : out
	 *  전달인자 : long 출금 금액
	 *  리턴타입 : 없음
	 */
	// if 조건 (잔액이 출금액보다 클 때 출금됨) && (잔액이 0보다 커야함 -를 출금할 수 없기 때문에)
	// 조건이 안 맞으면 출금액을 확인해주세요
	void out(long balance) {
		if((this.balance >= balance) && (balance > 0) ) {		
			this.balance = this.balance - balance; // (filed)잔액 + 출금
			System.out.println(balance +"원이 출금되었습니다");
		} else {				
			System.out.println("출금액을 확인해주세요. 출금액 :" + balance);
		}
	}
	

	/**
	 *  잔액조회
	 *  
	 *  메소드명 : print
	 *  전달인자 : 없음
	 *  리턴타입 : long 잔액
	 */
	
	// 잔액 출력
	long print() {
		System.out.println("잔액 :" + balance);
		return this.balance;
	}
	
	// 계좌별명 (농협,국민)
	void printAccInFo() {
		System.out.println("accNo :" + this.accNo);
	}
	
}
