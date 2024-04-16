package 월급관리프로그램;

public class PartTimeEmployee extends Employee{
	
	// 일수
	private int workDay;	
	
	// 생성자
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	// 월급여 계산 후 리턴
	public int getMoneyPay() {
		return  pay*workDay;
	}
	

}
