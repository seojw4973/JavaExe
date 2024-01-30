package ch05.array08;

import java.util.Arrays;

public class Resolve1 {
	public static void main(String[] args) {
		int [] num = {91, 50, 73, 89, 71};
		
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
//		for (int i = 1; i < num.length; i++) {
//			if (num[0] < num[i])
//
//				if (num[4] > num[i])
//					;

		
		System.out.println(num[0]);
		System.out.println(num[4]);
	}
}
