package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int num = sc.nextInt();
		 
		/*
		 if(90<=num) { 
		 	System.out.println("A등급"); 
		 	} else if (80<=num){
		 	90이상인 값은 못내려옴
		 	System.out.println("B등급"); 
		 	} else if (70<=num){ 
		 	80이상인 값은 못내려옴
		 	System.out.println("C등급"); 
		 	} else if (60<=num) {
		 	 System.out.println("D등급");
		 	  } else {
		 	System.out.println("F등급"); 
		 	}
		 */
		if(num>=90) {
			System.out.println("A등급");
		} else if (90>num && num>=80) {
			System.out.println("B등급");
		} else if (80>num && num>=70) {
			System.out.println("C등급");
		} else if (70>num && num>=60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
			
		sc.close();
	}	

}
