package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02회원관리 {

	public static void main(String[] args) {
		// 디자인 패턴

		DAO dao = new DAO();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]회원 전체조회 [4]회원 정보수정 [5]회원삭제 [6]프로그램 종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 로그인

				try {
					System.out.print("로그인 할 ID 입력 >> ");
					String inputId = sc.next();
					System.out.print("로그인 할 PW 입력 >> ");
					String inputPw = sc.next();

					// 1. db 연결
					dao.conn();

					// 2. 로그인 쿼리문 실행
					// select name from datamember where id = ? and pw = ?
					// 000님 환영합니다

					String name = dao.loginUser(inputId, inputPw);
					// name == "" : 로그인 실패
					// name != "" : 로그인 성공

					if (name.equals("")) {
						System.out.println("로그인 실패 ㅠㅠ");
					} else {
						System.out.println("로그인 성공 !!");
						System.out.println(name + "님 환영합니다 ♡♡♡");
					}

				} catch (Exception e) {

				}

				// 3. db 닫기
				finally {
					dao.dbClose();
				}

			} else if (menu == 2) {
				// 회원 가입
				// ex01 join 그대로 긁어온 거임
				try {
					System.out.print("ID 입력 : ");
					String id = sc.next();
					System.out.print("PW 입력 : ");
					String pw = sc.next();
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("나이 입력 : ");
					int age = sc.nextInt();

					dao.conn();

					int row = dao.insertUser(id, pw, name, age);

					if (row > 0) {
						System.out.println("회원가입 성공! ^^");
					} else {
						System.out.println("회원가입 실패 ㅠㅠ");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					dao.dbClose();
				}

			} else if (menu == 3) {

				// 회원 전체 조회
				// 1. DAO가 가지고 있는 searchMember 사용하기
				// 2. 결과값을 출력하기
				ArrayList<DTO> resultList = dao.searchMember();
				System.out.println("아이디\t이름\t나이");
				for (DTO d : resultList) {
					System.out.print(d.getId() + "\t" + d.getName() + "\t" + d.getAge());
					System.out.println();
				}

			} else if (menu == 4) {

				System.out.print("회원 아이디: ");
				String inputId = sc.next();
				System.out.print("수정할 이름: ");
				String inputName = sc.next();

				try {
					dao.conn();

					// 2. 통로 안에 쿼리문을 실행시키기
					int row = dao.updateUser(inputName, inputId);

					if (row > 0) {
						System.out.println("정보 수정 성공! ^^");
					} else {
						System.out.println("정보 수정 실패 ㅠㅠ");
					}
				} catch (Exception e) {
					e.printStackTrace();

					// 3. 연결정보 닫아주기
				} finally {
					dao.dbClose();
				}

			} else if (menu == 5) {
				// 회원 삭제
				// 어느 회원을 삭제할지 id 값 입력 받기
				// 1. java와 db 연결
				// 2. java와 db가 연결된 통로에 쿼리문을 올려서 실행

				System.out.print("삭제할 회원 아이디: ");
				String inputId = sc.next();

				try {
					// 2. 통로 안에 쿼리문을 실행시키기
					dao.conn();

					// dao.deleteUser를 위에서 입력 받은 inputId 인자값을 넣어 메소드 실행
					int row = dao.deleteUser(inputId);
					if (row > 0) {
						System.out.println("회원 삭제 성공! ^^");
					} else {
						System.out.println("회원 삭제 실패 ㅠㅠ");
					}
				} catch (Exception e) {
					e.printStackTrace();

					// 3. 연결정보 닫아주기
				} finally {
					dao.dbClose();
				}

			} else if (menu == 6) {
				// 프로그램 종료
				break;

			}

		}

	}
}
