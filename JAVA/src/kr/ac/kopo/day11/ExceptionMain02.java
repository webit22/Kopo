package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(3); // 0, 1, 2

		System.out.println("num : " + num);
		try {
			System.out.println(10 / num);
		} catch (ArithmeticException ae) {
			System.out.println("예외발생 : " + ae.getMessage());
			ae.printStackTrace(); // 어느 줄에서 에러 발생했는지 출력해줌
		}

		System.out.println("main end...");
	}
}
