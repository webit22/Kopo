package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee.employeeCntInfo();
		Employee e = new Employee("ȫ�浿", 3300, "���");
		Employee e2 = new Employee("���浿", 3800, "�븮");

		e.info();
		e2.info();

		Employee.employeeCntInfo();
	}
}