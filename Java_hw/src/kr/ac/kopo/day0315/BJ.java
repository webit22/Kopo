package day0315;

import java.util.Scanner;

public class BJ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// col 15로 설정하는게 좀 비효율적이어보임
		char[][] chArr = new char[5][15];

		for (int row = 0; row < 5; row++) {
			String str = sc.nextLine();
			for (int col = 0; col < str.length(); col++) {
				chArr[row][col] = str.charAt(col);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if (chArr[i][j] == ' ' || chArr[i][j] == '\0')
					continue;
				else
					sb.append(chArr[i][j]);
			}
		}

		System.out.println(sb);

	}
}