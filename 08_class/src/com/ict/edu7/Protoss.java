package com.ict.edu7;

// Unit 추상클래스이기 때문에
// 일반 클래스인 Protoss는 반드시 오버라이딩해야한다.

public class Protoss extends Unit{
	String name;
	int energy;
	boolean fly;
	
	
	public Protoss() {}
	
	
	
	public Protoss(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy = energy - 2 ;
		
	}
}
