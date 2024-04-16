package swith문;

import java.util.Scanner;

public class Ex03계절계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0322 switch문
		
		
		//1. 숫자를 입력받아 해당 계절 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("월(1~12) 입력: ");
		int mon = sc.nextInt();
		
		switch(mon){
		
		case 1,2,12:
			System.out.println(mon + "월은 겨울입니다");
			break;
			
		case 3,4,5:
			System.out.println(mon +"월은 봄입니다");
			break;
			
		case 6,7,8:
			System.out.println(mon +"월은 여름입니다");
			break;
			
		case 9,10,11:
			System.out.println(mon +"월은 가을입니다");
			break;
		}
		
		sc.close();

	}

}
