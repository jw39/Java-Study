package ifelse문;

import java.util.Scanner;

public class Ex04정처기점수계산문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("소프트웨어 설계: ");
		int sw = sc.nextInt();
		System.out.print("소프트웨어 개발: ");
		int swg = sc.nextInt();
		System.out.print("데이터베이스 구축: ");
		int db = sc.nextInt();
		System.out.print("프로그래밍 언어 활용: ");
		int pro = sc.nextInt();
		System.out.print("정보시스템 구축 관리: ");
		int infor = sc.nextInt();

		//		if (sw > 8 && swg > 8 && db > 8 && pro > 8 && infor > 8) {
		//			if (sw + swg + db + pro + infor > 60) {
		//				System.out.println("합격입니다");
		//			} else {
		//				System.out.println("불합격입니다");
		//			}
		//		}
		//		System.out.println("8점 미만 불합격입니다.");
		
		// 8점은 넘지만 60점이 안될 때 불합격과 8점 미만이 다 출력됨
		
		
		/////////////////////////////////////////////////
		
		if(sw <=8 || swg <=8 || db <=8 || pro <=8 || infor <=8 || (sw+swg+db+pro+infor < 60)) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}
		
		//점수가 하나 8인데 합격 출력됨

	
		
		
		
		
		
		
	

		sc.close();

	}

}
