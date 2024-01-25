package ch03.dowhile09;

public class DowhileEx {
	public static void main(String[] args) {
		// 1 ~ 10까지 출력
		// While는 조건을 검사하고 실행하는 반면
		// do~While는 1번은 무조건 실행하고 조건을 검사하여 반복 결정
		int i = 1;					// 초기값
		do {
			System.out.println(i);	// 실행
			i++;					// 증감
		}while (i <= 10);			// 조건(언제까지)
	}

}
