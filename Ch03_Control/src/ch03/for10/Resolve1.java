package ch03.for10;

import java.util.Scanner;

//돈의 액수를 입금하세요
//입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
//출력 개수는 단위가 큰 것 순서로 계산합니다
//예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
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
		
//		System.out.printf("오만원 : %d/n"
//				+ "만원 : %d/n"
//				+ "오천원 : %d/n"
//				+ "천원 : %d/n"
//				+ "오백원 : %d/n"
//				+ "백원 : %d/n"
//				+ "오십원 : %d/n"
//				+ "십원 : %d/n"
//				+ "1원 : %d/n"
//				n50000, n10000, n5000, n1000, n500, n100, n50, n10, n1
		
		
		sc.close();
	}

}
