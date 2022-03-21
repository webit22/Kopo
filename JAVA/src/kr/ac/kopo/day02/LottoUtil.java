package kr.ac.kopo.day02;
import java.util.Random;
/*
 * 로또와 관련된 여러가지 기능클래스
 * @author 윤정빈
 * */

public class LottoUtil {

	public void todayProbability() {
		
		// 임의의 난수가 필요
		Random r = new Random();
		int p = r.nextInt(101); // 0~100 사이의 랜덤숫자 추출
		
		System.out.println("오늘의 로또 확률은 p%입니다.");
	}
}
