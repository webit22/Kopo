package kr.ac.kopo.day11;

import java.util.Random;

/* collection - generic을 쓰면서 묵시적, 명시적 형변환 노가다를 줄여줌! */

class A {
	private Object data;

	A(Object data) {
		this.data = data;
	}

	Object getData() {
		return data;
	}

	void setData(Object data) {

	}
}

// class B : class A를 제네릭으로 구현하는 경우
class B<T> {
	private T data;

	B(T data) {
		this.data = data;
	}

	T getData() {
		return data;
	}

	void setData(T data) {
		this.data = data;
	}
}

public class GenericMain {

	public static void main(String[] args) {
//		class B : class A를 제네릭으로 구현하는 경우
//		제네릭 쓰면 b.getData() 호출 시 Object형이 String형으로 자동 형변환 되므로
//		바로 .length() 써서 길이 구할 수 있음
		B<String> b = new B<String>(new String("hello"));
		System.out.println("길이 : " + b.getData().length());

		B<Random> b2 = new B<Random>(new Random());
		System.out.println("추출된 정수 : " + b2.getData().nextInt(10) + 1);

		B<String> b3 = new B<String>("byebye");
		b3.setData("aa");

//		class A로 일일히 구현하는 경우
		A a = new A(new String("hello"));
		String data = (String) a.getData();
		System.out.println("길이 : " + data.length());

		A a2 = new A(new Random());
		int random = ((Random) a2.getData()).nextInt(10) + 1;
		System.out.println("추출된 정수 : " + random);
	}
}
