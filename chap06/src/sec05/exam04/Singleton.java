package sec05.exam04;

public class Singleton {
	
//	static Singleton s = null;
	// private: 내부에서만 쓰게
	// final : null로 바꾸지 못하게
	private static final Singleton s = new Singleton();
	
	private Singleton() {	// new를 못하게 막음 즉, 생성자를 못씀
		
	}
	
	static Singleton getInstance() {
//		if(Singleton.s == null) {
//			Singleton.s = new Singleton();			
//		}
		return Singleton.s;
	}

}
