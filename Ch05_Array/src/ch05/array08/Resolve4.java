package ch05.array08;
/*	정수 배열 5개를 할당하고
 * 	Arrays.sort를 사용하지 말고
 * 	배열을 오름차순으로 정렬하도록 저장하세요.
 * 	그리고 출력하세요.
 * */
import java.util.Arrays;

public class Resolve4 {
//	버블정렬 이용
	public static void main(String[] args) {
		int[] num = { 91, 50, 73, 89, 71 };
		
//		int [] num = new int[10000];
//		
//		for(int i = 0;i<num.length;i++) {
//			double dVal = Math.random();
//			num[i] = (int)(dVal*100000);
//
//		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(num));
	}

}
//	public static void method1() {
//		int [] numArr = new int[10000];
//		
//		for(int i = 0;i<numArr.length;i++) {
//			double dVal = Math.random();
//			numArr[i] = (int)(dVal*100000);
//		}
//		System.out.println(Arrays.toString(numArr));
//	}
//}
