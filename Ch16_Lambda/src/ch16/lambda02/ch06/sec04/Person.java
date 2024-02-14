package ch16.lambda02.ch06.sec04;

public class Person {
	public void action(Calculable calculable) {
		double result = calculable.calc(10,4);
		System.out.println("결과 : " + result);
	}
}
