package 삼항연산자;

import java.util.Scanner;

public class Ex04삼항연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 삼항연산자예제
		
		// 3. 농구공을 담기 위해 필요한 상자의 개수를 구하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요: ");
		int ball = sc.nextInt();
		
		int box = (ball%5==0)?ball/5:ball/5+1;
		System.out.print("필요한 상자의 개수:" + box);
		
		//3-1. 다른 답안
//		int box = (ball%5>0)?ball/5+1 : ball/5;
//		System.out.print("필요한 상자의 개수:" + box);
		
		sc.close();

	}

}
