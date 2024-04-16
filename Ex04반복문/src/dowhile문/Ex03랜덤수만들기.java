package dowhile문;

import java.util.Random;

public class Ex03랜덤수만들기 {

	public static void main(String[] args) {

		// 랜덤 수를 뽑아내는 방법
		// 1. 랜덤한 수를 추출해오는 도구 꺼내오기
		Random ran = new Random();

		// 2. 랜덤한 수 생성하기
		// 0부터 시작해서 추출하고 싶은 숫자의 갯수 적기
		// 추출할 때에는 0부터 시작이니 1부터 시작하고 싶으면 +1을 적으면 됨
		// 1~9까지 숫자 추출하고 싶으면 nextInt(); 여기에 적는 것!
		int ranNum = ran.nextInt(9) + 1;
		System.out.println(ranNum);

	}

}
