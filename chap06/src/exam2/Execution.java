package exam2;

//실행을 담당하는 클래스
public class Execution {

	public static void main(String[] args) {
		
		// Process 클래스의 인스턴스 생성
		Process process = new Process();
		
		// 첫 번째 아이템 생성 및 이름 설정
		Item item1 = new Item();
		item1.setName("볼트");
		
		// 첫 번째 아이템을 처리하는 메서드 호출
		process.run(item1);
		
		
		// 두 번째 아이템 생성 및 이름 설정
		Item item2 = new Item();
		item2.setName("너트");
		
		// 두 개의 아이템을 처리하는 메서드 호출
		process.run(item1, item2);
		
		
	}

}
