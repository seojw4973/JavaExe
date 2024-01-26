package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {
//	public static void main(String[] args) {
//		int chmon = 0;
//		int dep = 0;
//		int wtd = 0;
//		int bal = dep - wtd;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		while(true) {
//			System.out.println("---------------------------");
//			System.out.println("1.예금 │ 2.출금 │ 3.잔고 │ 4.종료");
//			System.out.println("---------------------------");
//			System.out.println("선택> ");
//			chmon = sc.nextInt();
//			
//			if (chmon == 1) {
//				System.out.println("예금액> ");
//				dep = sc.nextInt();
//				System.out.println("예금액> " + dep);
//			}
//			else if(chmon == 2) {
//				System.out.println("출금액> ");
//				wtd = sc.nextInt();
//				System.out.println("출금액> " + wtd);
//				
//			}
//			else if(chmon == 3) {
//				System.out.println("잔고> ");
//				bal = dep - wtd;
//				System.out.println("잔고> " + bal);
//				
//			}
//			if(chmon == 4) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//		}	sc.close();	
//		
//		
//		
//	}
//
//}
// nextLine으로 다시 풀어볼것
public static void main(String[] args) {
	String chmon;
	int dep=0;
	int wtd=0;
	int bal = dep - wtd;
	Scanner sc = new Scanner(System.in);
	
	
	while(true) {
		System.out.println("---------------------------");
		System.out.println("1.예금 │ 2.출금 │ 3.잔고 │ 4.종료");
		System.out.println("---------------------------");
		System.out.println("선택> ");
		chmon = sc.nextLine();
		
		if (chmon.equals("1")) {
			System.out.println("예금액> ");
			dep = sc.nextInt();
			System.out.println("예금액> " + dep);
		}
		else if(chmon.equals("2")) {
			System.out.println("출금액> ");
			wtd = sc.nextInt();
			System.out.println("출금액> " + wtd);
			
		}
		else if(chmon.equals("3")) {
			System.out.println("잔고> ");
			bal = dep - wtd;
			System.out.println("잔고> " + bal);
			
		}
		if(chmon.equals("4")) {
			System.out.println("프로그램 종료");
			break;
		}
		
	}	sc.close();	
	
}
	
}
