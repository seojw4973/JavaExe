package ch09.Resolve07.answer02;

public class Triangle {
	Triangle(){}
	private int width, height;
	
	public Triangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public void trans(int x, int y) {
		this.width = x;
		this.height = y;
	}
	// double로 설정해서 2로 나눴을때 소숫점 값까지 표현할 수 있게 수정
	public double square() {
		return	(double) (width * height)/2;
	}
	
	public void show() {
		System.out.println("삼각형의 밑변은 : " + width);
		System.out.println("삼각형의 높이는 : " + height);
		System.out.println("삼각형의 넓이는 : " + square());
		System.out.println();
	}
	
	
	
}
