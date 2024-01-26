package ch03.for10;

// Ctrl + Shift + F : 코드 자동 정렬
import java.util.Scanner;

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