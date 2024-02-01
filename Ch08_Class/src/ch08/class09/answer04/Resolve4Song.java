package ch08.class09.answer04;

public class Resolve4Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setSongInfo0(String _title) {
		title = _title;
	}
	public void setSongInfo1(String _artist) {
		artist = _artist;
	}
	public void setSongInfo2(String _album) {
		album = _album;
	}
	public void setSongInfo3(String _composer) {
		composer = _composer;
	}
	public void setSongInfo4(int _year) {
		year = _year;
	}
	public void setSongInfo5(int _track) {
		track = _track;
	}
	
	public String getSongInfo0() {
		return title;
		}
	public String getSongInfo1() {
		return artist;
		}
	public String getSongInfo2() {
		return album;
	}
	public String getSongInfo3() {
		return composer;
	}
	public int getSongInfo4() {
		return year;
	}
	public int getSongInfo5() {	
		return track;
	}
}
