package jdbc기초;

import java.util.ArrayList;

public class DTO {
	// Data Transfer Object : 데이터를 이동할 수 있게 하는 나만의 자료형
	// 데이터 변환 객체
	// 주로 데이터베이스의 컬럼을 필드로 가진다!! 보통 테이블마다 한개씩 만든다!!
	
	// 1. 필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 2. 메소드
	public DTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
