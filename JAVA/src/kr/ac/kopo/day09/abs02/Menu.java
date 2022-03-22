package kr.ac.kopo.day09.abs02;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);

	public String select() {
		System.out.print("프린터를 선택하세요(1.LG 2.SAMSUNG) =>");
		String type = sc.nextLine();
		return type;
	}

	private void print(String type) {

		Printer p = null;
		switch (type) {
		case "1":
			p = new LGPrinter();
			break;
		case "2":
			p = new SamsungPrinter();
			break;
		case "3":
			p = new HPPrinter();
			break;
		}
		if (p != null) {
			p.print();
		}
	}

	public void process() {
		String type = select();
		print(type);
	}
}
