package kr.ac.kopo.day0314;
import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 + "'s num : ");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
		System.out.println("\n< PRINT >");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("\n���� : " + sum);
	}
}
