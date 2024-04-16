package 변수및자료형;
//20240320

import java.util.Scanner;

public class Ex01변수 {
	// main을 못 만들었다면 main ctrl space --> 자동완성 가능

	public static void main(String[] args) {
		// 0320 입출력
		// 1) 글자 크기를 늘리기: ctrl +
		// 2) 글자 크기를 줄이기: ctrl -
		// 3) 한 줄 삭제: ctrl d
		// 4) 자동완성: ctrl Space
		// 5) 줄 이동: Alt ↑↓
		// 6) 줄 복사: ctrl Alt ↑↓
		// 7) 주석 처리: ctrl /
		// 8) 코드 정렬: ctrl shift f
		
		// 변수 선언하는 법 --> 자료형 변수명 = 값;
		// 정수 데이터 4라는 값을 담을 수 있는 num 변수 선언
		int num = 4;
		// 변수를 사용하는 이유: 재사용하기 위해서
		System.out.println(num);
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 1-1. 입력받기 전 출력문
		System.out.print("숫자를 입력하세요 >> ");
		
		// 2. 정수형 숫자 변수에 담아 입력받기
		int input = sc.nextInt();
		
		// 3. 입력받은 숫자 출력
		System.out.println(input);
		
		
		// 상수 선언하는 법 --> final 키워드 사용
		// 정수형 3이라는 숫자를 담을 수 있는 상수 num2를 선언
		final int num2 = 3;
		
		// 변수에 들어가는 값 변경
		num = 14;
		// num2 = 10; --> 상수는 값 변경이 불가능
		// int input = 5; --> 변수명 중복 선언은 불가능
		
		System.out.println(num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
