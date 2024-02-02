package ch09.resolve14.problem2;

import ch09.resolve14.problem2.factory1.LgTablet;
import ch09.resolve14.problem2.factory1.SamsungTablet;
import ch09.resolve14.problem2.factory1.SonyTablet;
import ch09.resolve14.problem2.order1.TabletTester;

/*
[시나리오]
ITablet 인터페이스를 만드세요.
   아래 메서드를 멤버로 추가하세요.
   void movie();
   void music();
   void readBook();
   
   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고
   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.
   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.
*/	
public class TabletMain {

	public static void main(String[] args) throws InterruptedException {
		TabletTester carTester = new TabletTester();
		ITablet[] carArr = new ITablet[] {
				new SamsungTablet(),
				new SonyTablet(),
				new LgTablet()
		};
		int[] score = new int[carArr.length];
		
		for(int i=0;i<carArr.length;i++) {
			carTester.setCar(carArr[i]);
			
			score[i] += carTester.movieTest();
			System.out.printf("movieTest 점수는 %d입니다\n", score[i]);
			score[i] += carTester.musicTest();
			System.out.printf("musicTest 점수는 %d입니다\n", score[i]);
			score[i] += carTester.readBookTest();
			System.out.printf("readBookTest 점수는 %d입니다\n", score[i]);
						
			System.out.printf("전체 테스트 점수는 %d입니다\n", score[i]);
			System.out.println("-----------------------------------------");
		}
		
		// 가장 큰 점수를 받은 값과 인덱스 찾기
		int max = score[0];
		int maxIdx = 0;
		for(int i=1;i<score.length;i++) {
			if(max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		
		System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 태블릿이고 점수는 %d입니다\n",
				maxIdx+1, max);
		System.out.println(carArr[maxIdx].getClass().getName());
	}

}
