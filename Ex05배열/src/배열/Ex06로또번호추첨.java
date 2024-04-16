package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호추첨 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rm = new Random();
		int[] lotto = new int[5];
		System.out.println("====로또타임====");
		System.out.println("이번주 출력 번호는요...!!두구두구두구!!");

		for (int i = 0; i < 5; i++) {
			lotto[i] = rm.nextInt(10) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					// lotto[i] = rm.nextInt(10) + 1;
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

	}
}
