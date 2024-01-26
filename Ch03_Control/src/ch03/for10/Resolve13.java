package ch03.for10;

import java.util.Scanner;

public class Resolve13 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		num = sc.nextInt();
				
		
		for(int i = 1; i <= num; i++)
			System.out.println(3*i);
				
		sc.close();
	}

}
