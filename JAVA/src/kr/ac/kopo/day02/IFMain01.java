package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 1 �Է½� "ONE" ���
 * 2       TWO
 * 3       THREE
 * else    ERROR
 * */

public class IFMain01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - 3 ������ ���� �Է�");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("ONE");
		} else if(num == 2) {
			System.out.println("TWO");
		} else if(num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
	}
}
