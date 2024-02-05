package ch09.resolve14.question01;

public class InkJetPrint extends Printer {

	protected double leaveInk;
	
	public InkJetPrint(String model, String maker,
			String port, int printNum, int leaveNum, double leaveInk) {
		super(model, maker, port, printNum, leaveNum);
		this.leaveInk = leaveInk;
	}

//	@Override
//	public String toString() {
//		return "InkJetPrint [leaveInk=" + leaveInk + ", model=" + model + ", maker=" + maker + ", port=" + port
//				+ ", printNum=" + printNum + ", leaveNum=" + leaveNum + "]";
//	}

	public void showPrinterInfo() {
		super.showPrinterInfo();
		System.out.println("잉크 잔량 : " + leaveInk);
	}
		
	// 호출할 때마다 인쇄용지 -1 필요
	@Override
	public void printDocument() {
		if(leaveInk>0) {
		super.printDocument();
		System.out.println("잉크가 잘 분사되어 출력됩니다..");
		System.out.println("품질이 양호하다.");
		this.leaveInk -= 0.5;
		}else {
			System.out.println("잉크가 모자랍니다.");
		}
	}

}
