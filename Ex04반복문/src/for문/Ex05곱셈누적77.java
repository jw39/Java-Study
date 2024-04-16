package for문;

public class Ex05곱셈누적77 {

	public static void main(String[] args) {

		// (77*1) + (76*2) + (75*3) + ... + (1*77) 을 계산하여 결과를 출력하세요
		// 이중for문 작성 가능?

		int sum = 0;
		for (int i = 77; i > 0; i--) {
			int j = 78 - i;
			sum = sum + (i * j);
		}
		System.out.println(sum);

		// 선생님의 풀이 방법

//		int sum = 0;
//		int num = 1;
//		for(int i = 77; i > 0; i--) {          // i : 77 ---> 1
//			sum += (i * num);  // ->복합대입연산자 // sum = sum + (i * num) 이라고 풀어쓸 수 있음
//			num++;                             // num : 1 ---> 77
//		}
//		System.out.println(sum);

	}

}
