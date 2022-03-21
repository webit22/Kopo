package kr.ac.kopo.day08.extend;

public class Manager01 {

	String name;
	int salary;
	String grade;
	Employee[] empList; // ����������

	Manager01(String name, int salary, String grade, Employee[] empList) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	void info() {
		System.out.println("����� : " + name + ", ���� : " + salary + "����, ���� : " + grade);
		System.out.println("----------------------------------------");
		System.out.println("\t������� ���");
		System.out.println("----------------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("----------------------------------------");
	}
}