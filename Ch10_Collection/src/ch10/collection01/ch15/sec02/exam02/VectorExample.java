package ch10.collection01.ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

import ch10.collection01.ch15.sec02.exam01.Board;

/* ArrayList와 동일하다
 * 
 * 다만 멀티스레드 환경에서 2개 이상의 스레드가 동시 접근할 때 안전하다.
 * 1개 스레드일 때는 ArrayList보다 약간 성능 저하가 있다.(동기화 처리 때문)
 * ArrayList와 구조는 동일
 * */
public class VectorExample {
	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> list = new Vector<>();
//		List<Board> list = new ArrayList<>(); -> 두 스레드가 동시에 add() 메서드를 호출할 수 있기 때문에 경합이 발생하여 하나만 저장되거나 PC에 따라 에러가 발생

		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			public void run() {
				// 객체 1000개 추가
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			public void run() {
				// 객체 2000개 추가
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		// 작업 스레드 실행
		threadA.start();
		threadB.start();

		// 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}

		// 저장된 총 객체 수 읽기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();

	}
}
