package kr.ac.kopo.day09;

// class를 설계할 때는 부모, 자식 이렇게 2개씩 움직임!
// class B 호출되어도 super() 로 인해 class A가 먼저 호출, 그 다음에 자식 B 호출됨(총 2개)
class A { // Object class를 상속받음 (extends Object가 숨어있음)
	A() {
		System.out.println("A() 호출");
	}
}

class B extends A {
	B() {
		// super(); 가 숨어있으므로 부모 A 클래스가 먼저 호출됨
		System.out.println("B() 호출");
	}
}

class C extends B {
	C() {
		super();
		System.out.println("C() 호출");
	}
}

public class ExtendMain02 {
	public static void main(String[] args) {
		A a = new A();
	}
}
