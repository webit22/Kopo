package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {
	public static void main(String[] args) {
//		String[] strArr = {"데이터분석", "자바", "교육"};
		
		String[] strArr = new String[5];
		int loc = 0;
		strArr[loc++] = "폴리텍";
		strArr[loc++] = "데이터분석";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
		
		/*
		 * 배열의 전체 원소를 출력 방식
		 * 1. index를 이용한 출력  (원소접근 : 0 ~ length-1)
		 * 2. JDK 1.5버전의 for문을 이용한 출력 (foreach문) 
		 * 3. Arrays.toString() 메소드를 이용한 출력
		 * */
		System.out.println("< index를 이용한 출력 >");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// for(변수선언 : 배열명){} -> 주로 출력 용도로 많이 씀 (입력 X)
		// 원소 개수만큼 for문을 돌면서 strArr의 모든 원소에 변수 s로 접근한다
		System.out.println("< 1.5버전의 for문을 이용한 출력 >");
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println("< Arrays.toString() 메소드를 이용한 출력 >");
		// 배열의 모든 요소들을 하나의 문자열로 만듦 : "[ 원소, 원소, ... ]"
		String result = Arrays.toString(strArr);
		System.out.println(result);
	}
}
