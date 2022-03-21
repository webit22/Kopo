package kr.ac.kopo.day02;

/*
 * �ݺ����� ���� �⺻��� 4����
 * 1. �ݺ��� ���� (statement)
 * 2. ���۰� (init)
 * 3. ����/���� (incre/decre)
 * 4. �������� (expr)
 * 
 * �� ���� �� ���ʴ�;
 * while(�� ���� �� �پ���?) {
 * 		��� �� ���� �ڴ�;
 * 		���� �� ����;
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
		
		System.out.println("------ for �ݺ��� ���� ------");
		
		for(int cnt = 1; cnt <= 5; ++cnt) {
			System.out.println("Hello");
		}
		
		System.out.println("------ for �ݺ��� ���� ------");
		
		
		System.out.println("------ while �ݺ��� ���� ------");
		
		int cnt = 1;
		while(cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		
		System.out.println("------ while �ݺ��� ���� ------");
	}
}
