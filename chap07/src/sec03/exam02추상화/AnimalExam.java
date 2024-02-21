package sec03.exam02추상화;

public class AnimalExam {

	public static void main(String[] args) {
		
		// abstract 클래스는 인스턴스가 안된다.
//		Animal animal = new Animal();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		
	}

}
