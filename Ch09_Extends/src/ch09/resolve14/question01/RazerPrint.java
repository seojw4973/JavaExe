package ch09.resolve14.question01;

public class RazerPrint extends Printer {

	protected double leaveToner;

	public RazerPrint(String model, String maker,
			String port, int printNum, int leaveNum, double leaveToner) {
		super(model, maker, port, printNum, leaveNum);
		this.leaveToner = leaveToner;
	}
	
//	@Override
//	public String toString() {
//		return "RazerPrint [leaveToner=" + leaveToner + ", model=" + model + ", maker=" + maker + ", port=" + port
//				+ ", printNum=" + printNum + ", leaveNum=" + leaveNum + "]";
//	}

	public void showPrinterInfo() {
		super.showPrinterInfo();
		System.out.println("토너 잔량 : " + leaveToner);
	}

	// 호출할 때마다 인쇄용지 -1 필요
	@Override
	public void printDocument() {
		if(leaveToner>0) {
		super.printDocument();
		System.out.println("빠르게 출력된다.");
		System.out.println("품질이 매우 양호하다");
		this.leaveToner *= 0.9;
		}else {
			System.out.println("토너가 모자랍니다.");
		}
	}
}
