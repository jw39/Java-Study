package 이중for문;

public class Ex04공포의별찍기 {

	public static void main(String[] args) {

		// * -> space 4번, * 1번
		// ** -> space 3번, * 2번
		// *** -> space 2번, * 3번
		// ****
		// *****

		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < 5 - j; i++) {
				System.out.print(" "); // -> 4 3 2 1 0
			}
			for (int i = 0; i < j; i++) {
				System.out.print("*"); // -> 1 2 3 4 5
			}
			System.out.println(); // 5 5 5 5 5
		}

		// 풀이
		// 4 3 2 1 0
		// 1 2 3 4 5 => 위아래로 더했을 때 5개 다 5가 나옴

//		for (int i = 0; i < 4; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 0; i < 1; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
////////////////////////////////////////////////////////
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 0; i < 2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
///////////////////////////////////////////////////////
//		
//		for (int i = 0; i < 2; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
///////////////////////////////////////////////////////////
//		
//		for (int i = 0; i < 1; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 0; i < 4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
////////////////////////////////////////////////////////////
//		
//		for (int i = 0; i < 0; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println();

	}

}
