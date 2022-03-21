package kr.ac.kopo.day02;

/*
 * 반복문을 위한 기본요소 4가지
 * 1. 반복할 문장 (statement)
 * 2. 시작값 (init)
 * 3. 증가/감소 (incre/decre)
 * 4. 종료조건 (expr)
 * 
 * 한 바퀴 뛸 차례다;
 * while(열 바퀴 다 뛰었냐?) {
 * 		운동장 한 바퀴 뛴다;
 * 		바퀴 수 증가;
 * }
 * 
 * for(init; expr; incre/decre){
 * 		statement;
 * }
 * 
 * init;
 * do{
 *     statement;
 *     incre/decre;
 * }while(expr);
 * */

public class LoopMain01 {
	public static void main(String[] args) {
		
		System.out.println("------ for 반복문 시작 ------");
		
		for(int cnt = 1; cnt <= 5; ++cnt) {
			System.out.println("Hello");
		}
		
		System.out.println("------ for 반복문 종료 ------");
		
		
		System.out.println("------ while 반복문 시작 ------");
		
		int cnt = 1;
		while(cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		
		System.out.println("------ while 반복문 종료 ------");
	}
}
