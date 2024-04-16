package 객체배열;

import java.util.Scanner;

public class StuScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 세 칸짜리 arr 이라는 이름의 배열 생성
		StuScore[] arr = new StuScore[3];

		// for 문 이용해서 3번째 학생의 점수 물어보기
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요 >> ");
			String name = sc.next();
			System.out.print((i + 1) + "번째 학생의 Java 점수를 입력하세요 >> ");
			int javascore = sc.nextInt();
			System.out.print((i + 1) + "번째 학생의 Web 점수를 입력하세요 >> ");
			int webscore = sc.nextInt();
			System.out.print((i + 1) + "번째 학생의 Android 점수를 입력하세요 >> ");
			int androidscore = sc.nextInt();

			// 객체 생성, arr 0,1,2 번 방에 객체 참조 값을 배열에 저장, StuScore 생성자 메소드를 사용한 것.
			arr[i] = new StuScore(name, javascore, webscore, androidscore);
		}
		//  (자료형 변수명 : 배열)
		for (StuScore s : arr) {
			// StuScore의 변수 이름 s 는 arr[i]랑 같은 의미
			int total = s.getScoreJava() + s.getScoreWeb() + s.getScoreAndroid();
			int avg = total / 3;

			System.out.println(s.getName() + "님의 총점은 " + total + ", 평균은 " + avg + "점 입니다.");

		}
		// for문으로 돌리면 이렇게,,
//		int total = arr[i].getScoreJava()+arr[i].getScoreWeb()+arr[i].getScoreAndroid();
//		int avg = total/3;
		
		sc.close();

	

	}

}
