package kr.ac.kopo.day01;
/*
 * 기본자료형
 * 논리형 : boolean
 * 문자형 : char
 * 정수형 : byte, short, int(기본), long
 * 실수형 : float, double(기본)
 * 
 * 변수 초기화(선언과 동시에 )
 * 자료형 변수명 = 값;
 * 
 * 
 * */
public class VariableMain {
	char b; // 멤버변수/field 자동초기화O
	public static void main(String[] args) {
		
		char a; // 지역변수, 초기화 자동설정X
		a = 'A';
		System.out.println(a);
		
		double d1, d2 = 12.34, d3 = 0;
		
	}
}
