package 메소드;

import java.util.Scanner;

public class Ex05완전수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.print("num1 입력: ");
//		int num1 = sc.nextInt();
//		System.out.print("num2 입력: ");
//		int num2 = sc.nextInt();
//		boolean divisor = isDivisor(num1, num2);
//		System.out.println(divisor);

//		System.out.println(getSum(44)); 	// 답 40
//		System.out.println((isPerfect(28)));// 답 true
		
		System.out.print("1부터 1000까지의 완전수 : " );
		for(int i = 1; i<=1000; i++) {
			if(isPerfect(i))
			System.out.print(i + " ");
		}
		
	}
	
	// 메소드 기본 모양
	// private static 리턴타입 메소드명(매개변수타입 매개변수 이름,...) {
	// int result = 0;
	// 알고리즘
	// return result ;
	// }
	

	// 3. 완전수인지 확인하는 메소드
	private static boolean isPerfect(int num) {
		boolean result = false;
		// 입력된 숫자 num과 num의 약수의 합이 같은지 판별
		if (num == getSum(num)) {
			// num이 완전수일 때!
			result = true;
		}

		return result;
	}
	


	// 2. 자신을 제외한 약수의 총합을 구하는 메소드
	private static int getSum(int num) {
		int result = 0;
		// 1. 입력된 숫자의 약수 구하기 --> 1~num까지 숫자 중에서 num을 제외한 범위
		// 2. 나 자신을 제외한 약수의 합을 구한 --> result에 누적
		for (int i = 1; i < num; i++) {
			// * 기존 로직
			// if (num % i == 0) {
			
			// ** 메소드를 호출한 로직!
			// 메소드 구조 안에 메소드를 새롭게 만들 수는 없으나
			// 메소드를 호출해서 사용하는 것은 가능하다.
			// isdivisor의 값이 boolean 형태라서 따로 t,f 조건식을 주지 않아도 된다
			// num % i ==0이면 그 값은 true니까 if문 실행
			if (isDivisor(num, i)) {
				// i는 num의 약수!
				result += i;
			}
		}
		return result;
	}

	
	// 1. 약수 찾는 메소드
	private static boolean isDivisor(int num1, int num2) {
		boolean result = false;
		// num2가 num1의 약수이니?
		if (num1 % num2 == 0) {
			result = true;
		}
		return result;
	}

}
