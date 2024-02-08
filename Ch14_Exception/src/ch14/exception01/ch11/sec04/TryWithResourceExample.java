package ch14.exception01.ch11.sec04;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(MyReSource res = new MyReSource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		
		System.out.println();
		
		try(MyReSource res = new MyReSource("A")){
			String data = res.read2();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		
		System.out.println();
		
		MyReSource res1 = new MyReSource("A");
		MyReSource res2 = new MyReSource("B");
		try(res1; res2){
			String data1 = res1.read1();
			String data2 = res2.read1();
		}catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
	}
}
