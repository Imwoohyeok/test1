package sec01.exam01;

public class Television implements RemoteControl {
	
	int volume = 0;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {		
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int vol) {
		try {
			
		}catch (Exception e) {
			
		}
	}
	
	@Override
	public void mute() {
		
	}
	
}
