package kr.ac.kopo.day01;

/*
 * 상수 종류
 * 1. 정수형 상수
 * 2. 실수형 상수
 * 3. 문자형 상수('A', 'b') : 대문자, 소문자, 숫자문자, 특수문자, 공백문자('\n', '\t')
 * 4. 문자열 상수("ㄱㄴㄷ")
 * 5. 논리형 상수(true, false)
 * */

public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);
		System.out.println(23 + "살");
		
		// 10 + 20 = 30
		System.out.println(10 + "+" + 20 + "=" + 10 + 20);
		System.out.println(10 + "+" + 20 + "=" + (10 + 20));
		
		System.out.printf("[%7d]\n", 12000);
		System.out.printf("[%-7d]\n", 1234);
		System.out.printf("[%04d]\n", 10);
		System.out.printf("[%.2f]\n", 12.3456);
		
	}
}
