package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {
	public static void main(String[] args) {
//		int[] arr = {10, 20, 30, 40, 50};
//		int[] arr = new int[] {10, 20, 30, 40, 50};
//		System.out.println("arr : " + Arrays.toString(arr));
		
		int[] arr = {10, 20, 50, 70, 30};
		
		// "Shallow copy"
		// arr을 복사 == arr값 주소값을 복사함 == arr이 가리키는 배열을 copy도 가리킴
//		int[] copy = arr; 
		
		// "Deep copy"
		int[] copy = new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);
				
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		
		copy[2] = 100;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
	}
}
