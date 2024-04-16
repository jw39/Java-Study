package swith문;

import java.util.Scanner;

public class Ex04자판기계산_답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0322 else if 문

		//1-1. 자판기 메뉴를 선택하고 잔돈(잔돈의 금액, 천원, 오백원, 백원) or 잔액부족 출력문
		Scanner sc = new Scanner(System.in);
		System.out.print("넣을 금액: ");
		int inputM = sc.nextInt();

		System.out.println("==menu==");
		System.out.print("1. 콜라(1800) 2. 파워에이드(2000) 탄산수(1200) >> ");
		int menu = sc.nextInt();

		int change = 0; // 계산할 잔돈을 저장할 변수

		if (menu == 1) {
			change = inputM - 1800;
		} else if (menu == 1) {
			change = inputM - 1800;
		} else {
			change = inputM - 1000;
		}
		
		//switch 사용 했을 경우
//		switch(menu) {
//		case 1:
//			change = inputM - 1800;
//			break;
//		}

		if (change < 0) {
			System.out.println("잔액부족");
		} else {
			System.out.println("잔돈: " + change); // 나는 입력받은 돈에서 콜라의 가격(1800)을 뺀 값을 출력할 거야
			System.out.println("천원: " + (change / 1000));
			System.out.println("오백원: " + (change / 1000) / 500);
			System.out.println("백원: " + ((change % 500) / 100));
		}
		
		sc.close();

	}
}
