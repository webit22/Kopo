package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {

	/*
	 * 파라미터로 날라온 정수의 구구단 출력
	 * 
	 * @param dan 출력단
	 */

	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
	}

	/* 2 - 9 단 사이의 구구단 출력 */
	void print() {
		print(2, 9);
//		for (int dan = 2; dan <= 9; dan++) {
//			print(dan);
//		}
	}

	/*
	 * 파라미터로 날라온 시작단~종료단 사이의 구구단 출력
	 * 
	 * @param start 시작단
	 * 
	 * @param end 종료단
	 */
	void print(int start, int end) {
		for (int dan = start; dan <= end; dan++) {
			print(dan);
		}
	}

	int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}
}
