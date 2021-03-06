package kr.ac.kopo.day08;

public class Employee {
	String name;
	int salary;
	String grade;

	// 총 사원 수 (일반 instance 객체 2개로 접근하면 독립적인 두 객체마다 cnt = 1이 됨)
	// 그래서 cnt 변수를 static으로 만들면 Employee class에 대해 총 사원 수를 cnt 할 수 있음
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
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}

	// employeeCnt가 static 변수이므로, employeeCnt에 접근하려면 이 메소드도 static이어야함!
	// class 변수, 일반 지역변수 헷갈리므로 가독성을 높이기위해 그냥 employeeCnt가 아니라 앞에 클래스명.을 붙임
	static void employeeCntInfo() {
		System.out.println("총 사원 수 : " + Employee.employeeCnt + "명");

	}
}
