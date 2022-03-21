package kr.ac.kopo.day07;

/*
 * ������ Ư¡
 * 1. Ŭ������� ����
 * 2. ��ȯ���� ����
 * 3. ����Ʈ ������ ���� : Ŭ���� ���� �����ڰ� �������� ���� ��� JVM�� �ڵ����� ������
 * */

class Car {
	Car() {
		System.out.println("Car() ������ ȣ��");
	}

	Car(int i) {
		System.out.println("Car(int) ������ ȣ��");
	}

	Car(int i, String s) {
		System.out.println("Car(int, String) ������ ȣ��");
	}
}

public class ConstructorMain01 {
	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car(10);
		Car c3 = new Car(10, "aaa");
	}
}
