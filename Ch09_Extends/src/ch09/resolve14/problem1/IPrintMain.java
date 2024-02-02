package ch09.resolve14.problem1;

public class IPrintMain {

	public static void main(String[] args) {
		InkJetPrint inkJetPrint = new InkJetPrint("print1", "삼성", "USB", 50, 25, 20);
		RazerPrint razerPrint = new RazerPrint("프린터2", "LG", "paraller port", 100, 30, 40);
		
		inkJetPrint.showPrintInfo();
		razerPrint.showPrintInfo();
	}

}
