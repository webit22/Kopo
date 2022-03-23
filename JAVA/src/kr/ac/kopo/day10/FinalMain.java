package kr.ac.kopo.day10;

import java.util.Random;

/*final*/class Super {
	private /* final */ double PI = 3.14;

	/* final */ void call() {
		System.out.println("SUPER::call()");
	}
}

class Sub extends Super {
	void call() {
		System.out.println("SUB::call()");
	}
}

class MyRandom extends Random {

	// nextInt(10) -> [range : 1 ~ 10]
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}

	public int nextInt(int start, int end) {
		return super.nextInt(end - start) + start;
	}
}

public class FinalMain {
	public static void main(String[] args) {

		MyRandom r = new MyRandom();
		int random = r.nextInt(90);
		System.out.println(random);
		/*
		 * Random r = new Random(); int random = r.nextInt(90) + 10; // 10 ~ 99
		 */
	}

}
