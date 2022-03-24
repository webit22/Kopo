package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain05 {

	public static void main(String[] args) {
		try {
			Random r = new Random();
			int num = r.nextInt(3); // 0, 1, 2

			System.out.println("num : " + num);
			System.out.println(10 / num);

			String str = "hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(0));

		} catch (Exception e) {
//			Use this version!!
			e.printStackTrace();
		}

		System.out.println("main end...");
	}
}
