package swith문;

import java.util.Scanner;

public class Ex02언어계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0322 switch문
		
		//1. 나라 당 해당 나라 언어 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		String lan = sc.next();
		
		switch(lan){
		
		case "한국어":
			System.out.println("안녕하세요");
			break;
		
		case "영어":
			System.out.println("헬로");
			break;
		
		case "중국어":
			System.out.println("니하오");
			break;
		
		case "일본어":
			System.out.println("곤니찌와");
			break;
		default:
			System.out.println("다른 값 입력");
			
		}
		
		sc.close();
		

	}

}
