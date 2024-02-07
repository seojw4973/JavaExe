package ch10.collection02.linkedlist01;

/* 다형성(Polymorphism)
 * 1) 부모 클래스에 자식 객체를 담을 수 있다. (묶어서 관리)
 * 2) 부모 클래스 변수로 메서드를 호출하면 각 객체의 메서드가 호출된다. (자식의 고유한 개성은 발현)
 */
public abstract class Employee {
	protected String empno;		// 사번
	protected String name;		// 이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public void showEmployeeInfo() {
		System.out.println("-------------------");
		System.out.println("사번 : " + empno);
		System.out.println("이름 : " + name);
	}
	public abstract double getMonthPay();	// 추상메서드
}
