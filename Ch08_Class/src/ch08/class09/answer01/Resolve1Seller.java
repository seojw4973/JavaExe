package ch08.class09.answer01;


public class Resolve1Seller {
	private int numOfApple;			// 사과개수
	private int money;				// 판매금액
	
	public Resolve1Seller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public void saleApple(Reslove1Buyer buyer, int money) {
		this.numOfApple -= buyer.buyApple(money);
		this.money += money;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + money);
	}
}
