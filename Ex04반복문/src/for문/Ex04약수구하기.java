package for문;

import java.util.Scanner;

public class Ex04약수구하기 {

	public static void main(String[] args) {

		// 입력 받은 정수의 약수를 구하세요.
		// 숫자를 입력 받는다.
		// 입력 받은 숫자를 임의의 숫자로 나누었을 때 나머지가 0이라면 약수!

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 2. 정수 입력받기
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 3. 약수 출력하기
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				// 입력받은 숫자를 임의의 숫자(1 ~ 나 자신)로 나누었을 때
				// 나머지가 0이라면? ---> 약수
				System.out.print(i + " ");
				// --> 내가 정한 수인 input이 아닌 계속 변하는 수인 i를 써야함
			}
		}

		sc.close();

	}

}
