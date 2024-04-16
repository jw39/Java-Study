package for문;

public class Ex02for문예제 {

	public static void main(String[] args) {

		// for문을 사용하여 96에서 73가지 출력하세요
		for (int i = 96; i > 72; i--) {
			System.out.print(i + " "); // 여기서 +는 연결연산자!(더하기가 아님)
		}

		System.out.println(); // 빈 출력문을 작성하면 한 칸 띄어쓰기가 됨
		// 숫자들 중 홀수만 출력하세요
		for (int i = 96; i > 72; i--) {
			if (i % 2 == 1) { // <-- i를 2로 나눴을 때 나머지가 1이니? 홀수가 되니? 라고 물어보는 말
								// 만약 숫자 96이라고 가정했을 때 나머지는 0이기에 거짓이 되어서
								// 이 중괄호 안에 들어오지 못하고 다시 for문으로 돌아감
				System.out.print(i + " ");
			}
		}

	}

}
