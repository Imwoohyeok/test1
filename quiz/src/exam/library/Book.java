package exam.library;

public class Book {
	
	// 필드
	String title;	// 제목
	String writer;	// 저자
	String publish; // 출판사
	int year;		// 출판년도
	String isbn;	// 고유번호
	
	boolean isRentable = true;  // 대여가능여부; true: 대여가능, false: 대여 불가능
	
	// 기본생성자
//	Book(){
//		System.out.println();
//	}
//	
	
	// 전달인자가 있으면 술집들어갈 때 민증처럼 방어됨
	// 1.생성자 : 제목,저자,출판사,출판년도,고유번호
	Book(String title, String writer, String publish, int year, String isbn){
		System.out.println("1 생성자 실행");
//		System.out.println("제목 title : " + title);
		this.title = title;	// 지역변수 제목을 필드 제목에 값을 넣어줌
		this.writer = writer;
		this.publish = publish;
		this.year = year;
		this.isbn = isbn;
	}
	
	// 2.출판년도가 없는 경우 2024년을 기본값으로 가진다
	Book(String title, String writer, String publish, String isbn){
		// 미리 만들어 놓은 생성자 호출해서 떠넘기기
		// 유지보수가 좋다
		// 왜냐면 한군데 몰아서 하나만 수정해도 되기 때문에
		// 다른 생성자를 호출하는 this()는 가장 먼저 실행되야함
		// 전달인자 맞혀줘야함
		
//		int a = 1; // 이렇게 실행하면 안됨
		this(title, writer, publish, 2024, isbn);	// book 메소드 호출(재활용)
		System.out.println("2 생성자 실행");
	}
	
//	 3.대여가능 여부 메소드 
//	 (true,false)관리하는 필드 >> 변수타입 boolean
//	 가능 불가능이 출력되게 구현
	// 메소드명 : rentInfo
	// 전달인자 : 없음
	// 리턴타입 : 없음
	
	void rentInfo() {
		// 대여정보확인
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("출판사 : " + publish);
		System.out.println("년도 : " + year);
		System.out.println("고유번호 : " + isbn);
		
//		if(isRentable == true) {	//밑에라 같은뜻
		if(this.isRentable) {
			System.out.println("대여 가능");
		} else {
			System.out.println("대여 불가능");
		}
	}
	
//	4.대여 메소드 구현
//	대여가 가능한 경우 대여 가능 여부를 변경해서 저장
//	대여가 불가능한 경우 불가능하다는 메시지 출력
	void rent() {
		// 대여가 가능한 경우라면
		if(this.isRentable) {
			System.out.println(this.title + "책을 대여합니다");
			this.isRentable = false; //대여중으로 상태 변환(대여못하게 막아줌)
		} else {
			System.out.println(this.title + "책은 이미 대여중입니다");
		}
	}
	
//	5.반납 메소드 구현
//	반납이 완료되었다는 메시지 출력되고 대여 가능 여부를 변경해서 저장해둠
//	대여한적이 없다면 반납 불가능 메시지 출력
	void turnBack() {
//		if(this.isRentable == flase) {
		if(!this.isRentable) {	// 이뜻은 false
			System.out.println(this.title + "책을 반납합니다");
			this.isRentable = true;	//대여가능상태로 변경
		} else {
			System.out.println(this.title + "이 책은 대여한 적이 없어 반납할 수 없습니다");
		}
	}
	
	
	// Book 클래스 깊은 복사 메소드
	// 메소드명 : deepCopy
	// 전달인자 : Book(얕은 복사)
	// 리턴타입 : Book(깊은 복사된 결과물의 얕은 복사)
	Book deepCopy(Book b) {
		Book newBook = new Book(this.title,
								this.writer,
								this.publish,
								this.year,
								this.isbn);
		return newBook;
	}
	
	// Book 클래스 깊은 복사 메소드
		// 메소드명 : deepCopy
		// 전달인자 : Book(얕은 복사)
		// 리턴타입 : Book(깊은 복사된 결과물의 얕은 복사)
		Book deepCopy() {
			Book newBook = new Book(this.title,
									this.writer,
									this.publish,
									this.year,
									this.isbn);
			return newBook;
		}
}
