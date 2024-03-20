package sec05.exam03.package1;

// public 을 지우면 defalut 접근 제한자를 가진다. 즉, 패키지 안에서만 사용가능
class A {

	A() {
		// private이라서 같은 패키지라서 못씀
//		B b = new B("b");
		
		B b = new B();
//		b.a3 = 3;
//		b.test3();
	}
}

