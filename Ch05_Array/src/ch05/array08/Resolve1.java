package ch05.array08;
// 정수 배열 5개를 할당하고
// Arrays.sort를 활용해서 최솟값과 최댓값을 얻으세요
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
