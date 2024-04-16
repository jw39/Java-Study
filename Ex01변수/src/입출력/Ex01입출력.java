package 입출력;
//20240320

import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {

		// 주석: 코드에 영향을 끼치지 않은 일종의 메모
		// 단축키
		// 1) 글자 크기를 늘리기: ctrl +
		// 2) 글자 크기를 줄이기: ctrl -
		// 3) 한 줄 삭제: ctrl d
		// 4) 자동완성: ctrl Space
		// 5) 줄 이동: Alt ↑↓
		// 6) 줄 복사: ctrl Alt ↑↓
		// 7) 주석 처리: ctrl /
		
		// 1. 출력문
		// ---> () 안 쪽에다가 출력하고 싶은 구문 작성
		// 출력문 생성 단축키: syso -> ctrl Space
		System.out.println("Hello World!!");
		
		// 2. 입력문
		// 2-1) 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 개행(줄바꿈)을 없애고 싶다면 ln을 지워주자
		System.out.print("글자를 입력하세요 >> ");
		
		// 2-2) 입력받기
		sc.next();
		sc.close();
		
		
		
		
		
		
		
		


	}

}
