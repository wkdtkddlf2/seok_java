package com.ict.edu;

public class Ex09 {

	public static void main(String[] args) {
		// do ~ while �� : while���� ���� �ݺ���
		// �ʱ��;
		// do{
		// ���๮;
		// ������;
		// }while(���ǽ�);

		// 0-10 ���� ���
		int k1 = 0;
		do {
			System.out.println(k1 + " ");
			k1++;
		} while (k1 < 11);
		System.out.println();
		
		// 0-10 ¦���� ���
		int k2 = 0;
		do {
			if (k2 % 2 == 0) {
				System.out.println(k2 + " ");
			}
			k2++;
		} while (k2 < 11);
		System.out.println();
		
		
		
		
		// 0-10 ������
		int k3 = 0;
		int sum = 0;  //���������� ����ų����
		do {
			sum = sum + k3;
			k3++;
		} while (k3<11);
		System.out.println("������ :" + sum);
		
		// 5�� ���
		int k4 = 1;
		do {
			System.out.println("5*" + k4 + " = " + (5 * k4));
			k4++;
		} while (k4 < 10);
			System.out.println();
		
		
		
		
		
		
		
		
		
		
	}

}
