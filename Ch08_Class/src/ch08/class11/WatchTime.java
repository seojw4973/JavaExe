package ch08.class11;


public class WatchTime {
	private int hour, min, sec;
		
//	public WatchTime(WatchTime this, int hour, int min, int sec)
	public WatchTime(int hour, int min, int sec) {
		System.out.println("this:" + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	//public void viewTime(WatchTime this)
	public void viewTime() {
		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}
	
	public static void main(String[] args) {	//main -> 함수가 실행되자마자 가장 먼저 메모리에 등록됨
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum:" + wtNum);
		System.out.printf("wtNum:%x\n", wtNum.hashCode()); // x : 뒤의 정수값을 16진수로 표현해라
		wtNum.viewTime();		//내부적으로 viewTime(wtNum)으로 호출됨
		
		WatchTime wtNum1 = new WatchTime(13, 23, 53);
		System.out.println("wtNum1:" + wtNum1);
		System.out.printf("wtNum:%x\n", wtNum1.hashCode()); // x : 뒤의 정수값을 16진수로 표현해라
		wtNum1.viewTime();		//내부적으로 viewTime(wtNum1)으로 호출됨
		
		
	}
}

