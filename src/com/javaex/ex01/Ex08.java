package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		//산술연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //나눴을때 몫만 나옴 정수/정수 이기때문에
		System.out.println(a%b); //나눴을때 나머지만 나옴
		
		//산술연산자 / % 자세히
		
		System.out.println("산술연산자 / % 자세히");
		System.out.println("==================");
		System.out.println(7/2); 				// 3
		System.out.println(7.0/2.0); 			// 3.5
		System.out.println(7%2);				// 1
		System.out.println(7.0%2.0);			// 1.0
		System.out.println("==================");
		
		//부호 연산자
		int var = -3;
		int pVar = +var;
		int mVAr = -var;
		System.out.println(pVar);
		System.out.println(mVAr);
		
		//증감 연산자
		System.out.println("증감연산자");
		System.out.println(a); 		//7
		System.out.println(++a);	//7-->8
		System.out.println(a);		//8 출력만 8이아니라 ㄹㅇ바뀜;;
		
		
		System.out.println(b);		//2
		System.out.println(--b);	//2-->1
		System.out.println(b);		//1 얘도 바뀜 ;; 
		
		System.out.println(a);		//8
		System.out.println(a++);	//8
		System.out.println(a);		//9
		System.out.println(a++);	//9
		System.out.println(++a);	//11
		System.out.println(a);		//11
		
		System.out.println("===============");
		
		System.out.println(b);		//1
		System.out.println(b--);	//1
		System.out.println(b);		//0
			
		;
		
		
		
	}
	
}
