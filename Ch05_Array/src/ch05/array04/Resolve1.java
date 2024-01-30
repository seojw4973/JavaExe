package ch05.array04;

//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class Resolve1 {
	public static void main(String[] args) {
		String [] names = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		for(int i=0;i<names.length;i++) {
			System.out.println((i+1) + "번째 이름 출력 : " + names[i]);
		}
	}

}
