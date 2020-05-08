package com.ict.edu;

import javax.swing.SwingConstants;

public class Ex04 {

	public static void main(String[] args) {
		// switch ~ case : if���� ���� ���ǹ�
		// if���� ���ǽ��� boolean���̴�. ��, �񱳿���
		// ������, boolean�� ���
		// switch���� ���ڰ��� byte,short,int,char,String �϶� �����
		// switch(���ڰ�){
		// case ���ǰ�1 : ���ڰ��� ���ǰ�1�� ������ ������ ���� ; break;
		// case ���ǰ�2 : ���ڰ��� ���ǰ�2�� ������ ������ ���� ; break;
		// case ���ǰ�3 : ���ڰ��� ���ǰ�3�� ������ ������ ���� ; break;
		// default : ���ǰ� 1,2,3 ��� ���� ������ ������ ���� ;
		// }

		// char k1�� A�̸� ������ī,B�̸� �����,C�̸� ĳ����, ������ �ѱ�
		char k1 = 'B';
		String res = "";
		switch (k1) {
		case 'A':
			System.out.println("������ī");
			break;
		case 'B':
			System.out.println("�����");
			break;
		case 'C':
			System.out.println("ĳ����");
			break;
		default:
			System.out.println("�ѱ�");
		}
		char k2 = 'A';
		switch (k2) {
		case 'A':
			res = "������ī";
			break;
		case 'B':
			res = "�����";
			break;
		case 'C':
			res = "ĳ����";
			break;
		default:
			res = "�ѱ�";
			break;
		}
		System.out.println("��� :" + res);
		// break; �������� ���������� ��� ���๮�� ������
		// break ������ �������ϰ� �ִ� ������ ����� ����

		// char k3�� A,a�̸� ������ī, B,b�̸� �����, C,c�̸� ĳ����, ������ �ѱ�
		char k3 = 'A';
		res = "";
		switch (k3) {
		case 'A':
			res = "������ī";
			break;
		case 'a':
			res = "������ī";
			break;
		case 'B':
			res = "�����";
			break;
		case 'b':
			res = "�����";
			break;
		case 'C':
			res = "ĳ����";
			break;
		case 'c':
			res = "ĳ����";
			break;
		default:
			res = "�ѱ�";
			break;
		}
		System.out.println("��� :" + res);

		switch (k3) {
		case 'A':
		case 'a':
			res = "������ī";
			break;
		case 'B':
		case 'b':
			res = "�����";
			break;
		case 'C':
		case 'c':
			res = "ĳ����";
			break;
		default:
			res = "�ѱ�";
			break;
		}
		System.out.println("��� :" + res);

		// int k4�� 1 �Ǵ� 3�̸� ����,2 �� 4�̸� ����
		int k4 = 1;
		res = "";
		switch (k4) {
		case 1:
		case 3:
			res = "����";
			break;
		case 2:
		case 4:
			res = "����";
			break;
		default:
		}
		System.out.println("��� :" + res);

		// String k5�� �ѱ��̸� ����,�߱��̸� �ϰ�,�Ϻ��̸� ����,�̱��̸� ������
		String k5 = "�ѱ�";
		switch (k5) {
		case "�ѱ�":
			res = "����";
			break;
		case "�߱�":
			res = "�ϰ�";
			break;
		case "�Ϻ�":
			res = "����";
			break;
		case "�̱�":
			res = "������";
			break;
		}
		System.out.println("��� :" + res);

		// switch���� ������ �о����� �����������..(if�� �������)
		// int k6�� ������ 90�̻��̸� A,80�̻��̸� B,70�̻��̸�C, ������ F
		int k6 = 70;
		switch ((int) (k6 / 10)) {
		case 10:
		case 9:
			res = "A";
			break;
		case 8:
			res = "B";
			break;
		case 7:
			res = "C";
			break;
		default:
			res = "F";
			break;
		}
		System.out.println("��� :" + res);
	}

}
