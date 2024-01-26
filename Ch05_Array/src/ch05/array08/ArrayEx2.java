package ch05.array08;

import java.util.Arrays;


public class ArrayEx2 {
	public static void main(String[] args) {
		// arr은 1차원 배열을 가리키는 3개의 창조변수 배열을 가리킨다.
		int [][] arr = new int [3][];
		// arr의 배열요소는 1차원 배열을 가리킨다(참조값(해시코드값)을 가지고 있다).
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = i*3 + j;
			}
		}
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		for(int[] temp : arr)
			System.out.println(Arrays.toString(temp));
	}
}