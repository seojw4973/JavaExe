package ch15.thread02.syncerror07;

class Value{
	private int num = 0;
	public int getNum() {
		return num;
	}
	public void Increment() {
		num++;
	}
}

class IncThread extends Thread{
	private Value val;
	public IncThread(Value val) {
		this.val = val;
	}
	@Override
	public void run() {
		for(int i=0;i<100000;i++)
			val.Increment();
		}
}

public class ThreadSyncError {
	public static void main(String[] args) {
		Value val = new Value();
		IncThread it1 = new IncThread(val);
		IncThread it2 = new IncThread(val);
		// 스레드를 동시에 진행했을 때 원하는 결과가 나오지 않는다.
		it1.start();
		it2.start();
		
		try {
			it1.join();
			it2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(val.getNum());
	}
}



