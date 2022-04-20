package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3]; // 배열 선언 A
		
		//값 대입
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
			
		
		int[] arrB = new int[3]; //배열 선언 B
		
		
		/* 이걸 포문으로
		arrB[0] = arrA[0];
		arrB[1] = arrA[1];
		arrB[2] = arrA[2];
		*/
		
		
		
		for (int i = 0; i<arrA.length; i++) {
			arrB[i]=arrA[i]; // A의 값을 복사
		}
		
		//배열 A출력
		for (int i = 0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		} 
		
		System.out.println("=======================");
		//배열 B출력
		for (int i = 0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
 			
		System.out.println("======================");
		System.out.println("arrA[1] 100으로 변경"); //arrA[1]값만 변경된거 확인
		
		arrA[1] = 100;	
		
		//배열 A출력
		for (int i = 0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		} 
				
		System.out.println("=======================");
		//배열 B출력
		for (int i = 0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}

}
