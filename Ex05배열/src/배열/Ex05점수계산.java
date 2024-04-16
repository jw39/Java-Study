package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 성적 데이터를 저장할 수 있는 배열 생성
		int[] array = new int[5];
		// 스캐너 불러오기
		Scanner sc = new Scanner(System.in);

		// 최고, 최저, 총합 저장할 변수 선언
		int max = 0;
		int min = array[0];
		int sum = 0;

		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt(); 					// array[0]~array[4] 까지 각각 입력 받기, i가 0부터 시작하니까 i+1로 1부터 시작하게 만들기

			if (array[i] > max) {						// array[0]값이 max(=0)보다 크다면
				max = array[i];							// max 변수에 array[0]값을 넣을 거야
			}
			if (array[i] < min) {						// array[0]값이 min(=100)보다 작다면
				min = array[i];							// min 변수에 array[i]값을 넣을 거야
			}
			sum +=array[i];								// sum변수에 array[0], array[1],array[2],array[3],array[4] 값을 더할 거야
		}
		System.out.println("입력된 점수: " + Arrays.toString(array));
		System.out.println("최고 점수: " + max);
		System.out.println("최저 점수: " + min);
		System.out.println("총합: " + sum);
		System.out.println("평균: " + (float)sum/array.length);
		
		sc.close();

	}

}
