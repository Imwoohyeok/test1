package quiz;

public class Quiz5Exam {

	public static void main(String[] args) {
		
		Quiz5 game = new Quiz5("임우혁");
		game.printAccInFo();	// 전달인자 "임우혁"을 받아서 출력됨
		
		game.print();	// 체력확인
		
		game.attack(50); // 50을 때렸는데 기본체력 100에 방어10해서 60
		game.print();	// 체력 60
		
		game.recovery(20); // 체력 20회복해서 체력 80
		
		game.print(); // 체력 80
		game.attack(50); // 피 40남고
		game.attack(0);	// 회피하고
		game.print();	//40
		game.attack(50);
		
		
	}

}
