package kr.ac.kopo.day06;

/*
**********
Hello
**********
Hi
**********
Bye
**********
*/

public class MethodMain01 {
	static void printStar(char ch, int cnt) {
		for (int i = 0; i < 10; i++) {
			System.out.print(ch);
		}
		System.out.println();
		return; // 전달값/ 나를 호출했던 피호출자 메소드로 돌아가자
	}

	public static void main(String[] args) {
		printStar('*', 10);
		System.out.println("Hello");
	}
}
