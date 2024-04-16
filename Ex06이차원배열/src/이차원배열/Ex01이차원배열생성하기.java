package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열생성하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 이차원 배열 생성하기 (정수형 데이터 저장)
		int[][] array = new int[3][3]; // 첫번째는 (가로)행의 크기, 두번째는 (세로)열의 크기 [행][열]
		System.out.println(array[0][1]);

		// 2. 이차원 배열 값 넣으면서 생성하기
		int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 3. 이차원 배열 안에 값 넣기

		int num = 1;

		for (int j = 0; j < 3; j++) { 		// j값 = 행 번호 제어 [j][0]
			for (int i = 0; i < 3; i++) { 	// i값 = 열 번호 제어 [0][i]
				array[j][i] = num++;
			}
		}
		
		// 4. 이차원 배열 값 출력
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		//////////////////////////////////////////////
		
		
		for (int j = 0; j < array.length; j++) {			// j는 행 번호 제어
			for (int i = 0; i < array[j].length; i++) {		// i는 열 번호 제어
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}

		
		
		
		

	}

}
