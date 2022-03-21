package kr.ac.kopo.day06;

class Cat {
	void sleep() {
		System.out.println("����̰� ���� �ܴ�");
	}

	void meow() {
		System.out.println("����̰� �Ŀ� �Ѵ�");
	}
}

class Method {
	// method overloading
	// ���� Ŭ���� ������ �޼ҵ���� �����鼭 �Ű������� ������ Ÿ���� ���� �ٸ� ��
	void call() {
		System.out.println("call() �޼ҵ� ȣ��");
	}

	void call(int i) {
		System.out.println("call(int) �޼ҵ� ȣ��");
	}

	void call(double d) {
		System.out.println("call(double) �޼ҵ� ȣ��");
	}

	void call(String str, int n) {
		System.out.println("call(String, int) �޼ҵ� ȣ��");
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
