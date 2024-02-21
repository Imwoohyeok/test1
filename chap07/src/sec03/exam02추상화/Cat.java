package sec03.exam02추상화;

public class Cat extends Animal {

	Cat(){
		kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
