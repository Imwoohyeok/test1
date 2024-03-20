package sec02.exam01;

import sec01.exam01.Student;

public class Car {
	
	// 필드
	String model = "그렌저";
	// 초기화를 안해도
	// 0, false, null로 자동 초기화됨 (필드에 특징)
	int speed;
	Student s1 = new Student();
	
	char c;
	
	int gas = 0;
	// speed 변수의 값을 60으로 바꾸는 행동으로 하는 것 
	// 여기는 행동을 못함, 그래서 에러
//	speed = 60; 
	
	// gas의 값이 0이면 false
	// 그렇지 않으면 true
	
	boolean isLeftGas() {
		
//		boolean result = false;
		if( (gas == 0) ) {
//			result = true;
			return true;
		} else {
			return false;
		}
		
//		return result;
	}
	
	// 필드 speed의 값을 10 증가
	void speedUp() {
		int a = 1;
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
	
	
	
	
}
