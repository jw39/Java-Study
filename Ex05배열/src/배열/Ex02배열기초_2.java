package 배열;

public class Ex02배열기초_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[5];

		// 배열의 길이
		// 변수명.length;
		int length = numbers.length;
		System.out.println("배열의 길이: " + length);

		// 배열의 각 칸을 5의 배수로 초기화
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;

		for (int i = 0; i < numbers.length; i++) {
			// numbers[i] = (5 * i) + 5;  // 내가 생각한 답안
			numbers[i]=5*(i+1);
			System.out.print(numbers[i]+" ");
		}	
	
		// 그냥 출력한 버전
//		System.out.print(numbers[0]+" ");
//		System.out.print(numbers[1]+" ");
//		System.out.print(numbers[2]+" ");
//		System.out.print(numbers[3]+" ");
//		System.out.print(numbers[4]);

		System.out.println();
		System.out.println("================");
		
		// 배열을 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = {"이도연", "강예진", "조준용"};
		// 강예진 데이터 출력하기
		System.out.println(names[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
