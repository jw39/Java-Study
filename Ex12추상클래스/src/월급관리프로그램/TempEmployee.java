package 월급관리프로그램;

public class TempEmployee extends Employee{
	
	// 생성자 메소드
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}
	
	// 월급여 계산 후 리턴
	public int getMoneyPay() {
		return pay/12;
	}
	
	

}
