package kr.ac.kopo.day01;
import java.util.Arrays;
import java.util.Scanner;

public class BJpractice {
	
	public static void main(String[] args) {
		/*
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		char[] alpha;
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextLine();
			alpha  = new char[arr[i].length()];
		}
		
		// �׷� üũ
		/*
		 * 1. arr[i] ���� �� �� : 
		 * String[] arr
		 * char[] alph = new char[arr[i].length];
		 * (����for)
		 * now = arr[i].charAt(j) ����
		 * alph[j] = now; 
		 * next = arr[i].charAt(j+1)
		 * cnt = 1
		 * if(before == next) cnt++;
		 * 
		 * 2. ������ ���Դ��� üũ : 
		 * if(now != next) now�� ���ο� �迭 comp�� ����
		 * else 
		 * 
		 * */
		
	}
}