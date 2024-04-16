package 이차원배열;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 이차원 배열 생성
		int[][] array = new int[5][5];

		int num = 21;

		// 2. 입력부
		// 0, 2, 4째 행 --> 증가 (행의 인덱스가 짝수일 때)
		// 1, 3 <-- 증가 (행의 인덱스가 홀수일 때)

		for (int j = 0; j <= 4; j++) { // j 는 행 번호
			// 행이 홀수인지 짝수인지 판별이 필요함
			if (j % 2 == 0) {
				// 행이 짝수일 때
				for (int i = 0; i < 5; i++) {
					array[j][i] = num++;
				}
			} else {
				// 행이 홀수일 때
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++;
				}

			}

		}
		
		// 3. 출력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
		
	

	}

}
