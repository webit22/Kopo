package day0314;
import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sumEven = 0, sumOdd = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "'s num : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\n< ¦?? >");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				sumEven += arr[i];
			}
		}
		System.out.println("\n¦???? ???? : " + sumEven);
		System.out.println("\n< Ȧ?? >");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
				sumOdd += arr[i];
			}
		}
		System.out.println("\nȦ???? ???? : " + sumOdd);
	}
}
