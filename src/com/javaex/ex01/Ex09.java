package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//관계연산자
		int n1 = 5;
		int n2 = 3;
		
		System.out.println(n1<n2); //5<3 false
		System.out.println(n1>n2); //5>3 true
		
		System.out.println(n1<=n2); // 5<=3 false
		System.out.println(n1>=n2);	// 5>=3 true
		
		System.out.println(n1==n2); // 5==3 false = 하나만 붙이면 넘어감
		System.out.println(n1!=n2); // 5!=3 5와 3이 같지않니?라고 질문 ! (부정 반대)
		
		boolean result = n1<n2;
		System.out.println(result);
		
		
	}
	
}
