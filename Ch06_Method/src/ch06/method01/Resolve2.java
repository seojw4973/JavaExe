package ch06.method01;

import java.util.Scanner;

//2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//절대값이 계산되어서 출력되어야 합니다
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
