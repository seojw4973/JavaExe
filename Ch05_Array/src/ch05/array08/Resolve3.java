package ch05.array08;

import java.util.Arrays;

public class Resolve3 {
	public static void main(String[] args) {
		int[] num = {91, 50, 73, 89, 71};
				
		System.out.println(Arrays.toString(num));
				
		for(int i = 0;i<num.length/2;i++) {
			int fIdx = i;
			int lIdx = num.length-1-i;
			int pre = num[fIdx];
			int suf = num[lIdx];
			
			num[fIdx] = suf;
			num[lIdx] = pre;
		}
		System.out.println(Arrays.toString(num));
	}	
}
