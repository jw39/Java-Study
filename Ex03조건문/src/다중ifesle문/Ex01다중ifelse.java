package 다중ifesle문;

import java.util.Scanner;

public class Ex01다중ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0322 다중ifelse
		
		//1. 점수 입력 후 해당 학점 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int input = sc.nextInt();
		
		if(input >= 90) {
			System.out.println("A학점");
		}else if(input>=80) {
			System.out.println("B학점");
		}else if (input>=70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();

	}

}
