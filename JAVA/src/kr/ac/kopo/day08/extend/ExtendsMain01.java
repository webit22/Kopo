package kr.ac.kopo.day08.extend;

public class ExtendsMain01 {

	public static void main(String[] args) {
		Employee e = new Employee("ȫ�浿", 3300, "���");
		Employee e2 = new Employee("���浿", 3500, "���");
		Employee e3 = new Employee("���浿", 4200, "�븮");
		Employee e4 = new Employee("�ѱ浿", 4300, "�븮");
		Employee e5 = new Employee("���浿", 5200, "����");

		Employee[] empList = { e, e4, e5 };
		Manager01 m = new Manager01("���ְ�", 9000, "����", empList);
		Manager02 m2 = new Manager02("���ְ�", 9000, "����", empList);
		Manager03 m3 = new Manager03("���ְ�", 9000, "����", empList);

		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		m.info();
		m2.info();
		m3.info();
	}
}