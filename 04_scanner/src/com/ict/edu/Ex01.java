package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// java.lang ��Ű���ȿ� �����ϴ� Ŭ������ �ƹ��� ���� ���� ��밡��
		// �ٸ� ���� �����ϴ� Ŭ������ �ݵ��import�� �ؾ� ������ �����ʴ´�
		// import ���: �ش� Ŭ���� ���� �ڿ��� ctrl + space bar�� ������.
		// �Ǵ� ctrl + shift + o

		// Scanner Ŭ���� : Ű���� ������ �Է¹޾Ƽ� ó���ϴ� Ŭ����
		Scanner sc = new Scanner(System.in);

		System.out.print("����� �̸� : ");

		// �Է��ѳ����� String�ϰ�� ó���ϴ� ���
		String name = sc.next();
		System.out.println("�Է��� �̸� :" + name);

		// �Է��� ������ ����(����)�� ó�� �ϴ� ���

		System.out.print("����� ���� :");
		int age = sc.nextInt();
		System.out.println("�Է��� ����:" + age);

		// �Է��� ������ ����(�Ǽ�)�� ó�� �ϴ� ���

		System.out.print("����� Ű :");
		double tall = sc.nextDouble();
		System.out.println("�Է��� ����:" + tall);

		// �Է��� ������ boolean���� ó�� �ϴ� ���

		System.out.print("����� �����Դϱ�?(true/false)");
		boolean gender = sc.nextBoolean();
		if (gender) {
			System.out.println("����� �����Դϴ�.");
		} else {

			System.out.println("����� �����Դϴ�.");
		}
		// sc���� char ó���¾���.
		// ���߿� String ���� char ó���ϴ� ����� ����ؾ��Ѵ�.
	}

}
