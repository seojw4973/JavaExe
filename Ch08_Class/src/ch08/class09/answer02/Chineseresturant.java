package ch08.class09.answer02;

import java.util.Scanner;


public class Chineseresturant {
	// 필드
	private String[] foods;
	private int selectNum;
	private Scanner sc;
	private String name;
	
	public Chineseresturant(Scanner sc, String name, String[] foods) {
		this.sc = sc;
		this.name = name;
		this.foods = foods;
		
		// 객체가 생성되고 자동으로 처리해야하는 작업을 코딩
		System.out.println(this.name + " 식당을 청소한다~");
		System.out.println(this.name + " 재료를 준비한다~");
	}
	
	// 메서드
	public void viewMenu() {
		System.out.println("----[" + this.name + "]----");
		for(int i = 0;i<foods.length;i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	public void selectFood() {
		System.out.println("----[" + this.name + "]----");
		System.out.println("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		System.out.println("----[" + this.name + "]----");
		String food = foods[selectNum];
		System.out.println(food + " 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}

}
