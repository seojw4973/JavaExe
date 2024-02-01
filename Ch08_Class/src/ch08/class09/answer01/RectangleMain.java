package ch08.class09.answer01;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(2, 3, 4, 5);
		
		
		r.show();
		s.show();
		System.out.println("직사각형 s의 넓이는 " + s.square());
		r.set(2, 2, 4, 5);
		r.show();
		System.out.println("직사각형 r의 넓이는 " + r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
		
	}
}
