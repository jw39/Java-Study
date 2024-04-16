package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex04숫자맞추기게임 {

	public static void main(String[] args) {

		// 1부터 100 사이의 랜덤한 숫자 생성하세요
		// 사용자로부터 숫자를 입력 받으세요
		// 입력한 숫자가 더 작다면 "더 큰 수를 입력하세요"를 출력하고
		// 입력한 숫자가 더 크다면 "더 작은 수를 입력하세요"를 출력하세요
		// 정답을 맞출 때까지 프로그램을 반복해주세요

		// 1. 랜덤숫자 도구 꺼내오기
		Random ran = new Random();

		// 2. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 3. 1과 100 사이의 랜덤숫자 변수에 담기
		int ranNum = ran.nextInt(100) + 1;
		// System.out.println(ranNum); --> 이건 게임할 때 랜덤한 숫자를 표시하는 것임

		// 4. 1과 100 사이의 정수를 입력하세요 출력
		System.out.println("====== 1부터 100 사이 숫자 맞추기 게임! ======");
		do {
			System.out.print("1과 100사이의 정수를 입력하세요 >> ");

			// 5. 숫자 입력받기
			int input = sc.nextInt();

			// 6-1. 입력한 숫자가 더 작다면? -> 더 큰수로 다시 시도해보세요
			if (input < ranNum) {
				System.out.println("더 큰 수로 다시 시도해보세요");

				// 6-2. 입력한 숫자가 더 크다면? -> 더 작은 수로 다시 시도해보세요
			} else if (input > ranNum) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			} else {
				System.out.println(ranNum + "정답입니다!!");
				break;
			}
		} while (true);

		sc.close();

	}

}
