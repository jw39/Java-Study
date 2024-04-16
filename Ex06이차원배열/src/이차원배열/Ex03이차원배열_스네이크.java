package 이차원배열;

public class Ex03이차원배열_스네이크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [][] = new int [5][5];
		int num = 21;
		
//		array[0][0] = num++;
//		array[0][1] = num++;
//		array[0][2] = num++;
//		array[0][3] = num++;
//		array[0][4] = num++;
//		
//		array[1][0] = num++;
//		array[1][1] = num++;
//		array[1][2] = num++;
//		array[1][3] = num++;
//		array[1][4] = num++;
//		
//		array[2][0] = num++;
//		array[2][1] = num++;
//		array[2][2] = num++;
//		array[2][3] = num++;
//		array[2][4] = num++;
//		
//		array[3][0] = num++;
//		array[3][1] = num++;
//		array[3][2] = num++;
//		array[3][3] = num++;
//		array[3][4] = num++;
		
		/////////////////////////////
		
//		for(int i = 0; i < 5; i++) {
//			array[0][i] = num++;
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			array[1][i] = num++;
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			array[2][i] = num++;
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			array[3][i] = num++;
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			array[4][i] = num++;
//		}
		
		//////////////////////////////
		// for문 이용해 값 이차원 배열 입력
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				array[j][i] = num++;
			}
		}
		//////////////////////////////
		// 1번째 줄 [0][0]부터 [0][4]까지 출력
		
		for (int i = 0; i < 5; i++) {
			System.out.print(array[0][i] + "\t");
		}
		System.out.println();
		
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);
//		System.out.println(array[0][2]);
//		System.out.println(array[0][3]);
//		System.out.println(array[0][4]);
		
		////////////////////////////////
		// 2번째 줄 [1][4]부터 [1][0]까지 출력
		for (int i = 4; i >= 0; i--) {
			System.out.print(array[1][i] + "\t");
		}
		System.out.println();
		
//		System.out.println(array[1][4]);
//		System.out.println(array[1][3]);
//		System.out.println(array[1][2]);
//		System.out.println(array[1][1]);
//		System.out.println(array[1][0]);
		
		///////////////////////////////
		// 3번째 줄 [2][0]부터 [2][4]까지 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(array[2][i] + "\t");
		}
		System.out.println();
		
//		System.out.println(array[2][0]);
//		System.out.println(array[2][1]);
//		System.out.println(array[2][2]);
//		System.out.println(array[2][3]);
//		System.out.println(array[2][4]);

		////////////////////////////////
		// 4번째 줄 [3][4]부터 [3][0]까지 출력
		for (int i = 4; i >= 0; i--) {
			System.out.print(array[3][i] + "\t");
		}
		System.out.println();

//		System.out.println(array[3][4]);
//		System.out.println(array[3][3]);
//		System.out.println(array[3][2]);
//		System.out.println(array[3][1]);
//		System.out.println(array[3][0]);
		
		////////////////////////////////
		// 5번째 줄 [4][0]부터 [4][4]까지 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(array[4][i] + "\t");
		}
		System.out.println();
		
//		System.out.println(array[4][0]);
//		System.out.println(array[4][1]);
//		System.out.println(array[4][2]);
//		System.out.println(array[4][3]);
//		System.out.println(array[4][4]);
	
		
	
		
		
		

	}

}
