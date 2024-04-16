package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0320 백 자리 미만은 버리고 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력: ");
		int num = sc.nextInt();

		// 방법 1
		//int result = num / 100 * 100;
		//System.out.println("결과값: " + result);

		//System.out.println("결과값: " + (num / 100 * 100));

		// 방법 2
		int result = num - (num % 100);
		System.out.println("결과값: " + result);
//		System.out.println("결과값: " + (num / 100 * 100));
		
		sc.close();

	}

}
