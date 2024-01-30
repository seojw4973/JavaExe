package ch08.class06;

public class HumanMain {
	public static void viewInfo(Human human) {
		System.out.println("이름 : " + human.getName());
		System.out.println("나이 : " + human.getAge());
		System.out.println("학점 : " + human.getScore());
	}
		
	public static void main(String[] args) {
		Human human = new Human();
		/*
		human.name = "홍길동";
		human.age = 24;
		human.score = 4.5;
		*/
		human.setName("홍길동");
		human.setAge(24);
		human.setScore(4.5);

		viewInfo(human);
		/* 중간에 많은 처리/연산이 있었다.
		 * 그러다 age나 score 값의 음수가 들어갔다.
		 * */
		human.setAge(-10);
		human.setScore(-20.9);
				
		viewInfo(human);
	}
}









