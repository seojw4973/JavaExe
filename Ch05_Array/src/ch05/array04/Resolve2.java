package ch05.array04;


// 역순 추가해라
public class Resolve2 {
	public static void main(String[] args) {
		String [] names = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		for(int i=9; i>=0; i--) {
			System.out.println((i+1) + "번째 이름 출력 : " + names[i]);
		}
	}
}
