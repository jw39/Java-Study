package 월급관리프로그램;

public class Main {

	public static void main(String[] args) {
		// 실행하는 공간
		RegularEmployee regular = new RegularEmployee("0001", "강예진", 5000, 500);
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay());

		TempEmployee temp = new TempEmployee("0002", "임경남", 4000);
		System.out.println(temp.print());

		PartTimeEmployee part = new PartTimeEmployee("0003", "이도연", 50, 20);
		System.out.println(part.print());
		
	}

}
