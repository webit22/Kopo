package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

/* throws 사용해보기 */
public class ExceptionMain07 {

	public static void main(String[] args) {

		a();

		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void a() {
		try {
			String str = null;
			System.out.println(str.length());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void b() throws FileNotFoundException {
		int[] arr = new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}

}
