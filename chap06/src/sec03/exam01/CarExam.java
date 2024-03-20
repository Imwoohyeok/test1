package sec03.exam01;

public class CarExam {

	public static void main(String[] args) {
		
		// 기본생성자가 아니면 전달인자를 줘야 실행된다.
		Car car = new Car(15);
//		car.gas = 5;
		Car car2 = new Car(20);
//		car2.gas = 5;
		
		
		System.out.println("car.gas :" + car.gas);	// > 0
		car.gas = 10;
		System.out.println("car.gas :" + car.gas); // > 10
		System.out.println("car2.gas :" + car2.gas); // 0
	
		Car car3 = new Car(10);
	
	
	}

}
