package day0321;

import java.util.Scanner;

class Ice {
	String name;
	int price;
}

public class IceCreamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ice ic = new Ice();

		System.out.print("������ ���̽�ũ�� ���� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("\n*** " + (i + 1) + "��° ���̽�ũ�� ���� ���� ***");
			System.out.print("���̽�ũ�� �̸� : ");
			ic.name = sc.next();
			System.out.print("���̽�ũ�� ���� : ");
			ic.price = sc.nextInt();
		}

		System.out.println(" < �� " + num + "���� ���̽�ũ�� �������� ��� >");
		System.out.println("��ȣ\t���̽�ũ����  ����");

		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "\t" + ic.name + "\t" + ic.price);
			sum += ic.price;
		}
		System.out.println("\n�� �Ǹž� : " + sum);
	}
}