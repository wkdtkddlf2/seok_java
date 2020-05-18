package com.ict.edu;

import java.util.Random;

// Random 클래스를 상속받아서 사용
public class Ex03 extends Random {
	public static void main(String[] args) {
		// main 메소드도 static 이기때문에 static 을 만들지못한다.
		// int num = nextInt(10)+1; // 1-10

		// static 메소드가 아니라
		// int num = nextInt(10)+1; // 1-10
		// System.out.println(num);

		// play()를 사용하기 위해서는 현재 클래스를 객체로 만들어야한다.
		Ex03 e3 = new Ex03();
		e3.play();
	}

	public void play() {
		int num = nextInt(10) + 1; // 1-10
		System.out.println(num);

	}
}