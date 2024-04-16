package 인터페이스;

public interface Temp {
	/* 인터페이스란?
	   : 클래스들이 공통적으로 구햔해야 하는 기능들을 미리 정의
	   : 프로젝트 설계도, 작업 명세서 (지켜야 하는 규칙)
	   
	   인터페이스 특징
	   1. 필드에 들어갈 수 있는 데이터는 반드시 상수여야 한다.
	   2. static 키워드가 있는 필드만 선언 가능하다.
	   3. 필드에서 final, static 키워드 생략이 가능하다.
	   4. 추상메소드만 가질 수 있다.
	   5. 추상 메소드 선언할 때 abstract 키워드 생략이 가능하다.
	 */
	
	// 1. 필드
	int num = 0;
	
	// 2. 메소드
	public void temp();
	
	// java 7 버전 이후
	// default, static 키워드 사용해서 일반 메소드 (중괄호 있는 거) 선언 가능
	static void temp2() {
		
	}
	
	
	
	
	

}
