package com.ict.edu;

public class Ex08 {

	public static void main(String[] args) {
		// ��ø while�� : while�� �ȿ� while��
		// ���� for���� ����.
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i =" + i + ", j=" + j);
			}

		}
		System.out.println("========================");

		int k1 = 1;
		while (k1 < 4) {
			int g1 = 1;
			while (g1 < 6) {
				System.out.println("k1 =" + k1 + ",g1 =" + g1);
				g1++;
			}
			k1++;

		}
		// ������
		int k2 = 2;
		while (k2 < 10) {
			System.out.println(k2 + "��");
			int g2 = 1;
			while (g2 < 10) {
				System.out.println(k2 + "*" + g2 + "=" + (k2 * g2));
				g2++;

			}
			k2++;
		}

	}

}
