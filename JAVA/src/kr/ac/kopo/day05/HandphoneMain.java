package kr.ac.kopo.day05;

class Handphone {
	String name;
	String phoneNumber;
	String company;
}

public class HandphoneMain {
	public static void main(String[] args) {
		Handphone hp1 = new Handphone();
		hp1.name = "ȫ�浿";
		hp1.phoneNumber = "010-1111-2222";
		hp1.company = "�Ｚ";

		Handphone hp2 = new Handphone();
		hp2.name = "���浿";
		hp2.phoneNumber = "010-3333-4444";
		hp2.company = "����";

		Handphone hp3 = new Handphone();
		hp3.name = "���浿";
		hp3.phoneNumber = "010-5555-6666";
		hp3.company = "ȭ����";

		Handphone[] hpArr = { hp1, hp2, hp3 };
		for (Handphone phone : hpArr) {
			System.out.println("����� : " + phone.name + ", ��ȭ��ȣ : " + phone.phoneNumber + ", ������ : " + phone.company);
		}
	}
}