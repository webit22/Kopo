package kr.ac.kopo.day06;

import java.util.Scanner;

public class MethodMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();

		System.out.print("몇 단 : ");
		int dan = gu.getDan();

		gu.print(dan);
		gu.print();

		System.out.print("시작단 입력 : ");
		int startDan = gu.getDan();
		System.out.print("종료단 입력 : ");
		int endDan = gu.getDan();
	}
}
