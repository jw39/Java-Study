package 월급관리프로그램;

public abstract class Employee {

	// 사번
	protected String empno;
	// 이름
	protected String name;
	
	// 생성자 (기본 생성자 아님!! 기본 생성자는 매개 변수가 없음)
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	// 연봉
	protected int pay;
	
	// 추상 메소드
	public abstract int getMoneyPay();
	
	public String print() {
		return empno + ":" + name + ":" + pay;
	}
	
	
	
	
	

}
