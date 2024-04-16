package ifelse문;

import java.util.Scanner;

public class Ex01ifelse문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 ifelse문예제
		
		// 1. int 타입의 변수 grade를 선언하고 입력받기.
		// grade가 60점 이상이면 "합격입니다", 그렇지 않다면 "불합격입니다" 문구 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("접수를 입력하세요: ");
		int grade = sc.nextInt();
		
		if (grade >= 60){
			System.out.println("합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}
		
		sc.close();

	}

}
