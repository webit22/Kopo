package day0315;

import java.util.Scanner;

class Icecream {
	String name;
	int price;
}

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("구입할 아이스크림 개수 : ");
		int cnt = Integer.parseInt(sc.nextLine());

		Icecream[] iceArr = new Icecream[cnt]; // 참조배열
		for (int i = 0; i < cnt; i++) {
			iceArr[i] = new Icecream();

			System.out.println("\n*** " + (i + 1) + "번째 아이스크림 구매 정보 ***");
			System.out.print("아이스크림 이름 : ");
			iceArr[i].name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		}

		System.out.println(" < 총 " + cnt + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "\t" + iceArr[i].name + "\t" + iceArr[i].price);
			sum += iceArr[i].price;
		}
		System.out.println("\n총 판매액 : " + sum);
		sc.close();
	}
}
