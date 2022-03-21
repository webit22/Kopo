package kr.ac.kopo.day04;

public class ArrayMain01 {
	public static void main(String[] args) {
		
		int[] arr;
		
		// 정수 5개를 가지는 배열 생성
		arr = new int[5];
		System.out.println("arr : " + arr); // 주소값 출력
		System.out.println("배열의 원소 총 개수 : " + arr.length + "개");
		arr = new int[5];
		System.out.println("arr : " + arr[0]); // 0번 index의 요소값 출력
		System.out.println("arr : " + arr[1]);
		System.out.println("arr : " + arr[2]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 원소 : " + arr[i]);
		}
		
		
	}
}
