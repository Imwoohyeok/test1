package quiz;

/*
 * 체력 : hp
 * 방어력 : dp
 * 리턴타입 : 없음
 * a1 : hp: 100, dp: 10
 * 
 * 
 */
public class Quiz5 {
	// 필드
	String user; // 유저명
	
	int hp1 = 100; // 체력 100
	int dp1 = 10; // 방어력 10
	
	
	// 전달인자
	public Quiz5(String user) {
		this.user = user;	// (filed)유저 = 유저
	}

	// 공격받는 기능
	// 체력 - (공격받은 수치 - 방어력)
	/**
	 * 메소드명: attack
	 * 전달인자: int
	 * 리턴타입: 없음
	 * 
	 */
	int sum = 0;
	void attack(int attack) {
		if(hp1 > attack && attack != 0) {
			this.hp1 =  this.hp1 -(attack - dp1);	//this.hp1 체력이 줄어듬
			System.out.println(attack + "피해를 받았습니다");			
		} else if(attack == 0) {
			System.out.println("공격을 회피했습니다");	
		}
		else {
			System.out.println("체력이 없어서 " + user + " 님이 죽었습니다");
		}
	}
	
	
	// 회복하는 기능
	// 체력 + 회복물약
	/**
	 * 메소드명: recovery
	 * 전달인자: int
	 * 리턴타입: 없음
	 */
	
	void recovery(int recovery) {
		if(hp1 < 100) {
			this.hp1 = this.hp1 + recovery;
			System.out.println(recovery + "치유를 받았습니다");
		} else {
			System.out.println("체력이 풀입니다");
		}
	}
	
	// 체력 확인
	int print() {
		System.out.println("hp1의 체력 :" + hp1);
		return this.hp1;
	}
	
	// 전달인자 사용해서 string 이름변경가능
	void printAccInFo() {
		System.out.println("user :" + this.user);
	}
}
