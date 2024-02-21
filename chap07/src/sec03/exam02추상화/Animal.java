package sec03.exam02추상화;


// 추상클래스는 단독으로 사용할 수 없다
// 즉, new할 수 없다
// 즉, 부모 전용 클래스다
// 즉, 상속된 이후에 쓸 수 있다
// final이나 abstract은 하나만 쓸 수 있다
public abstract class Animal {
	
	public String kind;
	String name;
	
	public void breathe() {
		System.out.println("숨쉬어!");
	}
	
	public abstract void sound();
}
