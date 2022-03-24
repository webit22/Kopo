package kr.ac.kopo.day11;

import java.util.LinkedList;
import java.util.List;

/*
	List : 순서 O, 중복 O
	- ArrayList
	- LinkedList
	
	add(), get(), size(), remove(), isEmpty(), contains(), clear()
*/

public class ListMain {
	public static void main(String[] args) {

//		new ArrayList<> 에 String 생략 가능 : 
//		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();

//		arraylist를 linkedlist로 객체만 바꿔주고, 
//		List를 linkedList로 묵시적 형변환 한거라서 문제 없음
		List<String> list = new LinkedList<>();

//		list.add() : index 0부터 차곡차곡 순서대로 추가함
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one");

		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));

		/*
		 * System.out.println("< PRINT >"); for (int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i)); }
		 */

		System.out.println("< 1.5버전 >");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("0번지 문자열 : " + list.get(0));

//		remove(0) : 삭제되는 0번지 문자열 return
		System.out.println("0번지 문자열 삭제 : " + list.remove(0));
		System.out.println("0번지 문자열 : " + list.get(0));

	}
}
