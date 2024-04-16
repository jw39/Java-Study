package 은행관리프로그램;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. BankBook 설계도를 기반으로 bank1 객체 생성
		// 객체를 생성할 때 -> 자료형(메소드 클래스 이름) 변수명 = new 자료형();
		Bankbook bank1 = new Bankbook();

		// 2. 입금 금액 받기
		// deposit 메소드를 이용해 현재 잔액에서 입력한 금액 입금
		System.out.print("입금할 금액 입력 >> ");
		int input = sc.nextInt();
		
		// 2-2. 입력 받은 금액 deposit 메소드 이용
		bank1.deposit(input);
		
		// 현재 금액 출력 코드
		System.out.println("현재 잔액 : " + bank1.showMoney() + "원");

		// 3. withdraw 메소드를 이용해 현재 잔액에서 입력한 금액 출금하기
		System.out.print("출금할 금액 입력 >> ");
		input = sc.nextInt();
		
		// 3-3. 입력 받은 금액 withdraw 메소드 이용해 출금
		bank1.withdraw(input);

		// 현재 금액 출력 코드
		System.out.println("현재 잔액 : " + bank1.showMoney() + "원");
		
		sc.close();

	}

}
