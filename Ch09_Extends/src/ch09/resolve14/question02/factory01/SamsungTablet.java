package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class SamsungTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("SamsungTablet - 영화가 잘 보인다~S");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("SamsungTablet - 노래가 잘 들린다~S");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("SamsungTablet - 책 읽기에 매우 좋다~S");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	
}
