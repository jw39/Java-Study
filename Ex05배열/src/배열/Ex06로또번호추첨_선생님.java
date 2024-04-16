package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호추첨_선생님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형 데이터 5개를 보관할 수 있는 array 배열 선언
		int [] array = new int[5];

		// 랜덤한 숫자 만드는 도구 꺼내기
		Random ran = new Random();

		System.out.println("====로또타임====");
		System.out.println("이번주 출력 번호는요...!!두구두구두구!!");
		
		// 0번방에 랜덤한 숫자 넣기
		array[0] = ran.nextInt(10) + 1;

//		// 1번방에 랜덤한 숫자 넣기
//		array[1] = ran.nextInt(10) + 1;
//
//		// 1번 방의 숫자와 0번 방의 숫자 비교
//		if (array[1] == array[0]) {
//			// 중복된 수가 있다면 1번 방에 새로운 랜덤수 넣기
//			array[1] = ran.nextInt(10) + 1;
//		}
//		/////////////////////////////////
//		// 2번방에 랜덤한 숫자 넣기
//		array[2] = ran.nextInt(10) + 1;
//
//		// 2번 방의 숫자와 0번 방의 숫자 비교
//		if (array[2] == array[0]) {
//			// 중복된 수가 있다면 2번방에 새로운 랜덤수 넣기
//			array[2] = ran.nextInt(10) + 1;
//		}
//
//		// 2번 방의 숫자와 1번 방의 숫자 비교
//		if (array[2] == array[1]) {
//			// 중복된 수가 있다면 2번방에 새로운 랜덤수 넣기
//			array[2] = ran.nextInt(10) + 1;
//		}
//		//////////////////////////////////
//		// 3번 방에 랜덤한 숫자 넣기
//		array[3] = ran.nextInt(10) + 1;
//
//		// 3번 방의 숫자와 0번 방의 숫자 비교
//		if (array[3] == array[0]) {
//			// 중복된 수가 있다면 3번방에 새로운 랜덤수 넣기
//			array[3] = ran.nextInt(10) + 1;
//		}
//
//		// 3번 방의 숫자와 1번 방의 숫자 비교
//		if (array[3] == array[1]) {
//			// 중복된 수가 있다면 3번방에 새로운 랜덤수 넣기
//			array[3] = ran.nextInt(10) + 1;
//		}
//
//		// 3번 방의 숫자와 2번 방의 숫자 비교
//		if (array[3] == array[2]) {
//			// 중복된 수가 있다면 3번방에 새로운 랜덤수 넣기
//			array[3] = ran.nextInt(10) + 1;
//		}
//		////////////////////////////////////
//		// 4번 방에 랜덤한 숫자 넣기
//		array[4] = ran.nextInt(10) + 1;
//
//		// 4번 방의 숫자와 0번 방의 숫자 비교
//		if (array[4] == array[0]) {
//			// 중복된 수가 있다면 3번방에 새로운 랜덤수 넣기
//			array[4] = ran.nextInt(10) + 1;
//		}
//
//		// 4번 방의 숫자와 1번 방의 숫자 비교
//		if (array[4] == array[1]) {
//			// 중복된 수가 있다면 3번방에 새로운 랜덤수 넣기
//			array[4] = ran.nextInt(10) + 1;
//		}
//
//		// 4번 방의 숫자와 2번 방의 숫자 비교
//		if (array[4] == array[2]) {
//			// 중복된 수가 있다면 3번방에 새로운 랜덤수 넣기
//			array[4] = ran.nextInt(10) + 1;
//		}
//
//		// 4번 방의 숫자와 3번 방의 숫자 비교
//		if (array[4] == array[3]) {
//			// 중복된 수가 있다면 3번방에 새로운 랜덤수 넣기
//			array[4] = ran.nextInt(10) + 1;
//		}
//
//		//////////////////////////////////////
//		// for 문으로 묶기
//
//		array[1] = ran.nextInt(10) + 1;
//		// 1번방과 0번방과 비교, 같다면 1번방 숫자 랜덤화
//		for (int i = 0; i < 1; i++) {
//			if (array[1] == array[i]) {
//				array[1] = ran.nextInt(10) + 1;
//			}
//		}
//
//		array[2] = ran.nextInt(10) + 1;
//		// 2번방과 0~1번방까지 비교, 같다면 2번방 숫자 랜덤화
//		for (int i = 0; i < 2; i++) {
//			if (array[2] == array[i]) {
//				array[2] = ran.nextInt(10) + 1;
//			}
//		}
//		
//		
//		array[3] = ran.nextInt(10) + 1;
//		// 3번방과 0~2번방까지 비교, 같다면 3번방 숫자 랜덤화
//		for (int i = 0; i < 3; i++) {
//			if (array[3] == array[i]) {
//				array[3] = ran.nextInt(10) + 1;
//			}
//		}
//
//		array[4] = ran.nextInt(10) + 1;
//		// 4번방과 0~3번방까지 비교, 같다면 4번방 숫자 랜덤화
//		for (int i = 0; i < 4; i++) {
//			if (array[4] == array[i]) {
//				array[4] = ran.nextInt(10) + 1;
//			}
//		}

		/////////////////////////////////////////
		// 이중 for 문 사용해 동일한 코드 묶기

		for (int j = 1; j < 5; j++) {
			array[j] = ran.nextInt(10) + 1;

			for (int i = 0; i < j; i++) {
				if (array[j] == array[i]) {
					
					// array[j] = ran,nextInt(10)+1; => 다시 똑같은 숫자가 들어갔다면...?
					// 다시 검사를 할 수 있게 만들려면 어떻게 해야 할까?
					// j값을 1 증가시키지 말고 되돌리려면?
					// j값에 -1 하고 다시 위 for문 돌아서 +1을 해 원래 인덱스의 for문을 다시 검사한다.
					// -> 중복 안 나올 때까지 for문 지옥에 갇혀,, 계속 검사하는 거
					j--;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
	}

}
