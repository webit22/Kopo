package day0323;

import java.util.Calendar;

// Calendar 기능들을 제공
public class CalendarUtil {

	private Calendar c;

	public CalendarUtil() {
		c = Calendar.getInstance();
	}

	public void showByYear(int year) {
		for (int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}

	public void showByMonth(int year, int month) {
//		Calendar c = Calendar.getInstance();
		System.out.println("< " + year + "년 " + month + "월 >");

//		1. 해당 year, month의 1일이 무슨 요일인지
		c.set(year, month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)

//		2. 해당 month의 마지막 날이 며칠인지
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);

//		3. 날짜 모두 출력
		showByDay(week, lastDay);
	}

	private void showByDay(int week, int lastDay) {
		System.out.println("week : " + week);
		System.out.println("----------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------");
		int cnt = 0;

		for (int i = 1; i < week; i++) {
			System.out.println("\t");
		}
		for (int date = 1; date <= lastDay; date++) {
			System.out.println(date + "\t");
			if (++cnt % 7 == 0)
				System.out.println();
		}
		if (cnt % 7 != 0)
			System.out.println();
		System.out.println("----------------------------");
	}
}
