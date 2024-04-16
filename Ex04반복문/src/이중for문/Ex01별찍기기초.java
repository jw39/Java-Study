package 이중for문;

public class Ex01별찍기기초 {

	public static void main(String[] args) {

		// *****
		// *****
		// *****
		// *****
		// *****

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println(); // 개행을 해서 줄바꿈을 해주고 또다시 for문을 만나 반복
		}

	}

}
