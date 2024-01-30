package ch05.array08;

import java.util.Arrays;

public class Resolve2 {
	public static void main(String[] args) {
		int[] num = {91, 50, 73, 89, 71};
		int min, max;
		min = max = num[0];
		
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]);
				min = num[i];

				if (max < num[i])
					max = num[i];
		}
		
		System.out.println("최솟값은 : " + min);
		System.out.println("최댓값은 : " + max);
	}

}
