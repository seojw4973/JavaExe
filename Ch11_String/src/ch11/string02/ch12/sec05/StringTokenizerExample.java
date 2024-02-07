package ch11.string02.ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		// 문자열을 구분짓는 1번째 방법
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		// 문자열을 구분짓는 2번째 방법
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
