package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {

//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 MM월 dd일 HH시 mm분 ss초 (E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));

		/*
		 * 방법 2
		 * 
		 * Calendar는 abstract class 이므로 인스턴스 객체 생성 불가 Calendar의 멤버메소드에 접근하려면 Class.메소드명
		 * 으로 해야하는데 그럴라면 멤버메소드들이 전부 static 이어야함 그래야 Calendar 클래스가 인식됐을 때 JVM이 그 클래스의
		 * static 메소드들을 바로 메모리에 로드하고 main에서 Calendar.method() 에 접근할 수 있음
		 * 
		 * Calendar c = Calendar.getInstance(); System.out.println(c);
		 * 
		 * int year = c.get(Calendar.YEAR); int month = c.get(Calendar.MONTH) + 1; int
		 * date = c.get(Calendar.DAY_OF_MONTH); int day = c.get(Calendar.DAY_OF_WEEK);
		 * // 1(일) ~ 7(토) String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		 * System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" +
		 * week[day] + ")입니다.");
		 * 
		 * // 2020년 5월 20일 요일 로 세팅하고싶을 때 c.set(2020, 3 - 1, 20); day =
		 * c.get(Calendar.DAY_OF_WEEK); System.out.println("2020/05/20 " + week[day] +
		 * "요일");
		 * 
		 * int lastday = c.getActualMaximum(Calendar.DATE); System.out.println(lastday);
		 * 
		 * Date d = c.getTime(); System.out.println(d);
		 */

		/*
		 * 방법 1
		 * 
		 * Date d = new Date(); System.out.println(d);
		 * 
		 * // 오늘은 2022년 3월 23일(수)입니다 int year = d.getYear() + 1900; int month =
		 * d.getMonth() + 1; int date = d.getDate(); int day = d.getDay(); String[] week
		 * = { "일", "월", "화", "수", "목", "금", "토" };
		 * 
		 * System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" +
		 * week[day] + ")입니다.");
		 */
	}
}
