package com.ict.edu;

public class Ex07 {

	public static void main(String[] args) {
		// while �� : for ���� ���� �ݺ���
		// ���� :
		// �ʱ��
		// while(���ǽ�){
		// ���ǽ��� ���϶� ���� ;
		// ������
		// }
		// while�� ���� ������ ������ ���ǽ����ΰ���

		// ����2:
		// while(true){
		// if(������������) break;
		// ���ǽ��� ���϶� ����;
		// ������;
		// }
		// while�� ���� ������ ������ ���ǽ����� ����

		// 0-10 ���� ���
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

		// 0- 10���� ¦���� ����ϱ�
		int k3 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 0) {
				System.out.println(k3 + " ");
			}
			k3++;
		}
		System.out.println();

		// 0- 10���� Ȧ���� ����ϱ�
		int k4 = 0;
		while (k4 < 11) {
			if (k4 % 2 == 1) {
				System.out.println(k4 + " ");
			}
			k4++;
		}
		System.out.println();

		// 0 -50 ���� 7�ǹ�� ����ϱ�
		int k5 = 0;
		while (k5 < 51) {
			if (k5 % 7 == 0) {
				System.out.println(k5 + " ");
			}
			k5++;
		}
		System.out.println();
		// a ~ g ���� �߷�
		char k6 = 'a';
		while (k6 < 'h') {
			System.out.println(k6 + " ");
			k6++;
		}
		System.out.println();
		// 5�����
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

		// 0-10������
		int res = 0;
		for (int i = 0; i < 11; i++) {

			res = res + i;

		}
		System.out.println("������ :" + res);

		// 0-10 Ȧ���� �հ�
		int odd = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			}

		}
		System.out.println("Ȧ���� :" + odd);

		// 0-10 ¦���� �հ�
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			}
		}
		System.out.println("¦���� :" + even);

		// 0-10 Ȧ��, ¦���� �հ�
		odd = 0;
		even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			} else {
				even = even + i;
			}
		}
		System.out.println("Ȧ���� �� :" + odd);
		System.out.println("¦���� �� :" + even);

		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		res = 1;
		for (int i = 7; i > 0; i--) {
			res = res * i;
		}
		System.out.println("7 !" + res);

	}

}
