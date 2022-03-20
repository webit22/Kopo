package kr.ac.kopo.day07;

public class Member {

	String name;
	int age;
	String bloodType;

	// ������� �����ϱ� (�ƴϸ� �����̶� �Բ� �ᵵ ��)
	Member() {
		// ���������� ������� �ʾ����Ƿ� �Ʒ� �������� class�� ����������� �� �� ����
		// �׷��� this. ���� ������
		this("�� �� ����", -1, "�� �� ����");
	}

	Member(String name) {
		this(name, -1, "�� �� ����");
	}

	Member(String name, int age) {
		// "new"�� ������� ������ ȣ�� ����.
		// �׳� Member(...); �� �޼ҵ� ȣ��� �ν��ϹǷ� ������.
		this(name, age, "�� �� ����");
	}

	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	// �� ȸ���� ������ ����ϱ����� �޼ҵ�
	void info() {
		System.out.println("�̸� : " + name + ", ���� : " + age + ", ������ : " + bloodType);
	}
}
