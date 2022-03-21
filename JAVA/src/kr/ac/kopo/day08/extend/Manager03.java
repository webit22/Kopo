package kr.ac.kopo.day08.extend;

// ������(Manager)�� ���(Employee)�� �� ���´� ��� ���ǿ� ���� -> ��Ӱ���
public class Manager03 extends Employee {

	Employee[] empList; // ����������

	// �⺻ �����ڴ� super();�� �ڵ� ȣ����. ������ �� ��.
	Manager03() {
	}

	// �����ڿ� �Ű������� �ִٸ� super()�� ������ �� ����
	Manager03(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade);
		this.empList = empList;
	}

	@Override
	void info() {
		super.info();

		System.out.println("----------------------------------------");
		System.out.println("\t������� ���");
		System.out.println("----------------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("----------------------------------------");
	}
}