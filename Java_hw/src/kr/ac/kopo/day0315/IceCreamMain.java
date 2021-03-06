package day0315;

import java.util.Scanner;

class Ice {
	String name;
	int price;
}

public class IceCreamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ice ic = new Ice();

		System.out.print("구입할 아이스크림 개수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("\n*** " + (i + 1) + "번째 아이스크림 구매 정보 ***");
			System.out.print("아이스크림 이름 : ");
			ic.name = sc.next();
			System.out.print("아이스크림 가격 : ");
			ic.price = sc.nextInt();
		}

		System.out.println(" < 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명  가격");

		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "\t" + ic.name + "\t" + ic.price);
			sum += ic.price;
		}
		System.out.println("\n총 판매액 : " + sum);
	}
}
