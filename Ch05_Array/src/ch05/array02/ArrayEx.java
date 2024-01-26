package ch05.array02;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int 변수 공간 3개 만들어줘. 대표이름은 kor
		// 배열은 메모리 내부에서 연속공간으로 할당된다.
		int[] kor = new int[5];

		// 3명의 국어점수 입력
		for(int i=0;i<kor.length;i++) {
		System.out.print((i+1) + "번째 학생 국어점수 입력 >> ");
		kor[i] = sc.nextInt();
		}
		
		int total = 0;
		double avg = 0.;
		for (int i = 0; i < kor.length; i++) {
			total += kor[i];
		}
		avg = (double)total / kor.length;

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f\n", avg);

		sc.close();
	}

}
