package kr.ac.kopo.day07;

public class Member {

	String name;
	int age;
	String bloodType;

	// 멤버변수 정의하기 (아니면 선언이랑 함께 써도 됨)
	Member() {
		// 지역변수가 선언되지 않았으므로 아래 변수들이 class의 멤버변수임을 알 수 있음
		// 그래서 this. 생략 가능함
		this("알 수 없음", -1, "알 수 없음");
	}

	Member(String name) {
		this(name, -1, "알 수 없음");
	}

	Member(String name, int age) {
		// "new"를 써야지만 생성자 호출 가능.
		// 그냥 Member(...); 는 메소드 호출로 인식하므로 에러남.
		this(name, age, "알 수 없음");
	}

	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	// 이 회원의 정보를 출력하기위한 메소드
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}
}
