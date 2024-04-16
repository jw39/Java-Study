package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {

		// 숫자를 입력 받아 홀수와 짝수가 각각 몇 개 입력되었는지
		// 출력하는 프로그램을 작성하세요.
		// --> -1을 입력한 경우 프로그램 종료

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 2. 정수 입력 출력하기(개행없이)
		int even = 0;
		int odd = 0;
		while (true) {
			System.out.print("정수 입력 : ");

			// 3. 정수 입력받기
			int input = sc.nextInt();

			// 4. 입력받은 정수가 짝수라면 짝수의 개수를 +1
			// ---> 짝수의 개수와 홀수의 개수를 구할 변수 하나 씩 필요
			if (input % 2 == 0) { // <-- input이라는 숫자를 2로 나누면
									// 나머지가 0이 되니? (0과 같니?)라고 하는 말임
									// 만약 input에 홀수인 숫자 5를 넣으면
									// 여기 중괄호 안에 부합하지 않음
									// 그래서 다음 중괄호로 넘어가서 계산해보고 부합한지 다시 체크
				even++;
			} else if (input % 2 == 1) {
				// 5. 입력받은 정수가 홀수라면 홀수의 개수를 +1
				odd++;
			} else if (input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			// 6. 짝수와 홀수의 개수 출력하기
			System.out.println("짝수 개수 : " + even);
			System.out.println("홀수 개수 : " + odd);
		}
		// 2~6까지 반복!! -1을 입력하면 프로그램 종료
		
		sc.close();

	}

}
