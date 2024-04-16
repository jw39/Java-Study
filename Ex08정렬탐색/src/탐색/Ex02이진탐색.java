package 탐색;

public class Ex02이진탐색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이진탐색
		// 변수 3개를 사용해서 데이터를 탐색하는 알고리즘
		// lowIndex, highIndex, middleIndex
		// 장점: 시간 복잡도가 1/2 수준으로 빠른 탐색 속도를 가지고 있다.
		// 단점: 정렬이 되어있는 리스트에서만 사용 가능!

		// 1. 정렬이 된 배열 선언하기
		int[] array = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };
		// 2. lowIndex : 배열이 가지는 최소 index 값으로 초기화
		int lowIndex = 0;
		// 3. highIndex : 배열이 가지는 최대 index 값으로 초기화
		int highIndex = array.length - 1;

		// 4. 내가 찾고자 하는 숫자 정하기
		int num = 78;
		while (true) {
			// 5. 배열이 가지는 값 중 중앙 값인 middleIndex 값 초기화
			int middleIndex = (lowIndex + highIndex) / 2;
			if (array[middleIndex] == num) {
				// 중간 값과 찾고자 하는 수인 num이 같다면 위치를 출력
				System.out.println(middleIndex);
				break;
			} else {
				// 중간 값과 num이 다르다면, 중간값보다 큰지 작은지를 판단
				// lowIndex, highIndex값을 다시 설정! -> 범위를 점점 좁혀가는 것
				if (array[middleIndex] > num) {
					// 중간값보다 num이 더 작은 경우
					highIndex = middleIndex - 1;
				} else {
					// 중간값보다 num이 더 큰 경우
					lowIndex = middleIndex + 1;
				}
			}
		}

	}

}
