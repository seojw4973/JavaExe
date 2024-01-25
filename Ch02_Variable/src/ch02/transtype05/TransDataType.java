package ch02.transtype05;

public class TransDataType {

	public static void main(String[] args) {
		int total = 297;	// 총점 
		int stNum = 4;		// 학생 수
		double avg = 0.;	// 평균
		System.out.println("총점은 " + total + "입니다.");
		System.out.println("평균은 " + (total/stNum) + "입니다.");
		avg = total/stNum;
		System.out.println("평균은 " + avg + "입니다.");
		/* 실수와 정수의 연산의 결과는?
		 * 실수의 표현범위 >  정수
		 * 결과값은 실수 자료형으로 나온다.
		 */
		avg = (double)total/stNum;	// total, stNum 둘 중 어디든 (double)를 붙이면 정수를 실수로 자동변환 가능
		System.out.println("평균은 " + avg + "입니다.");
		
		int nAvg = (int)avg;
		System.out.println("평균은 " + nAvg + "입니다.");
	}

}
