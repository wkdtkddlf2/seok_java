package com.ict.edu;

public class Ex09 {

	public static void main(String[] args) {
		// do ~ while 문 : while문과 같은 반복문
		// 초기식;
		// do{
		// 실행문;
		// 증감식;
		// }while(조건식);

		// 0-10 까지 출력
		int k1 = 0;
		do {
			System.out.println(k1 + " ");
			k1++;
		} while (k1 < 11);
		System.out.println();
		
		// 0-10 짝수만 출력
		int k2 = 0;
		do {
			if (k2 % 2 == 0) {
				System.out.println(k2 + " ");
			}
			k2++;
		} while (k2 < 11);
		System.out.println();
		
		
		
		
		// 0-10 누적합
		int k3 = 0;
		int sum = 0;  //이전값들을 기억시킬변수
		do {
			sum = sum + k3;
			k3++;
		} while (k3<11);
		System.out.println("누적합 :" + sum);
		
		// 5단 출력
		int k4 = 1;
		do {
			System.out.println("5*" + k4 + " = " + (5 * k4));
			k4++;
		} while (k4 < 10);
			System.out.println();
		
		
		System.out.println("==================");
		
		
		
		
		
		
		
	}

}
