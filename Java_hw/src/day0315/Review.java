package day0315;

import java.util.Scanner;

class Icecream {
	String name;
	int price;
}

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ ���̽�ũ�� ���� : ");
		int cnt = Integer.parseInt(sc.nextLine());

		Icecream[] iceArr = new Icecream[cnt]; // �����迭
		for (int i = 0; i < cnt; i++) {
			iceArr[i] = new Icecream();

			System.out.println("\n*** " + (i + 1) + "��° ���̽�ũ�� ���� ���� ***");
			System.out.print("���̽�ũ�� �̸� : ");
			iceArr[i].name = sc.nextLine();
			System.out.print("���̽�ũ�� ���� : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		}

		System.out.println(" < �� " + cnt + "���� ���̽�ũ�� �������� ��� >");
		System.out.println("��ȣ\t���̽�ũ����\t����");
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "\t" + iceArr[i].name + "\t" + iceArr[i].price);
			sum += iceArr[i].price;
		}
		System.out.println("\n�� �Ǹž� : " + sum);
		sc.close();
	}
}