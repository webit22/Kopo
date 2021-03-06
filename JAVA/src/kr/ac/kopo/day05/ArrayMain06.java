package kr.ac.kopo.day05;

public class ArrayMain06 {
	public static void main(String[] args) {
		int[][] ar = new int[3][];

		// ar -> { ar[0]-> 3ĭ?迭, ar[1] -> 4ĭ?迭, ar[2] -> 5ĭ?迭}
		for (int i = 0; i < ar.length; i++) {
			ar[i] = new int[(int) (Math.random() * 3) + 2];
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = i * 10 + (j + 1);
			}
			System.out.println();
		}

		for (int[] arr : ar) {
			for (int num : arr) {
				System.out.print(num + "  ");
			}
			System.out.println();
		}
		System.out.println("----------------------");

		for (int i = 0; i < ar.length; i++) {
			for (int num : ar[i]) {
				System.out.print(num + "  ");
			}
			System.out.println();
		}
	}
}
