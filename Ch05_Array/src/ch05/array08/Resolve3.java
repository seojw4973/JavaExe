package ch05.array08;
/* 정수 배열 5개를 할당하고
 * System.out.println(Arrays.toSrting(numArr));
 * 로 배열을 출력했을 때 거꾸로 출력되도록
 * 배열의 값을 거꾸로 저장하세요.
 * */
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
