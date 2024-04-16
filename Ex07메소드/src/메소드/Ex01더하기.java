package 메소드;

public class Ex01더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 사용 (main 영역 안 쪽에서 사용)
		
		// 1-2. 결과값을 변수에 담아 출력
		double result  = addDouble(4.2, 3.14);
		System.out.println(result);

	
		// 2-2. 결과값 메소드 이용해 바로 출력
		System.out.println(subNum(6, 8));
		
		
		// 3-3. 리턴값이 없는, 매개변수도 없는 메소드 출력
		printHello();
		
	}
	
	// 3. 리턴값이 없는, 매개변수도 없는 메소드
	// void: 리턴값이 없는 상황에서 메소드를 만들어야 할 때 사용, 리턴 타입 대신 작성
	public static void printHello() {
		System.out.println("hello~!★");
		System.out.println("hello~!");
		System.out.println("hello~!★");
		System.out.println("hello~!");
		System.out.println("hello~!★");
		
	}
	
	// 2. int type의 빼기 연산 메소드
	// 리턴 타입: int, 매개변수: int 2개, 메소드 명: subNum
	// 매개변수로 받아온 데이터 두 개를 뺀 결과갑을 돌려주는 메소드
	// 단, 큰 수에서 작은 수를 뺀 결과값 돌려주기

	public static int subNum(int num1, int num2) {
		int result = 0;
//		if (num1 > num2) {
//			result = num1 - num2;
//		} else {
//			result = num2 - num1;
//		}
		// 삼항 연산자 사용
		result = num1 > num2 ? num1 - num2 : num2 - num1;
		return result;

	}
	

	// 1. double 타입의 더하기 메소드 생성 (main 영역 벗어나서 작성하기)
	// 리턴 타입: double, 매개변수: double 2개, 메소드 명: addDouble

	public static double addDouble(double num1, double num2) {
		// 메소드는 return 키워드를 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에 코드 작성할 것
		double result = num1 + num2;
		return result;
	}

}
