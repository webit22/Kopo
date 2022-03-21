package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {

	/*
	 * �Ķ���ͷ� ����� ������ ������ ���
	 * 
	 * @param dan ��´�
	 */

	void print(int dan) {
		System.out.println("*** " + dan + "�� ***");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
	}

	/* 2 - 9 �� ������ ������ ��� */
	void print() {
		print(2, 9);
//		for (int dan = 2; dan <= 9; dan++) {
//			print(dan);
//		}
	}

	/*
	 * �Ķ���ͷ� ����� ���۴�~����� ������ ������ ���
	 * 
	 * @param start ���۴�
	 * 
	 * @param end �����
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