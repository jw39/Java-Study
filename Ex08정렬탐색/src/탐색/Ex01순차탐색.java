package 탐색;

public class Ex01순차탐색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 순차탐색 : 0번부터 끝번호까지 하나하나 비교해서 찾는 방법
		// : 정렬이 되어 있을 필요가 없음!

		int[] array = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };

		// 내가 찾고자 하는 숫자
		int num = 13;
		// 78은 6번 인덱스에 있습니다! 출력

		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				// 숫자를 찾은 경우
				System.out.println(num + "은 " + i + "번에 있습니다.");
				break;		//값이 중복되지 않은 경우에 더이상 뒤쪽을 확인하지 않도록 멈춰줌.
			}
		}

	}

}
