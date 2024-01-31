package ch08.class09;


public class Resolve3Buyer {
	private int buyMoney;
	final int PEAR_PRICE = 2500; 
	
	
	public void dep() {
		System.out.println("얼마를 내겠습니까? >> ");
		buyMoney = 5000;
	}
	public void cal() {
		System.out.println(buyMoney + "원을 받았습니다.");
		int num = buyMoney/PEAR_PRICE;
		System.out.println("배 " + num + "개를 샀습니다.");
		
	}
	
	public void keyboareEnd() {
	
	
	}
	
	
}
