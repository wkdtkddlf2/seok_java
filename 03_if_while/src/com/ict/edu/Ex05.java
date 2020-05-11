package com.ict.edu;

public class Ex05 {

	public static void main(String[] args) {
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		// for(�ʱ��; ���ǽ�; ������){
		// ���ǽ��� ���϶� �����ҹ��� ;
		// }
		// for���� ������ �ʱ�ĺ��� �����Ѵ�. ���ǽ����� �̵�
		// ���ǽ��� boolean��(boolean, �񱳿���, ������)
		// ���ǽ��� ���̸� for�� ���� ����� �����Ѵ�.
		// ���ǽ��� �����̸� for���� ���������ʴ´�.
		// for���� ���� ������ ������ ���������ΰ���.
		// �������� �ʱ���� �����ϰų� ���ҽ�Ű�� ������ �ϰ�
		// �ٽ� ���ǽ����� ����.

		// �ڹٿ����� if��,switch��,for�� �ȿ��� ���� ������
		// �ۿ��� ����Ҽ� ����.

		// �ȳ��ϼ��� ���� ����ϱ�
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "= hello");
		}
		System.out.println("===============================");

		// 0 - 10 ��������ϱ�
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}

		// 0- 10���� ¦���� ����ϱ�
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
		// 0 -50 ���� 7�ǹ��
		for (int i = 0; i < 51; i++) {
			if (i % 7 == 0) {
				// ����� ���� ����
				System.out.println(i);
			}
		}
		// a ~ g
		for (char i = 'a'; i <= 'g'; i++) {
			// ������ ����ϱ�,\t�� tab�� �ǹ�
			System.out.print(i + "\t");
		}
		System.out.print("\n�����ٶ�");
		// ���� ����
		System.out.println();
		// ���������ʴ¸޼ҵ�
		// System.out.print();

		// System.out.println(); : �ٹٲٱ�
		// System.out.print(); : ������������
		// System.out.println(������ ������); : ����� �ٹٲٱ�
		// System.out.print(������ ������); :������ ����ϱ�

		// 5 �����
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

		// 0-10�� �հ�
		int sum = 0;
		for (int i = 0; i < 11; i++) {

			sum = sum + i;
		}

		System.out.println("�հ� :" + sum);

		// 0-10Ȧ���� �հ�,
		int odd = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			}
		}
		System.out.println("Ȧ���� �� :" + odd);

		// 0-10 ¦�����հ�
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			}
		}
		System.out.println("¦���� ��:" + even);

		// 0-10 Ȧ��, ¦���� �հ�
		odd = 0;
		even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("¦���� �� :" + even);
		System.out.println("Ȧ���� �� :" + odd);

		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		sum = 1;
		for (int i = 7; i > 0; i--) {
			sum = sum * i;
		}
		System.out.println("7 !" + sum);

	}
}
