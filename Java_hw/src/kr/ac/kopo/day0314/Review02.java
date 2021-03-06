package day0314;
import java.util.Scanner;

// 문제 4번
public class Review02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		/*
		// 방법1
		for(int i = 0; i < nums.length; i++) {
			System.out.println(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				for(int j = 0; j < i; j++) {
					System.out.print(nums[j] + " ");
				}
				System.out.println();
				i--;
			}
		}
		*/
		
		// 방법2
		String msg = "";
		for(int i = 0; i < nums.length; ) {
			System.out.println(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				System.out.println(msg + "보다 큰수여야 합니다");
			} else {
				msg += nums[i++] + " ";
			}
		}
		
		System.out.println("\n< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("\n< REVERSE >");
		for(int i = nums.length-1; i >= 0; i--) {
			// nums[i] = 25 -> 52
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			System.out.print(n1*10 + n10 + "\t");
		}
		System.out.println();
	}
}
