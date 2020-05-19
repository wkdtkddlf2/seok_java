package com.ict.edu3;

public class T_Sub extends T_Super {
	String addr;
	int car;

	public T_Sub() {
		super("홍길동", 24);
		System.out.println("자식 생성자1");
	}

	public T_Sub(String addr) {
		this.addr = addr;
		System.out.println("자식 생성자2");
	}

	public T_Sub(int car) {
		this.car = car;
	}

	public T_Sub(String addr, int car) {
		this.addr = addr;
		this.car = car;
	}

	public T_Sub(int car, String addr) {
		this.addr = addr;
		this.car = car;
	}
}
