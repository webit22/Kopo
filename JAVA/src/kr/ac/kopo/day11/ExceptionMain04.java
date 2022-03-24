package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain04 {

	public static void main(String[] args) {
		try {
			Random r = new Random();
			int num = r.nextInt(3); // 0, 1, 2

			System.out.println("num : " + num);
			System.out.println(10 / num);

			String str = "hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(0));

		} catch (ArithmeticException | StringIndexOutOfBoundsException ae) {
//			multi catch문 쓰지 않고 예외처리하는 방법
			System.out.println("예외발생 : " + ae.getMessage());
			ae.printStackTrace(); // 어느 줄에서 에러 발생했는지 출력해줌
		}

		System.out.println("main end...");
	}
}
