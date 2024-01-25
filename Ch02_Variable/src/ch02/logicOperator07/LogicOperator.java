package ch02.logicOperator07;

public class LogicOperator {
	public static void main(String[] args) {
		boolean logic;
		
		// And 연산
		logic = true && true;
		System.out.println("true && true => " + logic);
		logic = true && false;
		System.out.println("true && false => " + logic);
		// Or 연산
		logic = true || true;
		System.out.println("true && true => " + logic);
		logic = true || false;
		System.out.println("true && false => " + logic);
		// Xor 연산 (서로 다른 논리일 경우 true)
		logic = true ^ true;
		System.out.println("true && true => " + logic);
		logic = true ^ false;
		System.out.println("true && false => " + logic);
		// Not 연산 (반대로 연산)
		logic = !false;
		System.out.println("!false => " + logic);
		logic = !true;
		System.out.println("!true => " + logic);
	}

}
