package kr.ac.kopo.day08.extend;

// ������(Manager)�� ���(Employee)�� �� ���´� ��� ���ǿ� ���� -> ��Ӱ���
public class Manager02 extends Employee {

	Employee[] empList; // ����������

	Manager02() {
	}

	// �Ʒ��� �� �޼ҵ常 �ۼ��ϸ� ���� Ŭ���� �����ڰ� ���ǵ��� �ʾҴٰ� ������
	// ���� Ŭ������ �Ű����� ���� "�⺻ ������" �ϳ� ������ְ� ���� ����Ŭ���� �����ڿ� "super()"�� ��� ���� ����
	Manager02(String name, int salary, String grade, Employee[] empList) {
		// ���⿡ super.name �̷��� ��������� ���� name,sal,grade��
		// manager02 ������ ���� employee ���� Ŭ�������� ����Ǿ������Ƿ�
		// ���� super Ű���带 �� �ʿ� ����. �׳� this �ᵵ ���� ������ ����
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	// ���� annotation �ڵ��ּ����� �������̵� ������ ǥ�����ֱ�!
	// �ڵ��ּ� �޸� �߸� ���� �� ȭ�鿡 ������ �ʴ� ������ ������ ������ �̸� �˷���
	@Override
	void info() {

		// < �޼ҵ� �������̵� �߻� >
		// this.info() : ���� Manager02 Ŭ������ info() �޼��� ���� -> ���� �����÷ο� ����
		// super.info() : �θ� Employee Ŭ������ info() �޼ҵ� ����
		super.info();

		// empList�� �������� �ʱ�ȭ, �������� Employee ���� Ŭ������ �����ؼ� �ʱ�ȭ��
		System.out.println("----------------------------------------");
		System.out.println("\t������� ���");
		System.out.println("----------------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("----------------------------------------");
	}
}