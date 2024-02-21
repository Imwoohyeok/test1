package sec03.exam02추상화;

public class Dog extends Animal{

	String name;
	
	Dog(){
		this.kind = "포유류";
	}
	
	Dog(String name){
		this.name = name; // 자식꺼
		super.name = "부모꺼";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
