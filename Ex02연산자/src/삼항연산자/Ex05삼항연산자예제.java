package 삼항연산자;

import java.util.Scanner;

public class Ex05삼항연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 삼항연산자예제
		
		//4. 시급계산기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노동시간을 입력하세요: ");
		int hour = sc.nextInt();
		
		// double pay = (hour > 8)?hour*(9000)+(9000*1.5) : hour*9000;
		double pay = (hour>8)?(9000*8)+(hour-8)*9000*1.5 : 9000*hour;
		System.out.println("총 임금은 " + (int)pay + "원 입니다.");
		
		sc.close();


	}

}
