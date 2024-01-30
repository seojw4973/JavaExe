package ch03.while08;

/*	while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
 * 	while문 내에 조건문을 넣어주면됨
 *  짝수 조건 if(num % 2 == 0)
 * */
public class Resolve4 {
	public static void method1() {
		//i=1 일경우 출력 후 i++ 붙여줌, 이때 조건은 i<=10
		int i=0;
		while(i<10) {;
		i++;
			if(i % 2 ==0)
				System.out.print(i + ", ");
		}
	}
	public static void method2() {
		int num = 2;
		while(num <= 10) {
			System.out.println(num);
			num++;
		}

	}
}
