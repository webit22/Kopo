package kr.ac.kopo.day04;

public class ArrayMain01 {
	public static void main(String[] args) {
		
		int[] arr;
		
		// ���� 5���� ������ �迭 ����
		arr = new int[5];
		System.out.println("arr : " + arr); // �ּҰ� ���
		System.out.println("�迭�� ���� �� ���� : " + arr.length + "��");
		arr = new int[5];
		System.out.println("arr : " + arr[0]); // 0�� index�� ��Ұ� ���
		System.out.println("arr : " + arr[1]);
		System.out.println("arr : " + arr[2]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "��° ���� : " + arr[i]);
		}
		
		
	}
}
