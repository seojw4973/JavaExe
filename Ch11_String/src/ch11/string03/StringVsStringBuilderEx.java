package ch11.string03;

/* 
 * https://12bme.tistory.com/42
 * 
 * String : immutable(불변)
 * StringBuilder : mutable(변함)
 * StringBuffer : mutable(변함), 멀티스레드 동기화 처리
 * */
public class StringVsStringBuilderEx {
	
	public static long getStringSpeed() {
		
		String str = "";
		long start = System.nanoTime();
		for(int i=0;i<26;i++)
			str += (char)('a' + i);
		long end = System.nanoTime();
		System.out.println("String : \t" + str);
		
		return end-start;
	}
	
	public static long getStringBuilderSpeed() {
		
		StringBuilder strBuilder = new StringBuilder(26);
		long start = System.nanoTime();
		for(int i=0;i<26;i++)
			strBuilder.append((char)('a' + i));
		long end = System.nanoTime();
		System.out.println("StringBuilder : \t" + strBuilder.toString());
		
		return end-start;
	}
	
	public static void main(String[] args) {
		long strNanos = getStringSpeed();
		long strBuilderNanos = getStringBuilderSpeed();
		System.out.println("String 시간 = " + strNanos);
		System.out.println("StringBuilder 시간 = " + strBuilderNanos);
	}
}
