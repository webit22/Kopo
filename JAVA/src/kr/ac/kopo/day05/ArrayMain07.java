package kr.ac.kopo.day05;
/*
객체지향의 4가지 요소 :
캡슐화
상속
추상화
다형성
*/

public class ArrayMain07 {
	public static void main(String[] args) {
		String[] strArr = new String[3];

		strArr[0] = "hello";

		for (String str : strArr) {
			System.out.println(str);
		}
	}
}