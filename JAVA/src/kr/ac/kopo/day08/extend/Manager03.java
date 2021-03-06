package kr.ac.kopo.day08.extend;

// 관리자(Manager)는 사원(Employee)의 한 형태다 라는 조건에 부합 -> 상속관계
public class Manager03 extends Employee {

	Employee[] empList; // 관리사원목록

	// 기본 생성자는 super();를 자동 호출함. 생략된 것 뿐.
	Manager03() {
	}

	// 생성자에 매개변수가 있다면 super()를 생략할 수 없음
	Manager03(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade);
		this.empList = empList;
	}

	@Override
	void info() {
		super.info();

		System.out.println("----------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("----------------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("----------------------------------------");
	}
}
