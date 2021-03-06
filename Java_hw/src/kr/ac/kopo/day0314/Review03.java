package day0314;

import java.util.Scanner;

public class Review03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = { 1, 2, 3, 4, 5 };

		System.out.println("< BEFORE >");
		for (int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();

		System.out.print("Left(-), Right(+) : ");
		char ch = sc.nextLine().charAt(0);

		System.out.print("Start Index (0-4) : ");
		int idx = sc.nextInt();

		System.out.println("< AFTER >");
		/*
		 * // 规过1 if (ch == '+') { for (int i = idx; i < nums.length; i++) {
		 * System.out.print(nums[i] + "\t"); } for (int i = 0; i < idx; i++) {
		 * System.out.print(nums[i] + "\t"); } } else if (ch == '-') { for (int i = idx;
		 * i >= 0; i--) { System.out.print(nums[i] + "\t"); } for (int i = nums.length -
		 * 1; i > idx; i--) { System.out.print(nums[i] + "\t"); } }
		 */

		// 规过2* 力老 亮篮 内靛
		if (ch == '+') {
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[(idx + i) % nums.length] + "\t");
			}
		} else if (ch == '-') {
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[(idx - i + nums.length) % nums.length] + "\t");
			}
		}

		// 规过3
		int sign = ch == '+' ? 1 : -1;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[(idx + sign * i + nums.length) % nums.length]);
		}
		System.out.println();
	}
}
