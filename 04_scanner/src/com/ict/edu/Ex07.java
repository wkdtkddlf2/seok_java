package com.ict.edu;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		int dan =0;
		String drink ="";
		int  su= 3;
		int vat =0;
		int total = dan + vat;
		int input = 20000;
		int output =0;
		if (menu == 1) {
			dan = 3500;
			drink = "Ŀ������";
		} else if (menu == 2) {
			dan = 2500;
			drink = "�̿�����";
		} else if (menu == 3) {
			dan = 1500;
			drink = "��";
		} else if (menu == 4) {
			dan = 4000;
			drink = "�����ֽ�";
		}
		total = dan * su;
		vat = (int) (total * 0.1);
		output = input - (total + vat);
		System.out.println("�ܵ� :" + output);
		
		
		
		
	}
}