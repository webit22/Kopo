package kr.ac.kopo.day05;

// ����Ŭ����
public class CarMain {
	public static void main(String[] args) {
		String[] names = new String[2];
		String[] company = new String[2];

		Car c = new Car();
		c.name = "�ҳ�Ÿ";
		c.company = "����";
		Car c2 = new Car();
		c2.name = "K9";
		c.company = "���";

		System.out.println("ù��° �ڵ����� : " + c.name);
		System.out.println("�ι�° �ڵ����� : " + c2.name);
	}
}