package 메소드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력: ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.print("10에 가까운 수 : " + result);
		
		sc.close();

	}

	private static int close10(int num1, int num2) {
		// ex) 5와 9를 봤을 때 10에 가까운 수를 찾기 위해서는
		// 10-5=5 / 10-9=1 --> 결과값이 더 작은 수가 10과 가깝다고 판단
		// ex) 11과 15중에서 10에 가까운 수를 찾기 위해서는
		// 10-11=-1 / 10-15=-5 --> 더 작은 수가 10과 가깝다고 판단 불가능 
		
		// -1과 -5에서 -를 뗼 수 있는 방법은?
		// 1) 큰 수에서 작은 수를 빼는 방법 (if 문이 많아진다)
		// 2) 제곱 --> -1*-1 = 1 / -5*-5 = 25
		
		int result = 0;
		// 1. 제곱을 해서 -를 없애는 방법
//		if ((10 - num1)*(10 - num1) < (10 - num2)*(10 - num2)) {
//			// num1이 10과 더 가깝다.
//			result = num1;
//		} else if ((10 - num1)*(10 - num1) > (10 - num2)*(10 - num2)) {
//			// num2가 10과 더 가깝다.
//			result = num2;
//		} else {
//			result = 0;
//		}
		
		
		// 2. 절대값 구하는 방법, 절대값 구하는 메소드 사용... Math.abs()하면 됨.. abs하고 많은 매개변수는 오버로딩..
		if(Math.abs(10-num1) < Math.abs(10-num2) ) {
			// num1이 10과 더 가깝다.
			result = num1;
		} else if (Math.abs(10-num1) > Math.abs(10-num2) ) {
			// num2가 10과 더 가깝다.
			result = num2;
		} else {
			result = 0;
		}
		
		

		// 내가 적은 답안, 음수면 -1 곱하는 것
//		int result = 0;
//		int reNum1 = 0;
//		int reNum2 = 0;
//
//		// 10에서 가까운 수 찾기
//		reNum1 = 10 - num1;
//		reNum2 = 10 - num2;
//		
//		// 음수인 num1, num2에 절댓값 주기
//		if (reNum1 < 0) {
//			reNum1 = -1 * reNum1;
//		}
//		if (reNum2 < 0) {
//			reNum2 = -1 * reNum2;
//		}
//		// 절댓값이 작은 친구를 result값에 대입
//		if (reNum1 > reNum2) {
//			result = num2;
//		} else if (reNum1 < reNum2) {
//			result = num1;
//		} else {
//			result = 0;
//		}

		return result;
	}

	// 리턴 타입: int, 매개변수: int 2개, 메소드 명: close10

}
