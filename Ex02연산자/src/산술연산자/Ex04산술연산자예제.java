package 산술연산자;

import java.util.Scanner;

public class Ex04산술연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 입력받은 수 시분초 출력 예진쌤 수업 테스트
		
		Scanner sc= new Scanner(System.in);
		System.out.print("초 입력: ");
		int num = sc.nextInt();
		
//		int hour = num/3600;
//		int min = num/1800;
//		int sec = num%60;
		
		int hour = (num/60)/60;
		int min = (num/60)%60;
		int sec = num%60;
		
//		예진쌤 풀이
//		int hour = num/3600;
//		int min = (num%3600)/60;
//		int sec = (num%3600)%60;
		
		System.out.println(hour + "시 " + min + "분 " + sec + "초 ");
		
		sc.close();
	}

}
//