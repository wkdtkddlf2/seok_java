package com.ict.edu;

public class Ex12 {
	public static void main(String[] args) {
		// break label �� continue label
		// break label : ���̺��� ������ ����� Ż��
		// continue label : ���̺��� ������ ��� ���๮�� �����ϰ� ���� ȸ���� ����
		// label ���� ��� '���̺��̸�:' �ڳ� �ؿ��� �ݺ����� �� �� �ִ�.

		// 1-10���� ���
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// i�� 6�϶� break ����ϱ�
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				break;
			System.out.print(i + " ");
		}
		System.out.println();

		// i�� 6�϶� break label ����ϱ�
		// for���� �ϳ��϶��� break �� break label�� ���� ����� ����.
		// �׷��Ƿ� for�� �ϳ��϶��� break label�� ����� �ʿ䰡 ����.
		// continue���� �������� �̴�.
		esc: for (int i = 1; i < 11; i++) {
			if (i == 6)
				break esc;
			System.out.print(i + " ");
		}
		System.out.println();

		// i�� 6�϶� continue ����ϱ�
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

		// i�� 6�϶� continue label ����ϱ�
		esc2: for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue esc2;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("========================");

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("========================");

		// j=3�� �� break
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)
					break;
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("========================");

		// j=3�� �� break label
		esc3: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)
					break esc3;
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("========================");

		// j=3�� �� continue
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)
					continue;
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("========================");

		// j=3�� �� continue label
		esc4: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)
					continue esc4;
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("========================");
	}
}
