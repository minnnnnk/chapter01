package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		int [] leftArray = new int[] {10,20,30} ;
		int [] rightArray = new int[] {10,30,30};
		int i= 0;
		
		if  (leftArray.length == rightArray.length) { // 두 배열의 개수가 같니?
			//같으면 세부 검사
			//아니면 다르고 몇번째가 다른지 써야됨
			
			 for (i= 0; i<leftArray.length; i++) {
				 if (leftArray[i] != rightArray[i]) {
					 System.out.println(i+"번째 방이 다릅니다.");
				 }
			 }
		} else {
			System.out.println("두배열의 크기가 다릅니다");
			
			
			/*for (i = 0; i<rightArray.length; i++) { 이건 개수
				if(leftArray.length != rightArray.length) {
				}
				
			}	
			System.out.println(i+"번째 크기가 다릅니다");
			*/
		} 
		 
	}

}
