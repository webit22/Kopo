package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {
	public static void main(String[] args) {
		String str = "hello world!";
		/*
		 * for(int i = 0; i < str.length(); i++){ if(str.charAt(i) == 'r')
		 * System.out.println("r ��ġ : " + i); }
		 */

//		char search = 'r';
//		String search = "llo";
		String search = "l";
		System.out.println(search + "��ġ : " + str.indexOf(search));
		System.out.println(search + "��ġ : " + str.indexOf(search, 5));

		System.out.println("< " + search + "��ġ �˻� >");
		str = "hello world!";
		search = "l";
		int index = str.indexOf(search);
		while (index != -1) {
			System.out.println("�����ε��� : " + index);
			index = str.indexOf(search, index + 1);
		}

		String subStr = str.substring(3, 8); // [3] ~ [8-1] ���ڿ��� ��ȯ
		System.out.println("substring(3,8) : " + subStr);
		System.out.println("substring(6) : " + str.substring(6));

		String str2 = "hello" + "!!!!";
		str2 = "hello".concat("!!!!");
		System.out.println("concat() : " + str2);

		String result = str.replace("l", "rr");
		System.out.println("replace(\"1\", \"rr\") : " + result);

		str = "	   hello    ";
		System.out.printf("[%s] ���� : %d\n", str, str.length());
		result = str.trim();
		System.out.printf("[%s] ���� : %d\n", result, result.length());

		str = "Hello world!!";
		System.out.println("str : " + str);
		System.out.println("�빮�� : " + str.toUpperCase());
		System.out.println("�ҹ��� : " + str.toLowerCase());

		String data = "ȫ�浿��:���:�����ô�";
		String[] bookInfo = data.split(":");
		System.out.println("split() : " + Arrays.toString(bookInfo));

		int num = 123;
		// int -> string : Integer.parseInt()
		// string -> int : String.valueOf()
		String strNum = String.valueOf(num);
		System.out.println(strNum + 100);
	}
}