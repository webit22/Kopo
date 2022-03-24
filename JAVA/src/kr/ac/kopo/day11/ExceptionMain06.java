package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		System.out.println("main start...");

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("loop,,,");
				if (i == 3) {
					FileReader fr = new FileReader("a.txt"); // checked Exception
				}
			} catch (Exception e) {
				e.printStackTrace();
				break;
			} finally {
				// 자원을 끊는 행위는 오류가 나든말든 무조건 수행해야하므로 finally 안에 넣음
				// File을 위에서 읽어오다가 오류가 나면 그냥 종료만 하면 안되고
				// finally에서 강제로 연결 해제까지 시켜줘야 함
				System.out.println("end loop...");
			}
		}
		System.out.println("main end...");
	}
}
