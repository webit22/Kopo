package kr.ac.kopo.day03;
/*
 * for(init; expr; incre/decre){
 * 		statement;
 * }
 * 
 * init;
 * do{
 *     statement;
 *     incre/decre;
 * }while(expr);
 * 
 */
public class LoopMain02 {
	public static void main(String[] args) {
		int cnt = 1;
		do {
			System.out.println("Hello");
			cnt++;
		} while(cnt <= 5);
		System.out.println("===============");
		cnt = 1; // init
		
		while(true) {
			System.out.println("Hello");
			++cnt;
			
			if(cnt > 5) {
				break;
			}
		}
	}
}
