package com.ict.edu;

public class Ex07 {

	public static void main(String[] args) {
		// while 문 : for 문과 같은 반복문
		// 형식 :
		// 초기식
		// while(조건식){
		// 조건식이 참일때 실행 ;
		// 증감식
		// }
		// while문 끝을 만나면 무조건 조건식으로가라

		// 형식2:
		// while(true){
		// if(빠져나갈조건) break;
		// 조건식이 참일때 실행;
		// 증감식;
		// }
		// while문 끝을 만나면 무조건 조건식으로 가라

		// 0-10 까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println();

		int k1 = 0;
		while (k1 < 11) {
			System.out.println(k1 + " ");
			k1++;
		}
		System.out.println();

		int k2 = 0;
		while (true) {
			if (k2 >= 11)
				break;
			System.out.println(k2 + " ");
			k2++;

		}
		System.out.println();

		// 0- 10까지 짝수만 출력하기
		int k3 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 0) {
				System.out.println(k3 + " ");
			}
			k3++;
		}
		System.out.println();

		// 0- 10까지 홀수만 출력하기
		int k4 = 0;
		while (k4 < 11) {
			if (k4 % 2 == 1) {
				System.out.println(k4 + " ");
			}
			k4++;
		}
		System.out.println();

		// 0 -50 까지 7의배수 출력하기
		int k5 = 0;
		while (k5 < 51) {
			if (k5 % 7 == 0) {
				System.out.println(k5 + " ");
			}
			k5++;
		}
		System.out.println();
		// a ~ g 까지 추력
		char k6 = 'a';
		while (k6 < 'h') {
			System.out.println(k6 + " ");
			k6++;
		}
		System.out.println();
		// 5단출력
		int k7 = 1;
		while (k7 < 10) {
			System.out.println("5*" + k7 + " = " + (5 * k7));
			k7++;
		}
		System.out.println();
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		int k8 = 1;
		while (k8 < 5) {
			System.out.println("0 0 0 0");
			k8++;
		}
		System.out.println();

		int k9 = 1;
		while (k9 < 17) {
			System.out.print("0 ");
			if (k9 % 4 == 0) {
				System.out.println();
			}
			k9++;
		}

		// 0-10누적합
		int res = 0;
		for (int i = 0; i < 11; i++) {

			res = res + i;

		}
		System.out.println("누적합 :" + res);

		// 0-10 홀수의 합계
		int odd = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			}

		}
		System.out.println("홀수합 :" + odd);

		// 0-10 짝수의 합계
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			}
		}
		System.out.println("짝수합 :" + even);

		// 0-10 홀수, 짝수의 합계
		odd = 0;
		even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			} else {
				even = even + i;
			}
		}
		System.out.println("홀수의 합 :" + odd);
		System.out.println("짝수의 합 :" + even);

		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		res = 1;
		for (int i = 7; i > 0; i--) {
			res = res * i;
		}
		System.out.println("7 !" + res);

	}

}
