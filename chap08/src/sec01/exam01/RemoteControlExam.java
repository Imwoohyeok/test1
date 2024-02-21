package sec01.exam01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		Television television = new Television();
		RemoteControl rc1 = (RemoteControl)television;
		rc1.turnOn();
		
		RemoteControl rc2 = new Audio();
		rc2.turnOff();
		
		System.out.println("======");
		
		SmartTV smartTv = new SmartTV();
		search(smartTv, "naver");
		on(smartTv);
		
		System.out.println(television.volume);
		setVol(television);
		System.out.println("after : "+ television.volume);
		
		Television television2 = setVol2(television);
		System.out.println("after2-1 : "+ television.volume);
		System.out.println("after2-2 : "+ television2.volume);
	
		System.out.println(television);
		
		on(television);
	}
	
	static void search(Searchable s, String url) {
		System.out.println("검색을 대신합니다");
		s.search(url);
	}
	// on 메소드
	static void on(RemoteControl rc) {
		System.out.println("2.켜는 거 대신 해줌");
		rc.turnOn();
	}
	static void on(Television rc) {
		System.out.println("1.켜는 거 대신 해줌");
		rc.turnOn();
	}
//	static void on(Searchable rc) {
//		System.out.println("3.켜는 거 대신 해줌");
//	}
	
	
	static void setVol(Television tv) {
		tv.volume = 10;
	}
	
	// 깊은 복사 개념
	static Television setVol2(Television tv) {
		
		Television tv2 = new Television();
		tv2.volume = tv.volume; // 깊은복사
		
		tv2.volume = 100;
		
		return tv2;
	}
}
