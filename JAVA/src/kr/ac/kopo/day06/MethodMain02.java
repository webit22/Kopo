package kr.ac.kopo.day06;

class Cat {
	void sleep() {
		System.out.println("고양이가 잠을 잔다");
	}

	void meow() {
		System.out.println("고양이가 냐옹 한다");
	}
}

class Method {
	// method overloading
	// 같은 클래스 내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른 것
	void call() {
		System.out.println("call() 메소드 호출");
	}

	void call(int i) {
		System.out.println("call(int) 메소드 호출");
	}

	void call(double d) {
		System.out.println("call(double) 메소드 호출");
	}

	void call(String str, int n) {
		System.out.println("call(String, int) 메소드 호출");
	}
}

public class MethodMain02 {
	public static void main(String[] args) {
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(10.3);

		Cat nabi = new Cat();
		nabi.meow();
	}
}
