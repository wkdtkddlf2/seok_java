package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DCaPhone dca = new DCaPhone();

		dca.call(); // 부모
		dca.sms(); // 부모
		dca.dca(); // 자식
		System.out.println("=========");

		MP3Phone mp3 = new MP3Phone();

		mp3.call(); // 부모
		mp3.sms(); // 부모
		mp3.sound();// 자식
		System.out.println("=========");

		// 자식 클래스 = 자식클래스
		GamePhone gp = new GamePhone();
		gp.call(); // 부모
		gp.sms(); // 부모
		gp.play(); // 자식
		System.out.println("=========");

		// 부모클래스 = new 자식클래스생성자()
		Phone p1 = new DCaPhone();
		p1.call();// 부모
		p1.sms(); // 부모
		// p1.dca(); // 자식 , 오류발생

		Phone p2 = new MP3Phone();
		p2.call();
		p2.sms();
		// p2.sound();

	}

}
