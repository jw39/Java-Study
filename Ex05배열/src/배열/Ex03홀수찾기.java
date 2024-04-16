package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 정수형 데이터 5개를 저장할 수 있는 배열 선언
		int[] array = new int[5];
		
		// 랜덤도구 꺼내오기
		Random rm = new Random();
		
		//홀수 갯수 셀 변수
		int count = 0;	

		//2. 랜덤한 값으로 배열 초기화	
		for(int i = 0; i<array.length; i++) {
			array[i] = rm.nextInt(100)+1;
		}
		
		// 배열 안에 있는 모든 데이터 출력: Arrays.toString(array);
		System.out.println(Arrays.toString(array));
		
		
		System.out.print("array에 들어있는 홀수는 ");		//"array에 들어있는 홀수는 "이라는 문구를 가장 처음 한 번 출력

		for (int i = 0; i < array.length; i++) {	// 배열 길이 전까지 반복하게끔 제어 0,1,2,3,4 총 인덱스 4칸
			if (array[i] % 2 == 1) {				// array[0]이 홀수면
				count++;							// 홀수일 때 count라는 변수를 +1씩 더할게
				System.out.print(array[i] + " ");	// "array에 들어있는 홀수는 " 이 다음에 각 홀수가 반복문을 반복할 때마다 출력됨
			}

		}
		System.out.println("이며,");						// array[4]까지 다 반복했으면 "이며,"를 출력해줘
		System.out.println("총 " + count + "개 입니다");	// 그 후 총 개수를 출력할게

	}

}
