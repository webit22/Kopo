package kr.ac.kopo.day06;

import java.util.Scanner;

public class MethodMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();

		System.out.print("�� �� : ");
		int dan = gu.getDan();

		gu.print(dan);
		gu.print();

		System.out.print("���۴� �Է� : ");
		int startDan = gu.getDan();
		System.out.print("����� �Է� : ");
		int endDan = gu.getDan();
	}
}