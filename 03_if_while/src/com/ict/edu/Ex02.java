package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~else ~ : ���ǽ��� ���϶��� �����϶� ���������� ó���Ѵ�.
		// ���� : if(���ǽ�){
		// ���ǽ��� ���϶� ���� ����;
		// ���ǽ��� ���϶� ���� ����;
		// }
		// else{
		// ���ǽ��� �����϶� ���� ����;
		// ���ǽ��� �����϶� ���� ����;
		// }

		// int k1 �� 60 �̻��̸� �հ�,������ ���հ�
		int k1 = 78;
		String str = "";
		if (k1 > 60) {
			str = "�հ�";
		} else {
			str = "���հ�";
		}
		System.out.println("��� :" + str);

		// Ȧ�� ¦�� �Ǻ�
		int k2 = 42;
		str = "";
		if (k2 % 2 == 0) {
			str = "¦��";
		} else {
			str = "Ȧ��";
		}
		System.out.println("��� :" + str);

		// �빮��, �ҹ��� �Ǻ�
		char k3 = 'q';
		str = "";
		if (k3 >= 'a' && k3 <= 'z') {
			str = "�ҹ���";
		} else {
			str = "�빮��";
		}
		System.out.println("��� :" + str);

		// 1 �Ǵ� 3 �̸� ����, �ƴϸ� ����
		int k4 = 2;
		str = "";
		if (k4 == 1 || k4 == 3) {
			str = "����";
		} else {
			str = "����";
		}
		System.out.println("��� :" + str);

		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 7�̴�.
		// �󸶸� �޾ƾ� �ϴ°� ?
		int time = 7;
		int dan = 8590;
		int pay = 0;
		if (time > 8) {
			pay = (8 * dan) + (int) ((time - 8) * dan * 1.5);
		} else {
			pay = time * dan;
		}
		System.out.println("��� :" + pay);

		// �� �� �� ū ���� ����Ͻÿ�.
		int k5 = 42;
		int k6 = 32;

		int result = 0;
		if (k5 > k6) {
			result = k5;
		} else {
			result = k6;
		}
		System.out.println("��� :" + result);

	}
}
