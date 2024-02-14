package ch16.lambda02.ch06.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		// Member 클래스의 parameter 1개짜리 생성자 메서드 전달
		Member m1 = person.getMember1(Member :: new);
		System.out.println(m1);
		System.out.println();
		
		
		// Member 클래스의 parameter 2개짜리 생성자 메서드 전달
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
	}
}
