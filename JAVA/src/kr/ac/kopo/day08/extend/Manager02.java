package kr.ac.kopo.day08.extend;

// 관리자(Manager)는 사원(Employee)의 한 형태다 라는 조건에 부합 -> 상속관계
public class Manager02 extends Employee {

	Employee[] empList; // 관리사원목록

	Manager02() {
	}

	// 아래의 이 메소드만 작성하면 상위 클래스 생성자가 정의되지 않았다고 에러남
	// 하위 클래스에 매개변수 없는 "기본 생성자" 하나 만들어주고 나서 하위클래스 생성자에 "super()"를 써야 접근 가능
	Manager02(String name, int salary, String grade, Employee[] empList) {
		// 여기에 super.name 이렇게 써야하지만 현재 name,sal,grade가
		// manager02 하위에 말고 employee 상위 클래스에만 선언되어있으므로
		// 굳이 super 키워드를 쓸 필요 없음. 그냥 this 써도 접근 범위가 허용됨
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	// 위에 annotation 코드주석으로 오버라이드 했음을 표시해주기!
	// 코드주석 달면 잘못 썼을 때 화면에 보이지 않는 컴파일 시점의 에러를 미리 알려줌
	@Override
	void info() {

		// < 메소드 오버라이딩 발생 >
		// this.info() : 현재 Manager02 클래스의 info() 메서드 접근 -> 스택 오버플로우 에러
		// super.info() : 부모 Employee 클래스의 info() 메소드 접근
		super.info();

		// empList만 하위에서 초기화, 나머지는 Employee 상위 클래스에 접근해서 초기화함
		System.out.println("----------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("----------------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("----------------------------------------");
	}
}
