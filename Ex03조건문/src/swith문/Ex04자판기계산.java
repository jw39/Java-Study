package swith문;

import java.util.Scanner;

public class Ex04자판기계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// // 0322 switch문 /if문
		
		//1. 자판기 메뉴를 선택하고 잔돈 or 금액 부족 출력문
		Scanner sc = new Scanner(System.in);
		System.out.print("넣을 금액: ");		
		int money = sc.nextInt();			// 금액 저장
		
		System.out.println("--메뉴--");		//꾸미기 멘트
		System.out.print("1. 콜라(1800) 2. 파워에이드(2000) 탄산수(1200) >> "); 	//switch를 이용할 예정
		int menu = sc.nextInt();			//메뉴 숫자 저장
		
		int change = 0;						//
		
		if(menu==1) {
			change = (money-1800);
		} else if (menu==2) {
			change = (money-2000);
		} else {
			change = (money-1200);
		}
		
		if (change<0) {
			System.out.println("잔액이 부족합니다");
		} else {
			System.out.println("잔돈: " + change);
			System.out.println("천원: " + (change/1000));
			System.out.println("오백원: " + ((change/1000)/500));
			System.out.println("백원: " + (change%1000)/100);
		}
		
		
			
		
		
//		switch(menu) {						//메뉴1이나 메뉴2나 메뉴3일 때
//		case 1:
//			if(money>=1800) {									//만약 입력된 돈이 1800보다 높거나 같다면
//				System.out.println("잔돈: " + (money-1800));		//나는 입력받은 돈에서 콜라의 가격(1800)을 뺀 값을 출력할 거야
//			}else {												//1800보다 적은 돈이 입력되었다면
//				System.out.println("돈이 부족해요ㅜ");				//돈이 부족하다는 문구를 출력할 거야
//			}	
//			break;
//			
//		case 2:													//나는 메뉴2인 파워에이드를 선택했어
//			if(money>=2000) {									//만약 입력된 돈이 2000보다 높거나 같다면
//				System.out.println("잔돈: " + (money-2800));		//나는 입력받은 돈에서 파워에이드의 가격(2000)을 뺀 값을 출력할 거야
//			} else {											//2000보다 적은 돈이 입력되었다면
//				System.out.println("돈이 부족해요");				//돈이 부족하다는 문구를 출력할 거야
//			}
//			break;
//			
//		case 3:													//나는 메뉴2인 파워에이드를 선택했어
//			if(money>=1000) {									//만약 입력된 돈이 1000보다 높거나 같다면
//				System.out.println("잔돈: " + (money-1200));		//나는 입력받은 돈에서 탄산수의 가격(1000)을 뺀 값을 출력할 거야
//			} else {											//1000보다 적은 돈이 입력되었다면
//				System.out.println("돈이 부족해요");				//돈이 부족하다는 문구를 출력할 거야
//			}
//			break;
//			
//		default:												//메뉴 1,2,3 외에 입력 받았다면
//			System.out.println("없는 메뉴입니다.");					//없는 메뉴라고 출력해줄거야
//		
//		}
		

		
		sc.close();

	}

}
