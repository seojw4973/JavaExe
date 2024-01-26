package ch05.array04;

import java.util.Scanner;

public class Resolve6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];
		int[] score = new int[5];

		for (int i = 0; i < name.length; i++) {
			System.out.println((i+1) + "번째 학생 이름 : ");
			name[i] = sc.next();
		
			System.out.println((i+1) + "번째 학생 점수 : ");
			score[i] = sc.nextInt();
		}
		
		
		for (int i=0; i<score.length;i++)
		if (score[i] >= 90) {
				System.out.println(name[i] + " A");
			}
		else if (score[i] >= 80) {
				System.out.println(name[i] + " B");
			}
		else if (score[i] >= 70) {
				System.out.println(name[i] + " C");
			}
		else if (score[i] >= 60) {
				System.out.println(name[i] + " D");
			}
		else if (score[i] < 60) {
				System.out.println(name[i] + " E");
			}
			sc.close();
		}
	}

