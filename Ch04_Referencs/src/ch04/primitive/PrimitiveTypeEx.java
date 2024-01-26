package ch04.primitive;

public class PrimitiveTypeEx {
	public static void main(String[] args) {
		// 아래 변수는 Stack에 생성되었다가
		// main의 영역을 벗어나면 Stack에서 사라진다.
		// 지역변수
		// Stack : 바로 사용, 끝나면 해제
		// 힙 : 스택보다 훨씬 크고, 큰 데이터 보관, 상대적으로 오래 보관
		// 코드 : 실행, method
		
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 9999999;
		long l = 9999999999999L;
		float f = 3.14f;
		double d = 3.14;
		System.out.printf("byte size : %d bit\n", Byte.SIZE);
		System.out.printf("char size : %d bit\n", Character.SIZE);
		System.out.printf("short size : %d bit\n", Short.SIZE);
		System.out.printf("int size : %d bit\n", Integer.SIZE);
		System.out.printf("long size : %d bit\n", Long.SIZE);
		System.out.printf("float size : %d bit\n", Float.SIZE);
		System.out.printf("double size : %d bit\n", Double.SIZE);
	}

}
