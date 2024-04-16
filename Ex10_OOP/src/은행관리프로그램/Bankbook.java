package 은행관리프로그램;

public class Bankbook {
	
	// 은행관리 프로그램을 만든다고 가정!
	// 통장을 관리할 수 있는 우리만의 자료형을 만든다! --> 설계도를 만든다.
	
	// 1. Field (데이터, 속성)
	// 잔액 (money)
	private int money;
	// 정보 은닉을 지켜줘야 한다! (사용자가 임의로 변경하는 것을 막기 위해서!)
	// 값을 바꿀 거면 메소드만 사용하거라 녀석아
	// private: 이 클래스 안에서만 사용 가능한 것
	
	// 2. Method (Logic, 행위, 기능)
	// 입금하다 (deposit)
	public void deposit(int money) {
		this.money += money;
		// this : 현재 이 클래스를 가리키는 키워드
	}
	
	// 출금하다 (withdraw)
	// return 없음 (void 사용)
	// 매개변수로 정수형 하나 받아서 현재 잔액에서 빼주는 메소드 작성
	public void withdraw(int money) {
		this.money -= money;
	}
	
	// 잔액 확인하기 (showMoney)
	// return 있음
	// 매개변수 X, 현재 잔액을 리턴하는 메소드 작성
	public int showMoney() {
		return money;
	}
	
	
	

}
