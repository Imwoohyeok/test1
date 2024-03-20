package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		//  괄호 앞에 무조건 변수가 온다.
		// 괄호안에 매개변수
		Car myCar = new Car();
		System.out.println("myCar.model :" + myCar.model);
		String m = myCar.model;
		
		 
		int s = myCar.speed;
		System.out.println("s :" + s);
		
		myCar.speed = 190;
		System.out.println("myCar.speed :"+myCar.speed);
		
		
		Car myCar2 = new Car();
		myCar2.speed = 60;
		
		System.out.println("myCar.speed :"+myCar.speed);
		System.out.println("myCar2.speed :"+myCar2.speed);
		
		Car[] car = new Car[3];
		car[0] = new Car();
		
		Car[] car2 = new Car[] {null, new Car(), new Car()};
		
		
	}
	
}
