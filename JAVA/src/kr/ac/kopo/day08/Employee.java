package kr.ac.kopo.day08;

public class Employee {
	String name;
	int salary;
	String grade;

	// �� ��� �� (�Ϲ� instance ��ü 2���� �����ϸ� �������� �� ��ü���� cnt = 1�� ��)
	// �׷��� cnt ������ static���� ����� Employee class�� ���� �� ��� ���� cnt �� �� ����
	static int employeeCnt;

	Employee() {
		Employee.employeeCnt++;
	}

	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		Employee.employeeCnt++;
	}

	void info() {
		System.out.println("����� : " + name + ", ���� : " + salary + "����, ���� : " + grade);
	}

	// employeeCnt�� static �����̹Ƿ�, employeeCnt�� �����Ϸ��� �� �޼ҵ嵵 static�̾����!
	// class ����, �Ϲ� �������� �򰥸��Ƿ� �������� ���̱����� �׳� employeeCnt�� �ƴ϶� �տ� Ŭ������.�� ����
	static void employeeCntInfo() {
		System.out.println("�� ��� �� : " + Employee.employeeCnt + "��");

	}
}
