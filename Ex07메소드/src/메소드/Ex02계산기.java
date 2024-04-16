package 메소드;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		char op = '*';
		System.out.println(cal(num1, num2, op));
		
		sc.close();
	}

	
	// 리턴 타입: int, 매개변수: int 2개 char 1개, 메소드 명: cal
	// private : 다른 클래스에서 사용할 수 없게 막는 접근제한자
	public static int cal(int num1, int num2, char op) {
		int result = 0;
		// op가 어떤 모양인지에 따라서 연산이 달라져야 한다.
		// op값을 비교 판별해야함
		if (op == '-') {
			result = num1 > num2 ? num1 - num2 : num2 - num1;
		} else if (op == '+') {
			result = num1 + num2;
		} else if (op == '/') {
			result = num1 / num2;
		} else if (op == '*') {
			result = num1 * num2;
		}
		return result;
	}

}
