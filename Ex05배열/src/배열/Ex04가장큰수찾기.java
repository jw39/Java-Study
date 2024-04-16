package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 정수형 데이터 5개를 저장하는 배열 선언
		int[] array = new int[5];

		// 랜덤 rm이라는 이름으로 불러오기
		Random rm = new Random();

		// 2. 랜덤한 숫자로 배열 초기화하기
		for (int i = 0; i < array.length; i++) {
			array[i] = rm.nextInt(10) + 1;
		}

		// 3. 가장 큰 수를 저장할 수 있는 변수 max 출력
		int max = 0;

		// 4,5 번 max와 배열 안의 값 비교하기, array[i]이 max보다 크다면 array[i] 값을 max에 대입
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		// 6. 배열 안 모든 데이터 출력
		System.out.println("배열 안에 들어있는 값: " + Arrays.toString(array));
		// 7. 가장 큰 값 출력
		System.out.println("가장 큰 값은 " + max + " 입니다.");

//		if(array[0]>max) {
//			max = array[0];
//			System.out.println("가장 큰 값은" + max + "입니다");
//		} 
//		
//		if(array[1]>max) {
//			max = array[1];
//			System.out.println("가장 큰 값은" + max + "입니다");
//		} 
//		
//		if(array[2]>max) {
//			max = array[2];
//			System.out.println("가장 큰 값은" + max + "입니다");
//		} 
//		
//		if(array[3]>max) {
//			max = array[3];
//			System.out.println("가장 큰 값은" + max + "입니다");
//		} 
//		
//		if(array[4]>max) {
//			max = array[4];
//			System.out.println("가장 큰 값은" + max + "입니다");
//		} 

//		} else if(array[1]>max) {
//			max = array[1];
//			System.out.println("가장 큰 값은" + max + "입니다");
//		} else if(array[2]>max) {
//			max = array[2];
//			System.out.println("가장 큰 값은" + max + "입니다");
//		}

	}

}
