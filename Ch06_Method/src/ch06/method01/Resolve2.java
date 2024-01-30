package ch06.method01;

import java.util.Scanner;

public class Resolve2 {
	public static int abs(int num0, int num1) {
		int result = num0 - num1;
		if(result < 0)
			result = -result;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		int num0 = sc.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		int result = abs(num0, num1);
		
		System.out.println("절댓값은 " + result);
			
		
		sc.close();
	}
}
