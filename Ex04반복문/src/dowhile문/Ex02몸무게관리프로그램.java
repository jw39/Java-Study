package dowhile문;

import java.util.Scanner;

public class Ex02몸무게관리프로그램 {

	public static void main(String[] args) {

		// 현재 몸무게와 목표 몸무게를 입력 받으세요
		// 주차별 감량 몸무게를 입력 받으세요
		// 현재 몸무게가 목표 몸무게에 달성하면 축하한다는 문구를 출력하고 종료시켜주세요
		// 목표 몸무게에 달성 --> 현재 몸무게가 목표 몸무게보다 작거나 같은 것!

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 2. 현재 몸무게 입력받기
		System.out.print("현재 몸무게 : ");
		int present = sc.nextInt();

		// 3. 목표 몸무게 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();

		// 4. 주차별 감량 몸무게 입력받기
		int week = 1; // 1주차라고 예시가 나와있기에 숫자 1을 넣는 게 가장 편함
		do {
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;

			// 5-1. 현재 몸무게 = 원래 몸무게 - 감량 몸무게 (변수 더 만들 필요X)
			present = present - minus; // prsent -= minus; 복합식으로 더 간단하게 바꿀 수 있음

			// 5-2. 현재 몸무게가 목표 몸무게에 도달했는지 조건을 판단
			if (present <= goal) {
				System.out.println(present + "kg 달성!! 축하합니다");
				break;
			}
		} while (true);

		sc.close();
	}

}
