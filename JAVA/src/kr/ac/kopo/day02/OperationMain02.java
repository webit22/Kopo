package kr.ac.kopo.day02;
import java.util.Scanner;
/*
 * a �Է� : 10
 * b �Է� : 3
 * 10�� 3�� ����ΰ�? false
 * a �Է� : 10
 * b �Է� : 5
 * 10�� 5�� ����ΰ�? true
 * */

public class OperationMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a �Է� : ");
		int a = sc.nextInt();
		System.out.print("b �Է� : ");
		int b = sc.nextInt();
		
		boolean res = ((a % b == 0)? true : false);
		System.out.println(a + "�� " + b + "�� ����ΰ�? " + res);
		sc.close();
	}
}
