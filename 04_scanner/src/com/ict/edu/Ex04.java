package com.ict.edu;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;	//��üȽ��  count;
		int even = 0;	//¦�� count;
		
		while (true) {
			 total += 1;
			System.out.print("�����Է� :");
			int k = sc.nextInt();
			String str = "";
			if (k % 2 == 0) {
				even +=1;
				str = "¦��";
			} else {
				str = "Ȧ��";
			}
			System.out.println(k + "��" + str + "�Դϴ�.");
			System.out.print("��� �ұ��?(1.yes,2.no)>>");
			
			int k2 = sc.nextInt();
			if (k2 == 2)
				break;
		
		}
		System.out.println("��ü Ƚ�� :" + total + "¦����Ƚ�� :" + even);
		System.out.println("�����ϼ̽��ϴ�.");
		
	}
}