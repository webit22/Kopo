package kr.ac.kopo.day11;

import java.util.Scanner;

class MismatchEvenException extends Exception {

	public MismatchEvenException() {
		super();
	}

	public MismatchEvenException(String message) {
		super(message);
	}

}

public class ExceptionMain08 {

//	JVM의 자체 예외처리 시스템으로 예외 던지기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();

			if (num < 0 || num % 2 == 1) {
				throw new MismatchEvenException(num + "은 짝수가 아닙니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
