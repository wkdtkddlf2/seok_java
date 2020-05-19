package com.ict.edu4;

// final : 종단, 끝의 의미가 있다.

// final class => 상속안됨.
// final method => 오버라이딩 안됨
// final 변수 => 값 변경이 안됨(상수라는뜻)

public class Animal {
	String name;
	int eyes = 2;
	int legs = 4;

	public void like() {
		System.out.println("잠자기");
	}

	public void sound() {
		System.out.println("울음소리");

	}

	public final void sleep() {
		System.out.println("6시간만 잠을 잔다.");
	}

}
