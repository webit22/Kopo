package kr.ac.kopo.day03.exam;

public class ExamMain01 {
	public static void main(String[] args) {
		// 1��
		for(int i = 1; i < 6; i++) {
			System.out.printf("%d%d%d%d%d\n", i,i,i,i,i);
		}
		System.out.println();
		
		// 2��
		for(int j = 1; j < 6; j++) {
			for(int i  = 1; i < 6; i++) {
				System.out.printf("%d", i);
			}
			System.out.println();
		}
		System.out.println();
		
		// 3��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.printf("%d", j+(i-1));
			}
			System.out.println();
		}
		System.out.println();
		
		// 4��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.printf("%d", j+(5-i)); 
			}
			System.out.println();
		}
		System.out.println();
		
		// 5��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		System.out.println();
		
		// 6��
		for(int i = 1; i <= 5; i++) { 
			for(int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 7��
		for(int i = 1; i <= 5; i++) { 
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 6-i; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 8��
		for(int i = 1; i <= 5; i++) { 
			for(int j = 4-i; j >= 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 9��
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for(int j = 10-i; j > 0; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 10��
		for(int i = 1; i <= 9; i++) { 
			if(i <= 5) {
				for(int j = 1; j <= 6-i; j++) {
					System.out.print("*");
				}
			} else {
				for(int j = i-4; j > 0; j--) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		System.out.println();
		
		// 11��
		for(int i = 1; i <= 9; i++) { 
			if(i <= 5) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print(" ");
				}
				for(int k = 6-i; k >= 1; k--) {
					System.out.print("*");
				}
			} else {
				for(int j = 9-i; j >= 1; j--) {
					System.out.print(" ");
				}
				for(int k = i-4; k > 0; k--) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		System.out.println();
	}
}
