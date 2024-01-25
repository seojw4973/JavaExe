package ch03.while08;

public class Resolve1 {
	public static void main(String[] args) {
		
		int i=0;
		while(i<100) {
		i++;
		System.out.print(i+ ", ");
		// 1부터 시작할 시, 출력을 먼저 한 후에 i++ 붙여줌. 조건은 i<= 100이거나, i<101
		// 출력을 아래로 말고 오른쪽으로 쭉 출력하기 위해서는 println 말고 print 사용
		}
	}
}
