package 물건관리;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("물건 개수 입력: ");
		int input = sc.nextInt();

		Product[] p = new Product[input];

		for (int i = 0; i < p.length; i++) {
			System.out.print(i + 1 + ") 물건 이름 : ");
			String name = sc.next();
			System.out.print(i + 1 + ") 물건 단가 : ");
			int dan = sc.nextInt();
			System.out.print(i + 1 + ") 물건 수량 : ");
			int su = sc.nextInt();
			System.out.println();
			p[i] = new Product(name, dan, su);
		}

		System.out.println("제품명" + "\t" + "단가" + "\t" + "수량");

		int total = 0; // 총 금액 저장할 변수 -> 각 상품에 대한 총금액(단가 * 수량) 누적 
		// 기본 for 문 버전
//		for (int i = 0; i < p.length; i++) {
//			System.out.println(p[i].getName() + "\t" + p[i].getUnitPrice() + "원 \t" + p[i].getAmount() + "개");
//			total += p[i].getAmount() * p[i].getUnitPrice();
//		}
//		System.out.println("총 금액 : " + total + "원");

		// for each 문 버젼
		for (Product pro : p) {
			System.out.println(pro.getName() + "\t" + pro.getUnitPrice() + "원\t" + pro.getAmount() + "개");
			total += pro.getAmount()*pro.getUnitPrice();
		}
		System.out.println("총 금액 : " + total + "원");
		
		sc.close();

	}

}
