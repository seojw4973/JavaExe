package ch08.class11;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model){
		this(model, "은색", 250);		// 매개변수 3개를 넣는 생성자를 실행시켜 정보 입력함
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
