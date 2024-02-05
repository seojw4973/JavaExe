package ch09.resolve14.question02.order1;

import ch09.resolve14.question02.ITablet;

public class TabletTester {
	private final int TEST_NUM = 2;
	private ITablet tablet;

	
	public TabletTester(ITablet tablet) {
		this.tablet = tablet;
	}

	public TabletTester() {

	}

	public void setCar(ITablet tablet) {
		this.tablet = tablet;
	}

	public int movieTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.movie();
			tablet.movie();
		}
		return (int) (Math.random() * 50) + 50; // 50~99 사이 값 리턴
	}

	public int musicTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.music();
			tablet.music();
			tablet.music();
		}
		return (int) (Math.random() * 50) + 50;
	}

	public int readBookTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.readBook();
			tablet.readBook();
			tablet.readBook();
			tablet.readBook();
		}
		return (int) (Math.random() * 50) + 50;
			
	}
}
