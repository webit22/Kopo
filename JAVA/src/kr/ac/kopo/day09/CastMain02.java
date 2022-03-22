package kr.ac.kopo.day09;

public class CastMain02 {

	public static void main(String[] args) {
		// 실행 시 오류발생
//		Child01 c = (Child01) new Parent();

		// 묵시적 형변환이 되어있는 변수 p가 Child01의 영역을 가리키고 있을 때
		// 명시적 형변환이 가능함
		Parent p = new Child01();
		Child01 c2 = (Child01) p;

		c2.sleep();
		c2.study();
	}
}
