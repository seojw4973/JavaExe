package ch09.resolve14.problem3;

import java.util.Scanner;

public class DecisionBall extends BaseBall {
	Scanner sc = new Scanner(System.in);

	public void inputNum() {
		for (int i = 0; i < numArr.length;i++) {
			inputArr[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (inputArr[j] == inputArr[i]) {
					i--;
					break;
				}

			}
		}
	}

	public void decisionBall() {
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < inputArr.length; j++) {
				if (numArr[i] == inputArr[j] && i == j) {
					strike++;
				} else if (numArr[i] == inputArr[j] || i == j) {
					ball++;
				}
			}
	System.out.println(strike+"스트라이크"+ball+"볼");
	if(strike==3) {
    	System.out.println("정답!");
           	break;
	}
	strike=0;ball=0;
	sc.close();
		}
	}

}
