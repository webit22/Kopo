package day0314;
import java.util.Scanner;

//���� 2��
public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10];
		int[] sum = new int[2]; // [0] : ¦�� ���� ~ [1] : Ȧ�� ����

		// ���� �Է� ���1
		for(int i = 0; i < nums.length; ) {
			System.out.print(i+1 + "��° ���� �Է� : ");
			nums[i] = sc.nextInt();
			if(nums[i] >= 0) {
				sum[nums[i] % 2] += nums[i];
				i++;
			}
		}
		
		// ���� �Է� ���2
		int loc = 0;
		while(loc < nums.length) {
			System.out.print(loc+1 + "��° ���� �Է� : ");
			int num = sc.nextInt();
			if(num < 0) continue;
			sum[nums[loc] % 2] += nums[loc++];
		}
		
		String[] title = {"¦��", "Ȧ��"};
		for(int mod = 0; mod <= 1; mod++) {
			System.out.println("\n< " + title[mod] + " >");
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] % 2 == mod)
					System.out.print(nums[i] + "  ");
			}
			System.out.println();
			System.out.println(title[mod] + "���� : " + sum[mod]);
		}
	}
}
