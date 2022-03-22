package kr.ac.kopo.day09.abs02;

public class HPPrinter extends Printer {

	public HPPrinter() {
	}

	public HPPrinter(String model) {
		super(model);
	}

	@Override
	public void print() {
		System.out.println("HP프린터에서 출력합니다...");
	}
}
