package sec01.exam01;

public class SmartTV implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "에서 검색중..");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트TV를 켭니다");
	}

	@Override
	public void turnOff() {		
		System.out.println("스마트TV를 끕니다");
	}

	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub

	}

}
