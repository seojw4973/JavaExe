package ch02.variable01;

public class DataType {
	public static void main(String[] args) {
		// 자료형 변수공간이름 = 값
		int num = 100;			// 정수
		double dnum = 3.14;		// 실수 (소수점까지 포함)
		char ch = 'a';			// 문자 1글자('' 사용)
		String name = "홍길동";	// 문자열("" 사용)
		boolean isRun = true;	// true/false
		String str = "a";		// 문자열
		String name1 = "Albert";
		
		System.out.println(num);
		num = 999;
		System.out.println(num);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(name);
		System.out.println(isRun);
		System.out.println(str);
		System.out.println(name1);
	}
}
