import java.util.Scanner;

public class _10988 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int result = 0;
		int strLen = s.length();
//		boolean isPelin = false;

		for (int i = 0; i < (strLen / 2);) {
			if (i != strLen / 2) {
				if (s.charAt(i) == s.charAt((strLen - 1) - i)) {
					result = 1;
					i++;
				} else {
					result = 0;
					break;
				}
			}
		}
		System.out.println(result);
	}
}