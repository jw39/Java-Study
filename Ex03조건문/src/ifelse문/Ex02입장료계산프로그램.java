package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 입장료계산프로그램
		
		//1. 에버랜드 입장료 계산, 기본료 5000원, 20세 미만은 50% 할인
		System.out.println("===에버랜드에 오신 걸 환영합니다!===");
		
		Scanner sc = new Scanner(System.in);
		
		
		//2500, 5000으로 곱한 결과, 내가 한 결과물
//		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();
//				
//		System.out.print("인원수를 입력하세요: ");
//		int num = sc.nextInt();
//		
//		if(age < 20) {
//			int pay1= num*2500;
//			System.out.println("총 " + pay1 + "입니다");
//		} else{
//			int pay2 = num*5000;
//			System.out.println("총 " + pay2 + "입니다");
//		}
//		
		
		// 지역변수 사용한 입력문
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
				
		System.out.print("인원수를 입력하세요: ");
		int num = sc.nextInt();
		
		// ★★★★지역변수 (local variable)★★★★
		// : {} 영역 안에서 선언된 변수는 {}영역 안에서만 사용 가능하다
		// ----> {} : scope
		int pay= 0;			//새로운 변수 선언, 0으로 초기화
		
		if(age < 20) {
			pay=num*(int)(5000*num*0.5);
		} else {
			pay=num*5000;
		}
		
		System.out.println("총" + pay + "입니다");
		
		
		
		
		// 0.5를 곱한 결과
//		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();
//				
//		System.out.print("인원수를 입력하세요: ");
//		int num = sc.nextInt();
//		
//		if(age < 20) {
//			int pay1= (int) (num*5000*0.5);		//double 타입을 int로 강제 형 변환
//			System.out.println("총 " + pay1 + "입니다");
//		} else{
//			int pay2 = num*5000;
//			System.out.println("총 " + pay2 + "입니다");
//		}
//		
		
	
		// 입장료까지 입력받은 결과
//		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();
//				
//		System.out.print("인원수를 입력하세요: ");
//		int num = sc.nextInt();
//		
//		System.out.print("입장권 가격을 입력하세요: ");
//		int pay3 = sc.nextInt();
//		
//		if(age < 20) {
//			double pay1= num*(pay3*0.5);
//			System.out.println("총 " +(int) pay1 + "입니다");
//		} else{
//			int pay2 = num*5000;
//			System.out.println("총 " + pay2 + "입니다");
//		}
//		
		sc.close();
		

	}

}
