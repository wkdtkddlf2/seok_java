package com.ict.edu;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// ���ڸ� �޾Ƽ� Ȧ��,¦���� ��������
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� :");
		int su = sc.nextInt();
		String result = "";
		if (su % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		System.out.println("��� :" + result);

		// ���� �Է��ϸ� ������ ��µǰ�����
		// 1.�ѱ�=����, 2.�߱�=����¡ 3.�Ϻ�=���� �������� �����;���
		System.out.print("�����Է� :1.�ѱ�=����,2.�߱�=����¡3.�Ϻ�=���� >>");
		int num = sc.nextInt();
		result = "";
		if (num == 1) {
			result = "����";
		} else if (num == 2) {
			result = "����¡";
		} else if (num == 3) {
			result = "����";
		} else {
			result = "������ ����";
		}
		System.out.println("��� :" + result);

		System.out.println("�����Է� : �ѱ�, �߱�, �Ϻ� >>");
		String country = sc.next();
		switch (country) {
		case "�ѱ�":
			result = "����";
			break;
		case "�߱�":
			result = "����¡";
			break;
		case "�Ϻ�":
			result = "����";
			break;
		default:
			result = "������ ����";
			break;
		}
		System.out.println("��� :" + result);
		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// �ٹ��ð��� �Է��ؼ� �˹ٱݾ��� ��������
		System.out.print("�˹ٽð� :");
		int time = sc.nextInt();
		int dan = 8590;
		int pay = 0;
		if (time > 8) {
			pay = (8 * dan) + (int) ((time - 8) * dan * 1.5);
		} else {
			pay = time * dan;
		}
		System.out.println("�˹ٱݾ� :" + pay);

		// menu�� 1 �̸� ī���ī 3500, 2�̸� ī��� 4000,3�̸� �Ƹ޸�ī��3000
		// 4�̸� �����ֽ� 3500�̴�. ģ����2�� 10000���� �Ծ���.
		// �޴��� �� ����� �ܵ������ (��, �ΰ��� 10% ����)
		System.out.print("�޴����� :\n1.ī���ī(3500)\n2.ī���(4000)" + "\n3.�Ƹ޸�ī��(3000)\n4.�����ֽ�(3500) >>");
		int menu = sc.nextInt();
		dan = 0;
		String drink = "";
		su = 2;
		int total = dan * su;
		int vat = 0;
		int input = 10000;
		int output = 0;
		if (menu == 1) {
			dan = 3500;
			drink = "ī���ī";
		} else if (menu == 2) {
			dan = 4000;
			drink = "ī���";
		} else if (menu == 3) {
			dan = 3000;
			drink = "�Ƹ޸�ī��";
		} else if (menu == 4) {
			dan = 3500;
			drink = "�����ֽ�";
		}
		total = dan * su;
		vat = (int) (total * 0.1);
		output = input - (total + vat);
		System.out.println("�ܵ� :" + output);

	}
}