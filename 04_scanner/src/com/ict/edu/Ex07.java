package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// �Աݾװ� �޴��� �Է¹ް�
		// �޴� : 1.Ŀ������(3500), 2.�̿�����(2500), 3.��(1500) 4.�����꽺(4000)
		// ������ ����, �Աݾ�, �ܵ� ��� (�ΰ��� 10%����)
		Scanner sc = new Scanner(System.in);
		esc: while (true) {
			// ���� �Է�
			System.out.print("�Աݾ� : ");
			int input = sc.nextInt();

			System.out.print("�޴��� �����ϼ���\n1.Ŀ������(3500)\n2.�̿�����(2500)" + "\n3.��(1500)\n4.�����꽺(4000) >> ");
			int menu = sc.nextInt();

			// ���� ����
			String drink = "";
			int dan = 0;
			int su = 1;
			switch (menu) {
			case 1:
				drink = "Ŀ������";
				dan = 3500;
				break;
			case 2:
				drink = "�̿�����";
				dan = 2500;
				break;
			case 3:
				drink = "��";
				dan = 1500;
				break;
			case 4:
				drink = "�����꽺";
				dan = 4000;
				break;
			}
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int output = input - (total + vat);

			// ���� ���
			System.out.println("������ ���� : " + drink);
			System.out.println("�Աݾ� : " + input);
			System.out.println("��  �� : " + output);

			while (true) {
				System.out.print("����ұ��(1.��/2.�ƴϿ�) >> ");
				int answer = sc.nextInt();
				if (answer == 1) {
					continue esc;
				} else if (answer == 2) {
					break esc;
				} else {
					System.out.println("����� �Է��ϼ���");
					continue;
				}
			}
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
