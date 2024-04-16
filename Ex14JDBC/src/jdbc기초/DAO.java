package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	// DAO : Data Access Object
	// DB에 관련된 기능들을 전부 가지고 있는 클래스

	Connection conn = null;
	PreparedStatement psmt = null;

	// DB 연결하는 부분
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			String user = "hr";

			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// DB랑 연결되는 통로와 수레 닫기
	public void dbClose() {
		try {
			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// [1]로그인, 로그인 기능
	public String loginUser (String inputId, String inputPw) {
		String sql = "select age, name from datamember where id = ? and pw = ?";

		// executeQuery()의 결과를 rs에 담기 위해 초기화 시켜줌
		ResultSet rs = null;
		// ResultSet은 executeQuery()의 반환 타입임
		
		String name = "";	// 리턴값 초기화
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputId);
			psmt.setString(2, inputPw);

			// executeQuery()는 쿼리문을 통해서 테이블에 있는 데이터에 영향을 끼치지 않을 때 사용 되어진다.
			rs = psmt.executeQuery();
			// 이거만 하면 name 컬럼의 데이터, 즉 테이블까지 가져오게 됨!, name 안의 데이터까지...

			// 1. 테이블 말고 데이터만 가져오기 위한 작업!!
			// ★★★★★★ rs.next() : 다음 행에 데이터가 있는지 확인하는 기능! ★★★★★★
			if (rs.next()) {	// 다음 행에 데이터가 있으면 true로 조건 만족
				name = rs.getString(2);
				// rs.getString(1) : 결과 데이터 중 첫번째 컬럼에 있는 데이터를 문자열로 받아오겠습니다
				// 괄호 안의 숫자는 string 타입의 몇 번째 컬럼의 데이터를 가져오겠다
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return name;

	}

	// [2]회원가입 , 회원 가입 기능
	public int insertUser(String id, String pw, String name, int age) {

		String sql = "INSERT INTO DATAMEMBER VALUES(?, ?, ?, ?)";
		int row = 0;

		try {
			// 현재 이 작업이 자바 뿐만 아니라 외부에서도 하니까 그 작업은 확정지을 수 없어서 뭘 할지 모르니까 try catch 문 사용
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;

	}
	
	
	// [3]회원 전체조회, 전체 회원 조회
	public void searchMember() {

		String sql = "select * from datamember";
		ResultSet rs = null; // ResultSet: select 절을 통한 테이블 형식 데이터를 받아올 수 있는 타입
		
		// 사용자 정보 전부 EX02 회원관리로 넘기기
		// 힌트 1. arrayList 사용
		// 힌트 2. id, pw, name, age를 다룰 수 있는 class 생성

		// 쿼리문 실행
		try {
			psmt = conn.prepareCall(sql);
			rs = psmt.executeQuery();

			
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);

				System.out.println("ID: " + id + "PW: " + pw + "NAME: " + name + "AGE: " + age);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	// [4]회원 정보수정, 회원 정보 수정
	public int updateUser(String inputName, String inputId) {

		String sql = "UPDATE DATAMEMBER SET NAME = ? WHERE ID = ?";

		int row = 0;

		try {
			// 현재 이 작업이 자바 뿐만 아니라 외부에서도 하니까 그 작업은 확정지을 수 없어서 뭘 할지 모르니까 try catch 문 사용
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputName);
			psmt.setString(2, inputId);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;

	}

	
	// [5]회원삭제, 삭제 기능
	public int deleteUser(String inputId) {
		String sql = "delete from datamember where id = ?";

		int row = 0;

		try {
			// 현재 이 작업이 자바 뿐만 아니라 외부에서도 하니까 그 작업은 확정지을 수 없어서 뭘 할지 모르니까 try catch 문 사용
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputId);
			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;

	}

}
