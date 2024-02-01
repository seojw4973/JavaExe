package ch09.Resolve07.answer05;

public class Resolve5Main {
	public static void main(String[] args) {
		String fKid = "철수";
		String sKid = "훈이";
		
		Resolve5 fBd = new Resolve5(15, fKid);
		Resolve5 sBd = new Resolve5(9, sKid);
		
		fBd.show();
		sBd.show();
		
		System.out.println();
		
		System.out.println("1차 게임에서 " + fKid + "는 " + sKid + "의 구슬 2개를 가져갑니다.");
		fBd.getbead(sBd, 2);
		
		fBd.show();
		sBd.show();
		
		System.out.println();
		
		System.out.println("2차 게임에서 " + sKid + "는 " + fKid + "의 구슬 7개를 가져갑니다.");
		sBd.getbead(fBd, 7);
		
		fBd.show();
		sBd.show();
	}
}
