package sec05.exam04;

public class SingletonExam {

	public static void main(String[] args) {
		
//		Singleton singleton = Singleton.s();
//		Singleton.s = null;
//		Singleton singleton1 = Singleton.test();
		
		Singleton Singleton1 = Singleton.getInstance();
		Singleton Singleton2 = Singleton.getInstance();
		
		System.out.println(Singleton1 == Singleton2);
		
	}

}
