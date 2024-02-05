package ch10.collection01.ch15.sec04.exam02;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
	public static void main(String[] args) {
		// Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();
//		Map<String, Integer> map = new HashMap<>();			// hashMap은 두 스레드가 동시에 put() 메서드를 호출할 수 있기 때문에 경합 발생, 결국 하나만 저장되거나 에러 발생
		
		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			public void run() {
				// 엔트리 1000개 추가
				for(int i=1;i<=1000;i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			public void run() {
				// 엔트리 1000개 추가
				for(int i=1001;i<=2000;i++) {
					map.put(String.valueOf(i), i);
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
		}catch (Exception e) {
		}
		
		// 저장된 총 엔트리 수 얻기
		int size = map.size();
		System.out.println("총 엔트리 수 : " + size);
		System.out.println();
	}
}
