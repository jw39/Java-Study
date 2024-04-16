package 산술연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0320 +-*/ 입력받은 수에서 소수점 신경써서 출력하는 문제
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 문자 입력받기
//		String name = sc.next();		
//		// 3. 입력받은 문자 출력문
//		System.out.println("입력받은 글자는 >> " + name);
//		
//		
//		// 숫자 입력문 작성
//		System.out.print("숫자를 입력하세요 >> ");
//		// 정수형 숫자 입력받기
//		int num1 = sc.nextInt();
		
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2= sc.nextInt();
		
		System.out.println("더한 결과 값: " + (num1 + num2));
		System.out.println("뺀 결과 값: " + (num1 - num2));
		System.out.println("곱한 결과 값: " + (num1 * num2));
		System.out.println("나눈 결과 값: " + ((double)num1 / num2));
		
		sc.close();
		

		
//		System.out.print("첫번째 정수 입력: ");
//		double num1 = sc.nextDouble();
//		System.out.print("두번째 정수 입력: ");
//		double num2= sc.nextDouble();
//		
//		System.out.println("더한 결과 값: " + (int)(num1 + num2));
//		System.out.println("뺀 결과 값: " + (int)(num1 - num2));
//		System.out.println("곱한 결과값: " + (int)(num1 * num2));
//		System.out.println("나눈 결과값: " + ((num1 / num2)));

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
