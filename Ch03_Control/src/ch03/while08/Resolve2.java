package ch03.while08;

// while문을 이용해서 10부터 20까지 출력하세요
public class Resolve2 {

	public static void main(String[] args) {
		int i=9;
		while(i<20) {;
		i++;
		System.out.print(i + ", ");
		// i=10일경우, 먼저 출력한 후에 i++을 뒤에 붙여줌. 그경우 조건은 i<=20으로 할 수 있음
		}
	}

}
