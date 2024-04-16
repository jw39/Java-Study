package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 삼항연산자예제
		
		//1. 정수를 입력받아 홀수인지 짝수인지 판별하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		String result = (num%2 == 0)?"짝수":"홀수";
		System.out.print(num + "는(은) " + result + "입니다");
		
		sc.close();

	}

}
