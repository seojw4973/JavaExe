package ch03.for10;

import java.util.Scanner;

//369게임을 작성합니다.
//1~99까지의 정수를 입력받고
//3,6,9중 하나가 있으면 "박수짝"을 출력하고
//2개가 있으면 "박수짝짝"을 출력하세요
//예를 들어 13은 "박수짝"
//36인 경우는 "박수짝짝"을 출력하면 됩니다.
public class Resolve2 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하세요.");
		num = sc.nextInt();
		
		int a = num / 10;
		int b = num % 10;
		int cnt = 0;
		
//		if(a == 3 || a == 6 || a == 9)
//			cnt++;
//		if(b == 3 || b == 6 || b == 9)
//			cnt++;
//		
//		if(cnt == 1)
//			System.out.println("박수 짝");
//		else if(cnt == 2)
//			System.out.println("박수 짝짝");
		
		if(num < 10) {
			if (b%3==0)
				cnt++;
		}
		
		else {
			if (a%3==0) {
				cnt++;
			}
			if (b%3==0) {
				cnt++;
			}
		}
		
		switch(cnt) {
		case 1:
			System.out.println("박수 짝");
			break;
		case 2:
			System.out.println("박수 짝짝");
			break;
		}
		sc.close();
		
	}

}
