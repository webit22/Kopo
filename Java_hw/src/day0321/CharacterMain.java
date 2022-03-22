package day0321;

import java.util.Scanner;

public class CharacterMain {

	public static int checkChar(String strData, char ch) {
		int cnt = 0;
		for (int i = 0; i < strData.length(); i++) {
			if (ch == strData.charAt(i))
				cnt++;
		}
		return cnt;
	}

	public static String removeChar(String oriStr, char delChar) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < oriStr.length(); i++) {
			if (delChar != oriStr.charAt(i))
				sb.append(oriStr.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("비교할 문자열을 입력하세요 : ");
		String strInput = sc.nextLine();
		System.out.print("검색할 문자를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);

		// 문자열 #1
		int intResult = checkChar(strInput, ch);
		System.out.println(intResult);

		// 문자열 #2
		String strResult = removeChar(strInput, ch);
		System.out.println(strResult);
	}
}
