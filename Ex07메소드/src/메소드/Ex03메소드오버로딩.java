package 메소드;

public class Ex03메소드오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메소드 오버로딩 (중복 정의)
		// 매개변수를 다르게 하고, 메소드 이름을 똑같이 부여
		System.out.println(add(3,5));
		System.out.println(add(3.5, 5.5));
		

	}

	// 메소드 오버로딩 성립 조건
	// 1. 이름이 같아야 한다.
	// 2. 매개변수의 개수 혹은 자료형(타입)이 달라야 한다.
	// 3. 매개변수와 메소드 이름이 동일하고 리턴 타입만 다른 경우는 오버로딩이 아님 걍 오류임..
	private static double add(double num1, double num2) {
		return num1+num2;
	}

	private static int add(int num1, int num2) {
		return num1+num2;
	}

}
