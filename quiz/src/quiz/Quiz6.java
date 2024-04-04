package quiz;

public class Quiz6 {
	
	// 문제 1번
	/*
	 * 멜론
	 * 노래, 가수, 소속사, 장르
	 * 발매일, 가사
	 * 
	 * 기능
	 * 제목, 가수, 재생시간, 가사
	 * 재생, 일시정지, 멈춤, 정보보기
	 */
	
	// 필드
	public String singer;	// 가수
	public String title; // 제목
	public String genre; // 장르
	String playtime = "4:02";	// 재생시간
	
	public int album; // 앨범
	
	// 기본생성자
	
	// 매개변수를 가진 생성자
	public Quiz6(int album, String title, String singer, String genre){
		this.album = album; 
		this.title = title;
		this.singer = singer;
		this.genre = genre;
	}
	
	// 필드 값을 외부로 리턴해줌
	public String getTitle() {
		return title;
	}
	// 외부값을 받아 필드를 변경함
	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlaytime() {
		return playtime;
	}
	
	public void setPlaytime(String playtime) {
		this.playtime = playtime;
	}
	
	int sum = 0;
	public void show() {
		System.out.println(album + "번앨범/" + "제목은 : " + title + ", 가수는 : " + singer + ", 장르는 : " + genre);
	}

	public Quiz6 play() {
		System.out.println("-------재생중-------");
		System.out.println("");
		return null;
	}

	public void stop() {
		
	}
	
}
