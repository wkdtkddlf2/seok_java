package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// �ܼ� if : ���ǽ��� ���϶��� ����, �����϶��� if�� ����
		// ���ǽ� : boolean,�񱳿���,������
		// ���� : if(���ǽ�){
		// ���ǽ��� ���϶� ���๮��;
		// ���ǽ��� ���϶� ���๮��;
		// }
		// ��, ���๮���� ���� �϶��� { } ���� ����

		// int k1 �� 60 �̻��̸� �հ�,
		int k1 = 60;
		String str = "�ʱⰪ";
		if (k1 >= 60) {
			str = "�հ�";
		}
		System.out.println("��� :" + str);
		System.out.println("�����ϼ̽��ϴ�.");

		// int k2 �� 60 �̻��̸� �հ�,60�̸��̸� ���հ�
		int k2 = 59;
		str = "�ʱⰪ";
		if (k2 >= 60) {
			str = "�հ�";

		}
		if (k2 < 60) {
			str = "���հ�";
		}
		System.out.println("��� :" + str);

		// int k3 �� 60 �̻��̸� �հ�,60�̸��̸� ���հ�
		int k3 = 60;
		str = "���հ�";
		if (k3 >= 60) {
			str = "�հ�";
		}

		System.out.println("��� :" + str);

		// Ȧ�� ¦�� �Ǻ�
		int k4 = 7;
		str = "Ȧ��";
		if (k4 % 2 == 0) {
			str = "¦��";
		}
		System.out.println("��� :" + str);

		// �빮��, �ҹ��� �Ǻ�
		char k5 = 'G';
		str = "�ҹ���";
		if (k5 >= 'A' && k5 <= 'Z') {
			str = "�빮��";
		}
		System.out.println("��� :" + str);

		// 1 �Ǵ� 3 �̸� ����, �ƴϸ� ����
		int k6 = 1;
		str = "����";
		if (k6 == 1 || k6 == 3) {
			str = "����";
		}
		System.out.println("��� :" + str);

		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°� ?
		int time = 10;
		int dan = 8590;
		int pay = time * dan;

		if (time > 8) {
			pay = (8 * dan) + (int) ((time - 8) * dan * 1.5);
		}
		System.out.println("��� :" + pay);

		// �� �� �� ū ���� ����Ͻÿ�.
		int k7 = 10;
		int k8 = 15;

		int result = k8;
		if (k7 > k8) {
			result = k7;
		}
		System.out.println("��� :" + result);

	}
}
