package ch03.continue11;

public class Resolve1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {

			if (i % 3 == 0) {
				sum += i;

			}

		}
		System.out.println("3의 배수 총합을 출력합니다 : " + sum);

	}

}
