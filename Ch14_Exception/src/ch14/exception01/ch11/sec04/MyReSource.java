package ch14.exception01.ch11.sec04;

public class MyReSource implements AutoCloseable{
	private String name;
	
	public MyReSource(String name) {
		this.name = name;
		System.out.println("[MyReSource(" + name + ") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyReSource(" + name + ") 읽기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyReSource(" + name + ") 읽기]");
		return "abc";
	}
	
	@Override
	public void close() throws Exception{
		System.out.println("[MyReSource(" + name + ") 닫기]");
	}
	
	
}
