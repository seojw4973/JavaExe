package ch08.class09;

import java.util.Scanner;

// 2. 중화요리집을 임의대로 클래스로 만드세요
public class Resolve2 {
	private String [] foods = {"짜장면", "짬뽕", "탕수육", "볶음밥", "간짜장", "깐풍기"};
	private int selNum;
	Scanner sc = new Scanner(System.in);
	
	
	public void viewMenu() {
		for(int i=0;i<foods.length;i++)
			System.out.println(i + "." + foods[i]);
	}
	
	public void selectMenu() {
		System.out.println("어떤 음식을 주문하시겠습니까? >> ");
		selNum = sc.nextInt();
	}
	public void deliveryMenu() {
		String food = foods[selNum];
		System.out.println("주문하신 " + food + " 나왔습니다.");
		System.out.println("맛있게 드십시오");
	}
	public void keyboardEnd() {
		System.out.println("프로그램종료");
		sc.close();
	}
}
