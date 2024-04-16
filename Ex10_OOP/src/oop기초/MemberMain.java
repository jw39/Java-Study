package oop기초;

public class MemberMain {
	// 실행할 수 있는 공간!!
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 클래스 설계 도면을 기반으로 객체를 생성
		// 객체를 생성할 때 -> 자료형(메소드 클래스 이름) 변수명 = new 자료형();
		Member m1 = new Member();
		System.out.println(m1.getName());
		// 레퍼런스 타입의 기본은 null 이라 데이터 안 넣었을 때 출력하면 null 이 나온다.
		// field 에 아무런 값도 넣지 않았을 때는 기본값이 세팅된다.
		// string --> null
		// int    --> 0
		
		// field 에 값 넣기, 변수명.field = 값;
//		m1.name = "최지원";
//		m1.age = 24;
//		m1.id = "akdlwb1212";
		m1.setName("최지원");
		m1.setAge(24);
		m1.setId("akdlwb1212");
		
		System.out.println(m1.getName());
		System.out.println(m1.getAge());
		System.out.println(m1.getId());
		
		
		// 하나의 설계도로 여러 개의 객체가 생성 가능!
		// 여러분 옆자리 친구의 정보를 저장하는 
		// m2 라는 이름의 객체를 생성, 안에 저장된 데이터로 모두 출력
		
		
		Member m2 = new Member();
		
//		m2.name = "오세원";
//		m2.age = 24;
//		m2.id = "5won";
		m2.setName("오세원");
		m2.setAge(24);
		m2.setId("5won");
		
		System.out.println(m2.getName());
		System.out.println(m2.getAge());
		System.out.println(m2.getId());
		
		m1.kakaoTalk("여러분 안냥!");
		
		
		
		// 객체 생성과 동시에 필드를 초기화하는 방법
		// 이름: 정연희 나이: 20 아이디: smhrd
		Member m3 = new Member("정연희", 20, "smhrd");
		System.out.println(m3.getName());
		System.out.println(m3.getAge());
		System.out.println(m3.getId());
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
