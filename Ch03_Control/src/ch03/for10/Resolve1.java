package ch03.for10;

import java.util.Scanner;

public class Resolve1 {
	public static void main(String[] args) {
		int money, n50000, n10000, n5000, n1000, n500, n100, n50, n10, n1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수를 입금하세요.");
		money = sc.nextInt();
		
		n50000 = money/50000;
		money = money%50000;
				
		n10000 = money/10000;
		money = money%10000;
		
		n5000 = money/5000;
		money = money%5000;
		
		n1000 = money/1000;
		money = money%1000;
		
		n500 = money/500;
		money = money%500;
		
		n100 = money/100;
		money = money%100;
		
		n50 = money/50;
		money = money%50;
		
		n10 = money/10;
		money = money%10;
		
		n1 = money/1;
		money = money%1;
		
		
		
		System.out.println("오만원 " + n50000 + "매");
		System.out.println("만원 " + n10000 + "매");
		System.out.println("오천원 " + n5000 + "매");
		System.out.println("천원 " + n1000 + "매");
		System.out.println("500원 " + n500 + "개");
		System.out.println("100원 " + n100 + "개");
		System.out.println("50원 " + n50 + "개");
		System.out.println("10원 " + n10 + "개");
		System.out.println("1원 " + n1 + "개");
		
		
		sc.close();
	}

}
