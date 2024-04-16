package 다중ifesle문;

import java.util.Scanner;

public class Ex03버스요금계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0322 다중ifelse
		
		//1. 버스카드 잔액 확인 후 성인->감사합니다, 청소년->반갑습니다, 어린이->안녕하세요 출력
		// 잔액이 부족하면 잔액이 부족합니다 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("잔액: ");
		int pay = sc.nextInt();						//잔액 입력받기

		System.out.print("성인/청소년/어린이: ");
		String human = sc.next();					//성인인지 청소년인지 어린이인지 입력받기
		
		if(human.equals("성인")) {					//만약 성인이면
			if(pay>=1800) {							//잔액이 1800원보다 높거나 같으면
				System.out.println("감사합니다");		//감사합니다
			}else {									
				System.out.println("잔액이 부족합니다"); //아니면 잔액 부족
			}										// 만약 둘 다 해당이 되지 않는다면 다음 elseif문으로 넘어가기
			
		} else if(human.equals("청소년")) {			//다음, 만약 청소년이면
			if(pay>=1500) {							//잔액이 1500원보다 높거나 같으면
				System.out.println("반갑습니다");		// 반갑습니다 출력
			}else {									//아니라면
				System.out.println("잔액이 부족합니다"); // 잔액부족 멘트 출력
				}									//만약 둘 다 해당이 되지 않는다면 다음 elseif문으로 넘어가기
			
		} else if (human.equals("어린이")) {			// 다음, 만약 어린이면
				if(pay>= 1000) {					//잔액이 1000원보다 높거나 같으면
					System.out.println("안녕하세요");	// 안녕하세요 출력
				}else {								//아니라면
					System.out.println("잔액이 부족합니다"); // 잔액부족 멘트 출력
			}
		}
		
		sc.close();
		
		//		String teen = sc.next();
		//		String kid = sc.next();

		//		if ((pay>=1800)&&(human.equals("성인"))) {
		//			System.out.println("감사합니다");
		//		} else if((pay >=1500)&& (human.equals("청소년"))) {
		//			System.out.println("반갑습니다");
		//		} else if((pay>=1000)&&human.equals("어린이")) {
		//			System.out.println("안녕하세요");
		//		} else {
		//			System.out.println("잔액이 부족합니다");
		//		}
		//		
		//		


		//		if (pay>=1800) {
		//			if(human.equals("성인")) {
		//				System.out.println("감사합니다");
		//			}else {
		//				System.out.println("잔액이 부족합니다");
		//			}
		//			if(pay>=1500) {
		//				if(human.equals("청소년")) {
		//					System.out.println("반갑습니다");
		//				} else {
		//					System.out.println("잔액이 부족합니다");
		//				}
		//				if(pay>=1000) {
		//					if(human.equals("어린이")) {
		//						System.out.println("안녕하세요");
		//					} else {
		//						System.out.println("잔액이 부족합니다");
		//					}
		//				}
		//			}
		//		}



		//		if(pay >= 5000) {
		//			if(human.equals("성인")) {
		//				System.out.println("감사합니다");
		//			} else if (human.equals("청소년")) {
		//				System.out.println("반갑습니다");
		//			} else if (human.equals("어린이")) {
		//				System.out.println("안녕하세요");
		//			} 
		//		} else {
		//			System.out.println("잔액이 부족합니다");
		//		}



		

//
//		if(human.equals("성인")) {
//			if(pay>=1800) {
//				System.out.println("감사합니다");
//			}else {
//				System.out.println("잔액이 부족합니다");
//			}
//		} else if(human.equals("청소년")) {
//			if(pay>=1500) {
//				System.out.println("반갑습니다");
//			}else {
//				System.out.println("잔액이 부족합니다");
//			}
//		} else if(human.equals("어린이")) {
//			if (pay>=1000) {
//				System.out.println("감사합니다");
//			} else {
//				System.out.println("잔액이 부족합니다");
//			}
//		}
		
		
		














		}

	}
