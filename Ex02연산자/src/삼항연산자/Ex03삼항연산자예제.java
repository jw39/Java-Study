package 삼항연산자;

import java.util.Scanner;

public class Ex03삼항연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 삼항연산자예제
		
		//2. 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 결과값을 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		int result = (num1<num2)?num2-num1:num1-num2;
		System.out.println("두 수의 차: " + result);
		
		sc.close();
	}

}
