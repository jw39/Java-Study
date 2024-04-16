package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		// while문을 사용하여 키보드로부터 입력 받은 수가
		// 10보다 작을 때만 계속 정수를 입력 받으세요.
		// -> 10보다 큰 수를 입력하면 "종료되었습니다"를 출력

		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);

		// 2. 정수 입력 : 출력하기
//		int num = 0;
//		while (num < 10) {
//			System.out.print("정수 입력 : ");
//
//			// 3. 정수 입력받기
//			num = sc.nextInt();
//		}
//
//		// 2~3 구간이 반복! 10보다 큰 수를 입력하면 종료!
//			System.out.println("종료되었습니다.");

		// 위의 문제_ 다른 방법
		// 무한반복문
		// 조건이 true면 무조건 반복을 시킨다는 뜻(true이면 중괄호 안에서 무한 반복)
		while (true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			if (num >= 10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		sc.close();

	}

}
