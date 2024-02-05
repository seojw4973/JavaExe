package ch09.resolve14.problem3;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	Scanner sc = new Scanner(System.in);
	int[] numArr = new int[3];
	int inputArr[] = new int[3]; // 유저가 입력한 숫자를 넣기위한 length 3인 빈 배열
	int strike = 0; // 입력한 값의 strike를 저장받을 변수
	int ball = 0; // 입력한 값의 ball을 입력받을 변수

	private int firstSelNum() {
		System.out.println("첫 번째 숫자 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}

	private int secondSelNum() {
		System.out.println("두 번째 숫자 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
		
	private int thirdSelNum() {
		System.out.println("세 번째 숫자 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	
		
	}








}
