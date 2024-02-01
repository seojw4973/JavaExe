package ch08.class09.answer05;

public class Resolve5RectangleMain {
	public static void main(String[] args) {
		Resolve5Rectangle r = new Resolve5Rectangle();
		Resolve5Rectangle s = new Resolve5Rectangle(2, 3, 4, 5);
		
		
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
