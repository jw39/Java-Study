package dowhile문;

public class Ex01dowhile문기초 {

	public static void main(String[] args) {

		do {
			System.out.println("반드시 한 번 실행!!");
		} while (false);
		// do-while문은 반드시 한 번은 실행해야 하는 코드가 있을 때 사용!
		// ---> 검사조건이 false여도 한 번은 실행된다!
		// 만약 num이라는 변수를 선언해서 int num = 3;이면 while(num<5)으로 들어오고
		// 3이 5보다 작니? 라고 물어보고 참이면 반복하고 거짓이면 종료되는 것
		// do-while문은 조건식 뒤에 세미콜롬(;)이 반드시 들어옴

		while (true) {
			System.out.println("반복하는 구문");
		}

		// 둘의 차이점
		// while문의 조건에 false라는 조건을 넣으면 오류가 남(죽은 코드)

	}

}
