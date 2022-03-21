package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {
	public static void main(String[] args) {
//		String[] strArr = {"�����ͺм�", "�ڹ�", "����"};
		
		String[] strArr = new String[5];
		int loc = 0;
		strArr[loc++] = "������";
		strArr[loc++] = "�����ͺм�";
		strArr[loc++] = "�ڹ�";
		strArr[loc++] = "����";
		
		System.out.println("���ڿ��� �� ���� : " + strArr.length + "��");
		
		/*
		 * �迭�� ��ü ���Ҹ� ��� ���
		 * 1. index�� �̿��� ���  (�������� : 0 ~ length-1)
		 * 2. JDK 1.5������ for���� �̿��� ��� (foreach��) 
		 * 3. Arrays.toString() �޼ҵ带 �̿��� ���
		 * */
		System.out.println("< index�� �̿��� ��� >");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// for(�������� : �迭��){} -> �ַ� ��� �뵵�� ���� �� (�Է� X)
		// ���� ������ŭ for���� ���鼭 strArr�� ��� ���ҿ� ���� s�� �����Ѵ�
		System.out.println("< 1.5������ for���� �̿��� ��� >");
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println("< Arrays.toString() �޼ҵ带 �̿��� ��� >");
		// �迭�� ��� ��ҵ��� �ϳ��� ���ڿ��� ���� : "[ ����, ����, ... ]"
		String result = Arrays.toString(strArr);
		System.out.println(result);
	}
}
