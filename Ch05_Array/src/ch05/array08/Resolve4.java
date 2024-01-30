package ch05.array08;

import java.util.Arrays;

public class Resolve4 {
	public static void main(String[] args) {
		int[] num = {91, 50, 73, 89, 71};
		int temp = 0;
		
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i<num.length;i++) {
			for(int j = i+1; j<num.length;j++) {
				if(num[i] > num[j]) {
					temp = num[j];
					num[j] = num[i];	
					num[i] = temp;		
				}
				
					
			}
		}System.out.println(Arrays.toString(num));
	}

}
