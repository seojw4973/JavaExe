package ch09.Resolve07.answer05;

public class Resolve5 {
	Resolve5(){}
	private int num;
	private String name;
	
	
	public Resolve5(int num, String name) {
		this.num = num;
		this.name = name;
	}
			
	public void getbead(Resolve5 bead, int num) {
		this.num += bead.lostBead(num);
	}
	
	public int lostBead(int num) {
		if(this.num < 0) {
			int temp = 0;
			temp = this.num;
			return temp;
		}
		this.num -= num;
		return num;
	}
	public void show() {
		System.out.println(name + "의 구슬은 " + num + "개 입니다.");
		
	}
}
