package kr.ac.kopo.day07;

public class ConstructorMain02 {
	public static void main(String[] args) {
		Member m = new Member();
		Member m2 = new Member("ȫ�浿");
		Member m3 = new Member("���浿", 22);
		Member m4 = new Member("���浿", 22, "O");

		m.info();
		m2.info();
		m3.info();
		m4.info();
	}
}