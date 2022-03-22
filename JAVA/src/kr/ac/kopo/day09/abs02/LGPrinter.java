package kr.ac.kopo.day09.abs02;

public class LGPrinter extends Printer {

	public LGPrinter() {
		// source > Override/Implement Methods

	}

	public LGPrinter(String model) {
		super(model);
	}

	// source > Override/Implement Methods
	@Override
	public void print() {
		System.out.println("LG 프린터에서 출력중...");
	}
}
