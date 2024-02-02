package ch09.resolve14.problem1;

public abstract class IPrint {
	String model;
	String maker;
	String port;
	int printNum;
	int leaveNum;
	
	public void Model() {
		
	}
	
	public void Maker() {
		
	}
	public void Port() {
	
	}
	public void PrintNum() {
	
	}
	public void LeaveNum() {
	
	}
	
	public IPrint(String model, String maker,
			String port, int printNum, int leaveNum) {
		this.model = model;
		this.maker = maker;
		this.port = port;
		this.printNum = printNum;
		this.leaveNum = leaveNum;
	}
	
	public void showPrintInfo() {
		System.out.println("-------------------");
		System.out.println("모델명 : " + model);
		System.out.println("제조사 : " + maker);
		System.out.println("연결포트 : " + port);
		System.out.println("인쇄매수 : " + printNum);
		System.out.println("인쇄 종이 잔량 : " + leaveNum);
		
	}

	public abstract int print();

	
	
	
}


