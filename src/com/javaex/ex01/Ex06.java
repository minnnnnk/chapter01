package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		
		//자동형변환
		System.out.println(2+3.5);
		
		double var01 = 2+3.5; // 2--> 2.0 으로 자동 형변환
 		System.out.println(var01);
 		
 		//자동 형변환2
 		long var02 = 12345L;
 		float var03 = 1.1F;
 		
 		System.out.println(var02+var03);
 		
 		
 		float result = var02 + var03; //var02(12345L) --> 12345.0f
 		System.out.println(result);
 		////////////////////////////
 		
 		
 		///강제형변환
 		float var04 = 1111.2345f;
 		int var05 = (int)var04;
 		
 		System.out.println(var05);
 		
 		//축소변환 정상 (int --> byte)
 		
 		int v01 = 10;
 		byte v02 = (byte)v01;
 		System.out.println(v02);
 		
 		//축소변환 비정상 (int --> byte)
 		
 		int v03 = 203029770;
 		byte v04 = (byte)v03;
 		System.out.println(v04);
 		
 		//확대변환 (byte -->int)
 		
 		byte v05 = 125;
 		int v06 = (int)v05;
 		System.out.println(v06);
 		
 		int v07 = 50000;
 		long v08 = (long)v07;
 		System.out.println(v08);
 		
 		//실수 -> 정수 강제형변환 정수만남음 5.5 -> 5
 		double v09 = 5.57;
 		int v10 = (int)v09;
 		System.out.println(v10);
 		
 		//정수 -> 실수 강제형변환 실수형으로 보여줌 5 -> 5.0
 		
 		int v11 = 8;
 		double v12 = (double)v11;
 		System.out.println(v12);
 		
 		//sysout clrt+space System.out.println("이거지린다");
 		
 		
 		
 		
	}
}
