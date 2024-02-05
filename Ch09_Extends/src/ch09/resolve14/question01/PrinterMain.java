package ch09.resolve14.question01;

public class PrinterMain {

	public static void main(String[] args) {
		InkJetPrint inkJetPrint = new InkJetPrint("프린터1", "삼성", "USB", 0, 4, 20);
		RazerPrint razerPrint = new RazerPrint("프린터2", "LG", "paraller port", 0, 30, 40);
		
		inkJetPrint.showPrinterInfo();
		razerPrint.showPrinterInfo();
		
		for(int i=0;i<5;i++) {
			inkJetPrint.printDocument();
		}
		
		System.out.println();
		
		for(int i=0;i<10;i++) {
			razerPrint.printDocument();
		}
		
		System.out.println();
		
		inkJetPrint.showPrinterInfo();
		razerPrint.showPrinterInfo();
		
	}

}
