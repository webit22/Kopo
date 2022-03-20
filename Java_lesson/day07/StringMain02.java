package kr.ac.kopo.day07;

public class StringMain02 {
	public static void main(String[] args) {
//		String str = "Hello";
//		String str2 = "Hello";

		String str = new String("Hello");
		String str2 = new String("HELLO");

		if (str == str2) // ���� �����ִ� �ּҰ��� ��
			System.out.println("�ּҺ� : ����");
		else
			System.out.println("�ּҺ� : �ٸ���");

		if (str.equals(str2) == true)
			System.out.println("���ڿ��� : ����");
		else
			System.out.println("���ڿ��� : �ٸ���");

		System.out.println("��ҹ��� ������� ���ڿ� �� : " + str.equalsIgnoreCase(str2));

		String[] names = { "ȫ�浿", "ȫ�浿", "ȫ���", "�ڱ浿", "ȫ����", "���浿" };
		System.out.println("< full name�� ȫ�浿�� ��� ��� >");
		for (String name : names) {
			if (name.equals("ȫ�浿")) {
				System.out.println(name);
			}
		}

		System.out.println("< ���� ȫ���� ��� ��� >");
		for (String name : names) {
			if (name.startsWith("ȫ")) {
				System.out.println(name);
			}
		}

		System.out.println("< �̸��� �浿�� ��� ��� >");
		for (String name : names) {
			if (name.endsWith("�浿")) {
				System.out.println(name);
			}
		}

		System.out.println("< �̸��� ȫ�� ���Ե� ��� ��� >");
		for (String name : names) {
			if (name.contains("ȫ")) {
				System.out.println(name);
			}
		}

		str = "apple";
		str2 = "banana";
		int cmp = str.compareTo(str2);
		if (cmp == 0) {
			System.out.println(str + " == " + str2);
		} else if (cmp > 0) {
			System.out.println(str + " > " + str2);
		} else {
			System.out.println(str + " < " + str2);
		}
	}
}