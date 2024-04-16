package ex01상속기초;

public class Child  extends Parent{
	
	// 자식 클래스, 새로운 클래스, 서브 클래스
	// extends 키워드 사용 -> 연장하다, 확장하다의 의미
	// class를 선언하는 구간에 적어준다!
	
	/**
	 * 주먹밥을 만드는 메소드
	 * @author ji won
	 * @since 24.04.12
	 * @param 매개변수 없음
	 * @return 리턴타입 없음, void
	 * */
	public void makeBap() {
		System.out.println("동글동글 주먹밥을 만든다!!");
	}
	
	// 메소드 오버라이딩 (method overriding)
	// : 상속이 전제되어 있어야 한다!
	// : 부모 클래스의 메소드 틀 (리턴 타입, 메소드 명, 매개변수)을 그대로 가지고 와서
	// : { } 안 쪽의 로직만 ★★★재정의★★★ 하는 기법
	@Override	// 주석의 일부
	public void makeEgg() {
		System.out.println("파기름으로 반숙 계란 후라이를 만든다!!");
	} 
	// annotation(주석) --> 특정 기능을 가지고 있는 것은 아님!!
	
	
	
	

}
