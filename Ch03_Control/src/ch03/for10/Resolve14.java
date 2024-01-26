package ch03.for10;

import java.util.Scanner;

public class Resolve14 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 출력하고 싶은 단의 숫자 입력 >> ");
		num = sc.nextInt();
				
		
		for(int i = 1; i <= 9; i++)
		System.out.printf("%d * %d = %d\n", i, num, num*i); // \n은 한줄 띄우고 출력한다는 의미
				
		sc.close();
	}

}
