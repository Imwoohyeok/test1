package library;

public class LibraryExam {

	public static void main(String[] args) {
		
		Library a1 = new Library("자바기초");
		Library a2 = new Library("코딩책");
		Library a3 = new Library("css");
		
		// 책
		a1.getBook();
		a2.getBook();
		a3.getBook();
		
		// 대여 상태 확인
		a1.rental();
		a2.rental();
		a3.rental();
		
		
	}

}
