package 이차원배열;

public class Ex02이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 이차원 배열 생성
		int[][] array = new int[5][5];

		// 배열값 21로 시작
		int num = 21;

		// 2. 행(j)과 열(i)값 for문 이용해 채우기
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[i][j] = num++;
			}
		}

		// 3. for문 이용해서 이차원 배열 값 출력.. 이번 문제는 배열값 출력 순서가 가로가 아닌 세로로...
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
