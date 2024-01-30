package ch06.method01;

public class Resolve3 {
	public static int total(int num0, int num1) {
		int sum = 0;
		for(int i = num0;i <= num1; i++) {
			sum += i;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = total(1, 100);
		System.out.println("누적합은 " + result);
		
		int result1 = total(10, 20);
		System.out.println("누적합은 " + result1);
		
		int result2 = total(1, 1000);
		System.out.println("누적합은 " + result2);
	}
}
