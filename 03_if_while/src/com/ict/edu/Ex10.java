package com.ict.edu;

public class Ex10 {

	public static void main(String[] args) {
		// break �� continue
		// break : ���� ��ġ�� ������ Ż���Ҷ���� (�����)
		// continue : continue�� ���� ���๮�� �����ϰ� ����ȸ���� �����ϴ� �����
		// continue�� ���� ���๮�� �����ϰ� �ٷ� ���������ΰ���.
		// break , continue �Ѵ� ���� if ���� �Բ� ���ȴ�.

		// 1-10 ���� ���
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// i�� 6�϶� break;
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				break;
			{
			}
			System.out.print(i + " ");
		}
		System.out.println();

		// i�� 6�϶� continue;
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue;
			{
			}
			System.out.print(i + " ");
		}
		System.out.println();

		// 0 -10 ¦�����
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// ¦���� ������ڴ� ���� Ȧ���� ������� ����
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1)
				continue;
			{
			}
			System.out.print(i + " ");
		}
		System.out.println();

	}

}