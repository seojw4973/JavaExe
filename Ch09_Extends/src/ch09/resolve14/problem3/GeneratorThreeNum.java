package ch09.resolve14.problem3;

/* 0~9사이의 숫자를 랜덤으로 뽑아서
 * 그것을 배열에 저장
*/
public class GeneratorThreeNum extends BaseBall {
	

	public void generatorThreeNum() {
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 9 + 1);
			for (int j = 0; j < i; j++) {
				if (numArr[j] == numArr[i]) {
					i--;
					break;
				}

			}
		}
		for(int x : numArr) {
			System.out.println(x + " ");
		}
	}
}
