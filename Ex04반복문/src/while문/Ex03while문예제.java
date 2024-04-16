package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

		// while문을 사용하여 키보드로부터 입력 받은 수를
		// 누적하는 프로그램을 작성하세요.
		// -> -1을 입력한 경우 프로그램 종료

		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);

		// 2. 정수 입력 출력하기(개행없이)
		int sum = 0;
		while (true) {
			System.out.print("정수 입력 : ");

			// 3. 정수 입력받기
			int input = sc.nextInt();

			// 4. 입력받은 정수 누적하기
			// ---> 누적받을 변수 하나 필요함!
			sum += input; // <--옆에 것을 늘리면 sum = sum + input; 과 같은 것임
			System.out.println("누적결과 : " + sum);

			// 5. 2~4까지 반복!!
			// -1을 입력하면 종료되었습니다. 출력 후 프로그램 끝
			if (input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

		sc.close();

	}

}
