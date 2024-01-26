package ch05.array04;

import java.util.Scanner;

public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int [7];
		for(int i = 0; i < score.length;i++) {
			System.out.println((i+1) + "번째 학생의 학점을 입력하세요");
			score[i] = sc.nextInt();
		}
		int total = 0;
		double avg = 0.;
		for(int i = 0; i<score.length;i++) {
			total += score[i];
		}
		avg = (double)total/score.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		sc.close();
	}

}
