package jdbc기초;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 사용자 입출력 구간
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		// JDBC (Java DataBase connectivity)
		// : JDBC 인터페이스 사용

		// 1. 드라이버 로딩
		// JDBC 드라이버란?
		// : Java 에서 제공해주는 인터페이스들을 데이터 베이스 회사에서
		// 상속 받아서 로직을 구현한 클래스 파일들의 모음

		/*
		 * jar 파일 등록 방법 프로젝트 우클릭 -> build path -> configure build path -> libraries 탭 선택
		 * -> class path -> 우측에 add external jars 버튼 선택 -> 원하는 jars 파일 경로 찾아서 선택 ->
		 * apply and close
		 */
		PreparedStatement psmt = null; // 78번 줄 확인
		Connection conn = null; // 56번 줄 확인
		try {
			// ★★★★ 오라클 클래스에 접속,, 드라이버 로딩하는 구문★★★★
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// --> 반드시 프로젝트에 jar 파일 넣어주기

			// 2. ★★데이터 베이스 연결★★
			// 준비물 3가지 필요!
			// 1) 연결 경로	 // 드라이버 버젼 @ 데이터베이스 주소
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 2) user name
			String user = "hr";
			// 3) user pass word
			String password = "12345";

			// ★★★★DB에 연결하는 코드★★★★ 통로같은 거임, 이 통로를 Connection 자료형의 conn이라는 변수에 담았다
			// 이 구문도 try catch 에 사용한 구문임! 헷갈리지 마삼 --;
			// Connection conn = DriverManager.getConnection(url, user, password); 이것도 지역변수라 사용 못해서 전역 변수로 바꿔줌
			conn = DriverManager.getConnection(url, user, password);
			// Connection 이란?
			// : 데이터베이스에 접속하기 위한 모든 메소드를 가진 인터페이스
			// --> 앞으로 디비와 하는 모든 통신은 conn을 통해서만 이루어질 예정!
			
			// DB 연결에 성공/실패 판별
			// 레퍼런스 자료형은 기본이 null이니까 null이냐 아니냐를 판별한다. null이 아니면 DB 연결에 성공한 거임
			if(conn != null) {
				System.out.println("DB 연결 성공!!");
			} else {
				System.out.println("DB 연결 실패 ㅜㅜ");
			}
			
			
			// 3. Query 문 (SQL구문) 전송
			// 3-1) SQL문 작성
			String sql = "INSERT INTO DATAMEMBER VALUES(?, ?, ?, ?)";
			// ? 인지
			// : 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
			// : 지정한 데이터 공간만큼 비워놓고 실행하기 전까지 대기...자리는 만들어두는데 뭐가 들어올지 모를 때 ? 인자 사용
			
			//PreparedStatement psmt = conn.prepareStatement(sql);	이거 파이널할 때 지역 변수라 사용 못 해서 전역 변수로 바꿔줌
			psmt = conn.prepareStatement(sql);	
			// 수레의 이름 = 통로.수레(쿼리문)
			// sql --> Java에서 인식 가능한 쿼리문
			// conn. conn.prepareStatement(sql) ==> db에서도 인식 가능하게끔 바꿔서 통로에 올려주겠다
			
			// ? 인자 채우는 작업 (반드시 쿼리문 실행 전에 할 것!)
			// 데이터 바인딩 작업
			// psmt는 물음표를 채우는 메소드를 가지고 있음, setString의 매개변수는 (?의 인덱스 번호(1부터~), 채울 변수) 적기
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			
			// 4. SQL문 실행
			int row = psmt.executeUpdate(); // --> ★★★실행시키는 코드★★★ 리턴 타입은 int다. why? 
			// insert는 행 추가이고 결과 값으로 1 행 추가가 됐습니다~~ 할 때 행 결과가 숫자니께..
			// executeUpdate() : insert, delete, update 쓸 때만 사용한다
			
			// 5. 결과를 일용한 작업 처리
			// : 사용자에게 회원가입에 성공했는지 실패했는지 보여주는 작업
			if(row > 0) {
				System.out.println("회원가입 성공! ^^");
			} else {
				System.out.println("회원가입 실패 ㅠㅠ");
			}

		} catch (Exception e) {  
			// 모든 예외상황 Exception 을 상속 받아 굳이 catch 두 개 안 쓰고 한 번에 짝짝 에러 잡아준다!!
			// --> Exception e = new classNotFoundException(); (업캐스팅)
			// --> Exception e = new SQLException(); (업캐스팅)
			e.printStackTrace();
			// 예외상황이 왜 발생했고, 어디서 문제가 났는지 출력해주는 코드
			// --> 개발할 때 사용, 배포할 때는 삭제하는게 좋다!
		} finally {
			// 위 쪽에서 예외 상황이 발생하더라도 반드시 한 번은 들어오는 구간
			// 6. DB 연결 종료 --> 자원 반납
			// ★★★자원 반납은 항상 사용한 순서의 반대로 반납한다.★★★
			try {
				if(psmt != null)	//psmt가 수레인데 이놈이 null이 아니면 성공이 잘 된 거 자너 긍께 그럴 때만 psmt를 닫겠다 이거지
					psmt.close();
				
				if(conn != null)	// conn도 통로가 null이 아니면 성공이 잘 된거니께 .. 그럴 때만 닫겠다.
					conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
