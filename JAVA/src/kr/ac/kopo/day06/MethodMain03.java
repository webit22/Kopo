package kr.ac.kopo.day06;

class ExamMethod {
	int getSum(int a, int b) {
		return a + b;
	}

	int getTotal(int a, int b) {
		int s = 0;
		while (a <= b) {
			s += a++;
		}
		return s;
	}
}

public class MethodMain03 {
	public static void main(String[] args) {
		ExamMethod exam = new ExamMethod();
		int sum = exam.getSum(10, 20);
		System.out.println();

		System.out.println(exam.getTotal(1, 10));

	}
}
