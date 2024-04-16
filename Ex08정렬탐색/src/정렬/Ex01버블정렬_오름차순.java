package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 버블 정렬
		// 오름차순 정렬
		// 1. 앞에서부터 현재 원소와 바로 다음에 있는 원소 비교
		// 2. 현재 원소가 다음 원소보다 크다면 원소 교환
		// 3. 다음 원소로 이동해서 해당 원소와 그 다음 원소를 비교 반복

		// 배열 선언하기
		int[] array = { 45, 7, 12, 82, 25 };
		System.out.println("정렬 전 : " + Arrays.toString(array));

		// 치환, 순서를 바꾸려면 공간이 하나 더 필요함!
		int temp = 0; // 치환을 위한 임시 공간

		// 1회차
		// 0-1 비교 / 1-2 비교 / 2-3비교 / 3-4비교
		
		// Q. 중간에 정렬이 완료된 경우 더 이상 정렬이 진행하지 않는 코드 작성하기
		for (int j = 1; j < array.length; j++) {
			boolean sw = false;	// n회차에서 정렬이 한 번이라도 일어나면 true;
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sw = true;
				} 
			}
			if(!sw) {
				// sw가 false일 때만 실행 (n회차에서 한 번도 바뀐 값이 없을 때)
				break;
			}
			
			System.out.println(j + "회차  : " + Arrays.toString(array));
		}

//		// 2회차
//		// 0-1 비교 / 1-2비교 / 2-3비교
//		for (int i = 0; i < 3; i++) {
//			if(array[i] > array[i+1]) {
//				temp = array[i];
//				array[i] = array[i+1];
//				array[i+1] = temp;
//			}
//		}
//		System.out.println("2회차: " + Arrays.toString(array));

	}

}
