package kr.ac.kopo.day09.abs02;

public class SamsungPrinter extends Printer {

	public SamsungPrinter() {
	}

	public SamsungPrinter(String model) {
		super(model);
	}

	@Override
	public void print() {
		System.out.println("SAMSUNG프린터에서 프린트중...");
	}
	/*
	 * public void samPrint() { System.out.println("SAMSUNG 프린터에서 출력합니다"); }
	 */
}
