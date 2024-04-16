package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class StuScoreMain2 {

	public static void main(String[] args) {
		// ArrayList 사용법

		Scanner sc = new Scanner(System.in);

		// StdScore 자료형을 보관할 수 있는 sList라는 이름의 ArrayList 생성
		// 사용법: ArrayList<자료형> 변수명 = new ArrayList<자료형>();
		ArrayList<StuScore> sList = new ArrayList<StuScore>();

		// for 문 이용해서 3번째 학생의 점수 물어보기
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요 >> ");
			String name = sc.next();
			System.out.print((i + 1) + "번째 학생의 Java 점수를 입력하세요 >> ");
			int javascore = sc.nextInt();
			System.out.print((i + 1) + "번째 학생의 Web 점수를 입력하세요 >> ");
			int webscore = sc.nextInt();
			System.out.print((i + 1) + "번째 학생의 Android 점수를 입력하세요 >> ");
			int androidscore = sc.nextInt();

//			// 객체 생성, arr 0,1,2 번 방에 객체 참조 값을 배열에 저장, StuScore 생성자 메소드를 사용한 것.
//			 new StuScore(name, javascore, webscore, androidscore);
			 
			sList.add(new StuScore(name, javascore, webscore, androidscore));
			// sList라는 어레이 리스트에 StuScore를 담은 것
			
			 
		}
		
		// 출력부
		for (StuScore s : sList) {
			int total = s.getScoreJava() + s.getScoreWeb() + s.getScoreAndroid();
			int avg = total / 3;

			System.out.println(s.getName() + "님의 총점은 " + total + ", 평균은 " + avg + "점 입니다.");

		}
		
		sc.close();


	}

}
