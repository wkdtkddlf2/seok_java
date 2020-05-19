package com.ict.edu3;

public class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void print() {
		super.print();
		System.out.println("과목 :" + subject);
	}
}
