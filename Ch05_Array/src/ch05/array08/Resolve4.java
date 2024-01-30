package ch05.array08;

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
//	public static void method0() {
//		int [] numArr = new int[10000];
//		
//		for(int i = 0;i<numArr.length;i++) {
//			double dVal = Math.random();
//			numArr[i] = (int)(dVal*100000);
//		}
//		System.out.println(Arrays.toString(numArr));
//	}
//}
