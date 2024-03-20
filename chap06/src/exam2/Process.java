package exam2;

//작업을 처리하는 클래스
public class Process {

	// 하나의 아이템을 처리하는 메서드
	void run(Item item) {

		// 아이템에서 이름을 가져옴
		String name = item.getName();
		System.out.println(name + "적용완료");
	}

	// 두 개의 아이템을 처리하는 메서드
	void run(Item item, Item item2) {

		// 첫 번째 아이템에서 이름을 가져옴
		String name = item.getName();
		System.out.println(name + "적용완료");

		// 두 번째 아이템에서 이름을 가져옴
		String name2 = item2.getName();
		System.out.println(name2 + "적용완료");
	}

}
