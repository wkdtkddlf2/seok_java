package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[]  rank = {1,1,1,1,1};
		
		// 입력
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			
			System.out.print("국어점수 : ");
			kor[i] = sc.nextInt();
			
			System.out.print("영어점수 : ");
			eng[i] = sc.nextInt();
			
			System.out.print("수학점수 : ");
			math[i] = sc.nextInt();
		}
		
		// 총점,평균,학점
		for (int i = 0; i < rank.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0 ;
			if(avg[i] >= 90 ) {
				hak[i] = "A 학점";
			}else if(avg[i] >= 80) {
				hak[i] = "B 학점";
			}else if(avg[i] >= 70) {
				hak[i] = "C 학점";
			}else {
				hak[i] = "F 학점";
			}
		}
		
		// 순위
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]);
		}
		
	}
}







