package ch09.resolve14.problem1;

public class RazerPrint extends Printer {

	protected int leaveToner;

	public RazerPrint(String model, String maker,
			String port, int printNum, int leaveNum, int leaveToner) {
		super(model, maker, port, printNum, leaveNum);
		this.leaveToner = leaveToner;
	}
	public void showPrinterInfo() {
		super.showPrinterInfo();
		System.out.println("토너 잔량 : " + leaveToner);
	}

	// 호출할 때마다 인쇄용지 -1 필요
	@Override
	public void printDocument() {
		if(leaveToner>0) {
		super.printDocument();
		leaveToner--;
		}else {
			System.out.println("토너가 모자랍니다.");
		}
	}
}
