package sec01.exam01;

public interface RemoteControl {
	// 인터페이스는 생성자가 없다
	
	int MAX_VOLUME = 10;
	public static final int Mint_VOLUME = 0;
	
	String CODE_01 = "E0010"; // 전원 불량
	String CODE_01_MSG = "E0010"; // 전원 불량
	
	// 추상 메소드
	void turnOn();
	public abstract void turnOff();
	void setVolume(int vol);
	
	// default : 메소드를 구현할 수 있음
	// 자식은 override 할 수 있음
	// 안해도됨
	// public은 생략 가능
	public default void mute() {
		System.out.println("음소거");
		setVolume(0);
	}
}
