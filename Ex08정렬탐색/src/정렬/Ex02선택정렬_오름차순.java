package 정렬;

import java.util.Arrays;

public class Ex02선택정렬_오름차순 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 98, 7, 70, 13, 24 };
		System.out.println("정렬 전: " + Arrays.toString(array));
		int temp = 0; // 자리를 바꿀 숫자를 잠시 담아둘 공간

		// 1회차
		int index; // 가장 작은 숫자의 방 번호를 기억해둘 공간

		for (int j = 0; j < 4; j++) {		// j는 맨 처음 비교할 array[0]
			index = j;
			for (int i = index + 1; i < 5; i++) {
				if (array[index] > array[i]) {
					index = i; // 배열 안에서 가장 작은 값을 index로 바꿔줘야 한다!
				}
			}
			// 자리 바꾸기
			temp = array[j];
			array[j] = array[index]; // 가장 작은 숫자를 0번 방으로
			array[index] = temp; // 원래 0번 방에 있던 숫자를 index 방으로 옮기기
			System.out.println((j + 1) + "회차: " + Arrays.toString(array));
		}

//		// 2회차
//		index = 1;
//		for (int i = index+1; i<5; i++) {
//			if(array[index] > array[i]) {
//				index = i;				//  배열 안에서 두번째 작은 숫자의 인덱스로 바꿔준다.
//			}
//		}
//		
//		// 자리 바꾸기
//		temp = array[1];
//		array[1] = array[index];		// 두번째로 작은 숫자를 1번 방으로
//		array[index] = temp;			// 원래 1번 방에 있던 숫자를 index 방으로 옮기기
//		System.out.println("2회차: "+ Arrays.toString(array));

	}

}
