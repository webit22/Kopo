package day0314;
import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0, i = 0;
		int[] arr = new int[5];
		
		while(i < 5) {
			System.out.print(i+1 + "'s 정수 : ");
			num = sc.nextInt();
			if(num % 2 == 0) {
				arr[i] = num;
				i++;
			}
		}
		System.out.println("< 5개의 정수 출력 >");
		for(i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
	}
}
