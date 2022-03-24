package day0323;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);

	private int getInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(sc.nextLine());
	}

	public void process() {

		while (true) {
			CalendarUtil util = new CalendarUtil();
			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
			int year = 0, month = 0;
			switch (type) {
			case 1:
				year = getInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = getInt("년도를 입력하세요 : ");
				month = getInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				System.exit(0); // 프로그램 강제 종료 (0 : 정상적으로 종료)
			}
		}
	}
}
