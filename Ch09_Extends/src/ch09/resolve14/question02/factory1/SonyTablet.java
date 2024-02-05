package ch09.resolve14.question02.factory1;

import ch09.resolve14.question02.ITablet;

public class SonyTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("SonyTablet - 映画がよく見える~N");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("SonyTablet - 歌がよく聞こえる~N");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("SonyTablet - 読書に非常によい~N");
		Thread.sleep((long)(Math.random()*500)+500);
	}

}
