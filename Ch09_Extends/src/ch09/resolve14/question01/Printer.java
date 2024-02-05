package ch09.resolve14.question01;

public class Printer {
	protected String model;
	protected String maker;
	protected String port;
	protected int printNum;
	protected int leaveNum;
	
	public Printer(String model, String maker,
			String port, int printNum, int leaveNum) {
		this.model = model;
		this.maker = maker;
		this.port = port;
		this.printNum = printNum;
		this.leaveNum = leaveNum;
	}
	
	public void showPrinterInfo() {
		System.out.println("-------------------");
		System.out.println("모델명 : " + model);
		System.out.println("제조사 : " + maker);
		System.out.println("연결포트 : " + port);
		System.out.println("인쇄매수 : " + printNum);
		System.out.println("인쇄 종이 잔량 : " + leaveNum);
		
	}

	public void printDocument() {
		if(leaveNum>0) {
			System.out.println(model + " 모델을 이용해서 인쇄합니다.");
			printNum++;
			leaveNum--;
		}else {
			System.out.println("인쇄 용지가 모자랍니다.");
		}
	}

	
	
	
}


