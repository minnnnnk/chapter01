package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		int i =1;
		
		while (true) {//탈출 조건
			if (i%6==0 && i%14==0) {
				System.out.println(i);//if문이 true
				break;
			}
			i++; //break 가 있어서 else 를 안써줘도 됨
		}
	}

}
