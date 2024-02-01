package ch08.class09.answer01;

public class Reslove1Buyer {
	private int buyMoney;
	private int numOfApple;
	final int APPLE_PRICE = 1000;
	
	public Reslove1Buyer(int money) {
		this.buyMoney = money;
		this.numOfApple = 0;
			
	}
	public int buyApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple += num;
		buyMoney -= money;
		return num;
	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + buyMoney);
		System.out.println("사과 개수 : " + numOfApple);
		
	}
}
