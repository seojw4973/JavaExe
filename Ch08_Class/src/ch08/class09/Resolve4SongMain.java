package ch08.class09;

public class Resolve4SongMain {
	public static void show(Resolve4Song dancingQueen) {
		System.out.println("노래제목 : " + dancingQueen.getSongInfo0());
		System.out.println("가수 : " + dancingQueen.getSongInfo1());
		System.out.println("앨범제목 : " + dancingQueen.getSongInfo2());
		System.out.println("작곡가 : " + dancingQueen.getSongInfo3());
		System.out.println("노래가 발표된 연도 : " + dancingQueen.getSongInfo4());
		System.out.println("노래가 속한 앨범에서의 트랙 번호 : " + dancingQueen.getSongInfo5());
	}
	public static void main(String[] args) {
		Resolve4Song dancingQueen = new Resolve4Song();
		
		dancingQueen.setSongInfo0("Dancing Queen");
		dancingQueen.setSongInfo1("ABBA");
		dancingQueen.setSongInfo2("NOW 100 Hits Party");
		dancingQueen.setSongInfo3("Bjorn Ulvaeus");
		dancingQueen.setSongInfo4(1976);
		dancingQueen.setSongInfo5(2);
		
		show(dancingQueen);
	}
}


