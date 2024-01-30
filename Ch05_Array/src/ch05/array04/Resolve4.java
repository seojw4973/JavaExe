package ch05.array04;

//4. int배열을 10개 생성하세요.
//int배열에 3의 배수를 차례대로 저장하세요.
//그리고 거꾸로 출력하세요.
// 역순 추가해야댐!
public class Resolve4 {
	public static void main(String[] args) {
		int [] num = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
		for(int i=9; i>=0; i--) {
			System.out.println((i+1) + "번째 3의 배수 출력 : " + num[i]);
		
		
	}
	}
}
