package 물건관리;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("물건 개수 입력: ");
		int input = sc.nextInt();

		ArrayList<Product> p = new ArrayList<Product>();

		for (int i = 0; i < input; i++) {
			System.out.print(i + 1 + ") 물건 이름 : ");
			String name = sc.next();
			System.out.print(i + 1 + ") 단가 : ");
			int dan = sc.nextInt();
			System.out.print(i + 1 + ") 수량 : ");
			int su = sc.nextInt();
			System.out.println();

			p.add(new Product(name, dan, su));
		}

		System.out.println("제품명" + "\t" + "단가" + "\t" + "수량");

		int total = 0;
		for (Product pro : p) {
			System.out.println(pro.getName() + "\t" + pro.getUnitPrice() + "원 \t" + pro.getAmount() + "개");
			total += pro.getAmount() * pro.getUnitPrice();
		}
		System.out.println("총 금액 : " + total);
		
		sc.close();

	}

}
