package ch03.for10;

//for문을 이용해서 1부터 10까지 합을 출력하세요
public class Resolve10 {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		for(; i <= 10; i++) {
			sum += i;
		} 
		
		System.out.println("1~" + (i-1) + "까지 합 : " + sum);
	}	

}
