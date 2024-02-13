package ch15.thread.ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
	public static void main(String[] args) {
		// 기본 1차원 배열 3개짜리가 1000개 층으로 쌓여있다.
		// 1000개의 메일 생성
		String [][] mails = new String[1000][3];
		for(int i=0;i<mails.length;i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품 입고";
		}
		
		// ExecutorService 생성
		// 스레드풀은 5개의 스레드 보유
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 이메일을 보내는 작업 생성 및 처리 요청
		for(int i=0;i<1000;i++) {
			final int idx = i;
			// 스레드풀의 스레드에 함수 지정해줌
			executorService.execute(new Runnable(){
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + " : " + content);
				}
			});
		}
		
		// ExecutorService 종료
		executorService.shutdown();
	}
}
