package 닌텐도게임;

public abstract class GameChip {
	// 닌텐도에 들어갈 수 있는 게임의 공통의 부모 클래스
	// 1. 추상 클래스
	// - 추상메소드르르 하나라도 가지고 있다면 반드시 추상클래스가 되어야 한다.
	// - abstract 키워드를 사용해서 선언한다.
	// - 추상 클래스도 일반 메소드를 가지고 있을 수 있다.
	
	public abstract void run();
	// 중괄호 부분을 없애고 추상화 진행 --> 2. 추상 메소드
	// - {} 가 없는 메소드
	// - 선언(틀 : 리턴 타입, 매개변수, 메소드명)은 되어 있으나 로직이 구현되어 있지 않은 메소드
	// abstract 키워드를 사용해서 선언한다.
	
	public void test() {
		System.out.println("test용 메소드");
	}



}
