package ch09.resolve14.problem1;

public class InkJetPrint extends Printer {

	protected int leaveInk;
	
	public InkJetPrint(String model, String maker,
			String port, int printNum, int leaveNum, int leaveInk) {
		super(model, maker, port, printNum, leaveNum);
		this.leaveInk = leaveInk;
	}
	
	public void showPrintInfo() {
		super.showPrintInfo();
		System.out.println("잉크 잔량 : " + leaveInk);
	}
		
	// 호출할 때마다 인쇄용지 -1 필요
	@Override
	public void printDocument() {
		if(leaveInk>0) {
		super.printDocument();
		leaveInk--;
		}else {
			System.out.println("잉크가 모자랍니다.");
		}
	}

}
