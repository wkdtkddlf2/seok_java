package com.ict.edu;

public class Ex14_main {
	String name = "태권브이";
	static String addr = "제주도";

	public static void main(String[] args) {
		// 인스턴스 전역변수 사용못함
		// System.out.println(name);

		// static 변수 사용가능
		System.out.println(addr);

		Ex14 t1 = new Ex14();
		System.out.println(t1.su);
		System.out.println(t1.num);
		System.out.println(Ex14.num);
		System.out.println("=======");

		Ex14 t2 = new Ex14();
		System.out.println(t2.su);
		System.out.println(t2.num);
		System.out.println(Ex14.num);
		System.out.println("=======");

		Ex14 t3 = new Ex14();
		System.out.println(t3.su);
		System.out.println(t3.num);
		System.out.println(Ex14.num);
		System.out.println("========");

		System.out.println(t1.num);
		System.out.println(t2.num);
		System.out.println(t3.num);
		System.out.println(Ex14.num);

	}
}
