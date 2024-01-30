package ch03.while08;

// while문을 이용해서 1부터 10까지 합을 출력하세요
public class Resolve3 {

	public static void main(String[] args) {
		int sum = 0;
		//i=1일경우, 출력 후 i++, 조건은 i <= 10 
		int i=1;
		while(i<=10) {
		 sum += i;
		 i++;
		} //중괄호가 이 위치일 경우 1~10까지의 합만 계산 but 프린트 아래로 갈경우, 위의 경우 같이 반복함
		 System.out.println("1~" + (i-1) + "의 합:" + sum);
		
		
	}

}
