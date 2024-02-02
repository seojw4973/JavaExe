package ch09.resolve14.problem1;

public class RazerPrint extends IPrint {

	protected int leaveToner;

	public RazerPrint(String model, String maker,
			String port, int printNum, int leaveNum, int leaveToner) {
		super(model, maker, port, printNum, leaveNum);
		this.leaveToner = leaveToner;
	}
	public void showPrintInfo() {
		super.showPrintInfo();
		System.out.println("토너 잔량 : " + leaveToner);
	}

	// 호출할 때마다 인쇄용지 -1 필요
	@Override
	public int print() {
		leaveNum--;
		this.leaveNum = leaveNum;
		System.out.println("인쇄용지 잔량 : " + leaveNum);
		return leaveNum;
	}

}
