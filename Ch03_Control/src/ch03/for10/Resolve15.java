package ch03.for10;

// Ctrl + Shift + F : 코드 자동 정렬
import java.util.Scanner;

//사용자로부터 정수를 입력받습니다.
//입력 받은 값을 계속 더합니다
//사용자가 0을 입력하면 합을 출력합니다
//프로그램을 종료합니다.
public class Resolve15 {
	public static void main(String[] args) {
		int num;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

//		while(true) {
//			System.out.print("숫자 입력 >> ");
//			num = sc.nextInt();
//			if (num == 0)
//				break;
//			sum += num;
//		}
//		System.out.println("누적합은 " + sum);

		do {
			System.out.println("숫자 입력 >> ");
			num = sc.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println("누적합은 " + sum);

		sc.close();
	}

}