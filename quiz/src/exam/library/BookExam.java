package exam.library;

public class BookExam {

	public static void main(String[] args) {
	
		Book book1 = new Book("제목1", "저자1", "출판사1", 2023, "abc123");
		
		book1.rentInfo();	//대여가능여부
		
		book1.rent();	// 대여
		book1.rent();	// 이미 대여중
		
		book1.turnBack();	// 반납
		book1.turnBack();	// 대여한적이 없어 반납안됨
		
		
		Book book2 = new Book("제목2", "저자2", "출판사2", "def456");
		book2.rentInfo();	//대여가능여부
		
		book1.rent();
		book2.rent();
		
		Book[] books = new Book[10];
		books[0] = book1;
		books[1] = new Book("제목2", "저자2", "출판사2", "def456");
		
		books = new Book[] {book1, book2, new Book("제목3", "저자3", "출판사3", "ccc789")};
		
		
	}

}
