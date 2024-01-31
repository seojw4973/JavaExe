package ch03.continue11;

import java.util.Scanner;

/* 교재 139p 7번
 * while문과 Scanner의 nextLine()메서드를 이용해서
 * 예금, 출금, 조회, 종료 기능 제공
 * */
public class Resolve3 {
	public static void main(String[] args) {
		int chmon = 0;
		int dep = 0;
		int wtd = 0;
		int bal = dep - wtd;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1.예금 │ 2.출금 │ 3.잔고 │ 4.종료");
			System.out.println("---------------------------");
			System.out.println("선택> ");
			chmon = sc.nextInt();
			
			if (chmon == 1) {
				System.out.println("예금액> ");
				dep = sc.nextInt();
				System.out.println("예금액> " + dep);
			}
			else if(chmon == 2) {
				System.out.println("출금액> ");
				wtd = sc.nextInt();
				System.out.println("출금액> " + wtd);
				
			}
			else if(chmon == 3) {
				System.out.println("잔고> ");
				bal = dep - wtd;
				System.out.println("잔고> " + bal);
				
			}
			if(chmon == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}	sc.close();	
		
		
		
	}
//
//}
// nextInt로 푼 방법
//	public static void method0() {
//		Scanner sc = new Scanner(System.in);
//
//		boolean isRun = true;
//		int money = 0, m = 0;
//		while (isRun) {
//			System.out.println("---------------------------");
//			System.out.println("1.예금 │ 2.출금 │ 3.잔고 │ 4.종료");
//			System.out.println("---------------------------");
//			System.out.println("선택 > ");
//			int sel = sc.nextInt();
//			switch (sel) {
//			case 1:
//				System.out.println("예금액 > ");
//				m = sc.nextInt();
//				money += m;
//				break;
//			case 2:
//				System.out.println("출금액 > ");
//				m = sc.nextInt();
//				money -= m;
//				break;
//			case 3:
//				System.out.println("잔고 > " + money);
//				break;
//			case 4:
//				isRun = false;
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//
//		sc.close();
//	}
//
//// nextLine로 푼 방법
//	public static void method1() {
//		Scanner sc = new Scanner(System.in);
//
//		boolean isRun = true;
//		int money = 0;
//		String m;
//		while (isRun) {
//			System.out.println("---------------------------");
//			System.out.println("1.예금 │ 2.출금 │ 3.잔고 │ 4.종료");
//			System.out.println("---------------------------");
//			System.out.print("선택 > ");
//			String sel = sc.nextLine();
//			switch (sel) {
//			case "1":
//				System.out.println("예금액 > ");
//				m = sc.nextLine();
//				money += Integer.parseInt(m);
//				break;
//			case "2":
//				System.out.println("출금액 > ");
//				m = sc.nextLine();
//				money -= Integer.parseInt(m);
//				break;
//			case "3":
//				System.out.println("잔고 > " + money);
//				break;
//			case "4":
//				isRun = false;
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//
//		sc.close();
//	}
//
//	public static void main(String[] args) {
////		method0();
//		method1();
//	}
}
