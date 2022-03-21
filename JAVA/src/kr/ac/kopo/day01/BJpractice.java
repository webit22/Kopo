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
		
		// 그룹 체크
		/*
		 * 1. arr[i] 에서 값 비교 : 
		 * String[] arr
		 * char[] alph = new char[arr[i].length];
		 * (이중for)
		 * now = arr[i].charAt(j) 저장
		 * alph[j] = now; 
		 * next = arr[i].charAt(j+1)
		 * cnt = 1
		 * if(before == next) cnt++;
		 * 
		 * 2. 이전에 나왔는지 체크 : 
		 * if(now != next) now를 새로운 배열 comp에 저장
		 * else 
		 * 
		 * */
		
	}
}