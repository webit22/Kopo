package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {
		try {
			Random r = new Random();
			int num = r.nextInt(3); // 0, 1, 2

			System.out.println("num : " + num);
			System.out.println(10 / num);

			String str = "hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(0));

		} catch (ArithmeticException ae) {
			System.out.println("예외발생 : " + ae.getMessage());
			ae.printStackTrace(); // 어느 줄에서 에러 발생했는지 출력해줌
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException : " + se.getMessage());
		}

		System.out.println("main end...");
	}
}
