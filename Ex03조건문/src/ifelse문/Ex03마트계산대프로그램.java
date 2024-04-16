package ifelse문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 지역변수, ifelse 마트계산대프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요: " );
		int buy = sc.nextInt();
		
		int pay = 0;  // 지불해야하는 가격
		int all = 0;  // 할인가를 구하기 위한, 할인 전 총 금액
		
		if(buy > 10) {
			all = buy*10000;
			pay = (int) (all - (all*0.1));
		}else {
			pay = buy*10000;
		}
		
		System.out.println("가격은 " + pay + "입니다");
		
		
		
//		//★★선생님 버젼 all을 안 쓰고 0.9를 곱하니 훨씬 깔끔함★★★
//		int pay = 0;  // 지불해야하는 가격
//		if(buy >= 11) {
//			pay = (int) (buy * 10000 * 0.9);
//		}else {
//			pay = buy * 10000;
//		}
//		
//		System.out.println("가격은 " + pay + "원 입니다");
//		
		
		
		sc.close();
		

	}

}
