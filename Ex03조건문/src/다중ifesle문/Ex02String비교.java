package 다중ifesle문;

import java.util.Scanner;

public class Ex02String비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0322 다중ifelse
		
		//1. String 알파벳 입력 후 입력한 문자 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 입력 >> ");
		String input = sc.next();
		
		//비교연산자 ( ==, !=) => 기본 타입 (primitive Type)일 때만 적용
		// boolean, char, byte, short, int, long, flaot, double
		
											//만약 내가 입력받은 문자가 'A'가 맞아? 를 물어보고 싶을 때 input == A가 아니라
		if(input.equals("A")) {			//string는 기본 타입이 아니라 비교를 하려면 .equals 사용해야함
			System.out.println("A입력");
		}else if(input.equals("B")) {
			System.out.println("B입력");
		}else{
			System.out.println("A,B 외 입력");
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();
		

		
		

	}

}
