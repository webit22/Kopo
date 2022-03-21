package kr.ac.kopo.day04;

public class ArrayMain03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		// num == arr 배열 원소값의 복사본을 담음. 
		// 그래서 num 으로 실제 배열 arr의 값을 입력받거나 수정할 수 없음.
		// 원소값 수정할라면 배열[index]로 접근해야함.
		
		/*
		int data = 1;
		for(int num : arr) {
			num = data++;
		}
		*/
		System.out.println("< PRINT >");
		for(int num : arr) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
