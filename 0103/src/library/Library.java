package library;

/**
 * 도서관리 시스템
 * 
 * 책 제목, 저자, 출판사, 출판년도, 고유번호 대여가능 여부(boolean)
 */
public class Library {
	// 필드
	String book; // 책 제목
	String author; // 저자
	String publisher; // 출판사
	int year; // 년도
	int number; // 고유번호
	boolean rental = true; // 대여가능여부

	// 생성자
	public Library(String book) {
		this.book = book;
		this.author = author;
		this.publisher = publisher;
		this.year = 2024;
		this.number = number;
	}

	public Library(String book, String author) {
		this.book = book;
		this.author = author;
		this.publisher = publisher;
		this.year = 2024;
		this.number = number;
	}

	public Library(String book, String author, String publisher) {
		this.book = book;
		this.author = author;
		this.publisher = publisher;
		this.year = 2024;
		this.number = number;
	}

	public Library(String book, String author, String publisher, int number) {
		this.book = book;
		this.author = author;
		this.publisher = publisher;
		this.year = 2024;
		this.number = number;
	}

	/** 
	 * 책 대여 시스템
	 * BooksLend
	 * 
	 */
	boolean BooksLend(String book) {
		if (this.rental == true) {
			System.out.println("정상적으로 대여가 완료되었습니다.");
			return this.rental = false;
		} else {
			 System.out.println("대여 중인 책은 대여할 수 없습니다.");
	         return this.rental = false;
		}
		
	}

	/*
	 * 대여상태확인
	 * 
	 * 메소드명 : rental 전달인자 : boolean 리턴타입 : 없음
	 * 
	 */
	boolean rental() {
		if (this.rental == true) {
			System.out.println("대여가능합니다");
		} else {
			System.out.println("대여 불가능");
		}
		return rental;

	}

	// 책이름
	void getBook() {
		System.out.println("책이름 :" + this.book);
	}

	// 저자
	void getauthor() {
		System.out.println("저자 :" + this.author);
	}

	// 출판사
	String getpublisher() {
		return this.publisher;
	}

	void setpublisher(String publisher) {
		this.publisher = publisher;
	}

	// 고유번호
	int getnumber() {
		return this.number;
	}

	void setnumber(int number) {
		this.number = number;
	}

}
