package com.ict.edu4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 오버로딩 : 한 클래스안에서 같은이름의 메소드가 여러개 존재하는 것
		// ( 인자의 자료형이나 갯수가 다르다)

		// 오버라이딩 : 상속관계에서 부모메소드와 자식메소드가 같은 것.
		// 이때 자식 클래스가 부모 메소드를 가져다 쓰는 대신에
		// 내용은 자기에 맞게 변경해서 사용 하는것
		// **오버라이딩은 부모메소드가 숨겨진다.(은닉화, = 캡슐화)
		// **같은 메소드를 호출해도 다른내용을 실행한다.(다형성)
		Animal d = new Dog();
		Animal c = new Cat();

		System.out.println(d.eyes);
		System.out.println(d.legs);
		d.like();
		d.sound();
		System.out.println("==============");
		System.out.println(c.eyes);
		System.out.println(c.legs);
		c.like();
		c.sound();
		System.out.println("==============");

		Scanner sc = new Scanner(System.in);

		System.out.print("선택하세요 >> 1.고양이, 2.강아지");
		int su = sc.nextInt();
		
		/*
		if (su == 1) {
			Cat cat = new Cat();
			cat.sound();
			cat.like();
			cat.hobby();
		} else if (su == 2) {
			Dog dog = new Dog();
			dog.sound();
			dog.like();
			dog.hobby();
		}
		*/
		Animal a = null;
		if (su==1) {
			a = new Cat();
		}else if (su==2) {
			a = new Dog();
		}
		a.sound();// 부모,자식
		a.like();// 부모
		//a.hobby(); //자식이갖고있어서 사용못함
	}
}
