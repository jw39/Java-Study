package 배열;

public class Ex01배열기초_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//배열 (array) 자료 구조
		// : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 자료구조
		
		// 배열의 특징
		/*
		 1. 같은 자료형만 하나로 묶을 수 있다.
		 2. 인덱스 번호를 가지고 있다.
			인덱스 번호는 0부터 차례로 1씩 증가한다.
		 3. 크기가 고정적이다. 크기를 바꾸고 싶으면 [] 이 부분 수정

		 */
		

		// 배열 선언하는 방법
		// 자료형[] 변수명 =  new 자료형[0];
		int[] numbers = new int[5];
		System.out.println("numbers 주소값: " + numbers); 
		// 출력하면 배열의 주소값이 출력됨
		
		// numbers --> 5칸짜리 배열이 어디있는지 주소값을 참조하는 레퍼런스 변수
		// new --> 레퍼런스 변수 생성 키워드
		
		/* 
		 주소값이라는 개념이 왜 등장했나요?
		 : 자바에는 데이터를 저장할 수 잇는 공간이 분리되어 있다.
		 --> 서로 다른 저장공간에 있는 데이터를 불러오기 위해서는 해당하는 데이터가 어디에 저장되어있는지 주소값이 필요!
		 저장은 heap, 주소값은 stack?
		
		 1) 스택(stack)
		 : 비교적 작은 양의 데이터를 저장하는 공간
		 
		 2) 힙(heap)
		 : 커다랗고, 복잡한 데이터를 저장하는 공간
		 --> garbage collector (GC) 라는 기능이 있어서 주시적으로 필요없는 데이터들을 정리해준다
		 --> 실행방법: window - preferences -> General -> show heap status
		
		
		// 베열 안에 데이터를 저장하는 방법
		// --> 정확하게 인덱스 번호를 지정한 후에 저장
		
		*/
		
		// 배열의 2번째 칸에 15라는 값을 집어넣겠다.
		numbers[1] = 15;
		System.out.println(numbers[1]);	//값 확인
		
		// index 번호를 초과하면 에러 발생
		// numbers[5] = 20;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
