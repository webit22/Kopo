package kr.ac.kopo.day06;

/*
**********
Hello
**********
Hi
**********
Bye
**********
*/

public class MethodMain01 {
	static void printStar(char ch, int cnt) {
		for (int i = 0; i < 10; i++) {
			System.out.print(ch);
		}
		System.out.println();
		return; // ���ް�/ ���� ȣ���ߴ� ��ȣ���� �޼ҵ�� ���ư���
	}

	public static void main(String[] args) {
		printStar('*', 10);
		System.out.println("Hello");
	}
}
