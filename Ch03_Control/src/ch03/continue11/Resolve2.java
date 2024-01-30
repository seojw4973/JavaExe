package ch03.continue11;

/* for 문을 이용해서 아래 출력
 * *
 * **
 * ***
 * ****
 * *****
 * */
public class Resolve2 {
	public static void main(String[] args) {
//		for(int i = 1; i<=5 ; i++) {
//			if (i == 1)
//				System.out.println("*");
//			else if (i == 2)
//				System.out.println("**");
//			else if (i == 3)
//				System.out.println("***");
//			else if (i == 4)
//				System.out.println("****");
//			else if (i == 5)
//				System.out.println("*****");
//		}
		for (int i = 0;i<=5;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
