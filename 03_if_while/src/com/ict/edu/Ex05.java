package com.ict.edu;

public class Ex05 {

	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		// for(초기식; 조건식; 증감식){
		// 조건식이 참일때 실행할문장 ;
		// }
		// for문은 무조건 초기식부터 시작한다. 조건식으로 이동
		// 조건식은 boolean형(boolean, 비교연산, 논리연산)
		// 조건식이 참이면 for문 안쪽 블록을 실행한다.
		// 조건식이 거짓이면 for문을 실행하지않는다.
		// for문의 끝을 만나면 무조건 증감식으로간다.
		// 증감식은 초기식을 증가하거나 감소시키는 역할을 하고
		// 다시 조건식으로 간다.

		// 자바에서는 if문,switch문,for문 안에서 만든 변수는
		// 밖에서 사용할수 없다.

		// 안녕하세요 열번 출력하기
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "= hello");
		}
		System.out.println("===============================");

		// 0 - 10 까지출력하기
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}

		// 0- 10까지 짝수만 출력하기
		for (int i = 0; i < 11; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("===============================");
		for (int i = 0; i < 11; i = i + 2) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("===============================");
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		// 0 -50 까지 7의배수
		for (int i = 0; i < 51; i++) {
			if (i % 7 == 0) {
				// 출력후 한줄 띄우기
				System.out.println(i);
			}
		}
		// a ~ g
		for (char i = 'a'; i <= 'g'; i++) {
			// 옆으로 출력하기,\t는 tab을 의미
			System.out.print(i + "\t");
		}
		System.out.print("\n가나다라");
		// 한줄 띄우기
		System.out.println();
		// 존재하지않는메소드
		// System.out.print();

		// System.out.println(); : 줄바꾸기
		// System.out.print(); : 존재하지않음
		// System.out.println(변수나 데이터); : 출력후 줄바꾸기
		// System.out.print(변수나 데이터); :옆으로 출력하기

		// 5 단출력
		for (int i = 1; i < 10; i++) {
			System.out.println("5 *" + i + "=" + (5 * i));
		}
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 1; i < 5; i++) {
			System.out.println("0 0 0 0");

		}
		System.out.println();

		for (int i = 1; i < 17; i++) {
			System.out.print("0");
			if (i % 4 == 0) {
				System.out.println();
			}
		}

		// 0-10의 합계
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("합계 :" + sum);

		// 0-10홀수의 합계,
		int odd = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			}
		}
		System.out.println("홀수의 합 :" + odd);

		// 0-10 짝수의합계
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			}
		}
		System.out.println("짝수의 합:" + even);

		// 0-10 홀수, 짝수의 합계
		odd = 0;
		even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("짝수의 합 :" + even);
		System.out.println("홀수의 합 :" + odd);

		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		sum = 1;
		for (int i = 7; i > 0; i--) {
			sum = sum * i;
		}
		System.out.println("7 !" + sum);

	}
}











