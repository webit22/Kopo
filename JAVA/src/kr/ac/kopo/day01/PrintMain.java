package kr.ac.kopo.day01;

/*
 * ��� ����
 * 1. ������ ���
 * 2. �Ǽ��� ���
 * 3. ������ ���('A', 'b') : �빮��, �ҹ���, ���ڹ���, Ư������, ���鹮��('\n', '\t')
 * 4. ���ڿ� ���("������")
 * 5. ���� ���(true, false)
 * */

public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);
		System.out.println(23 + "��");
		
		// 10 + 20 = 30
		System.out.println(10 + "+" + 20 + "=" + 10 + 20);
		System.out.println(10 + "+" + 20 + "=" + (10 + 20));
		
		System.out.printf("[%7d]\n", 12000);
		System.out.printf("[%-7d]\n", 1234);
		System.out.printf("[%04d]\n", 10);
		System.out.printf("[%.2f]\n", 12.3456);
		
	}
}
