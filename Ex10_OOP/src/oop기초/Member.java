package oop기초;

public class Member {

	// 나만의 자료형 설계도!!
	// main method 포함 XXXX

	// OOP(Object Oriented Programming)

	// 1. field(Data, 속성)
	// 접근제한자: private, default, protected, public
	// private : 현재 클래스 안에서만 접근 가능
	// default : 같은 패캐지 안에서만 접근 가능
	// protected : 같은 패키지 안에 있거나 상속 관계에 있는 경우 접근 가능
	// public : 어디에서든 접근 가능 => 아무나 접근해서 값을 변경 혹은 사용할 수 있으니 조심
	// 접근제한자를 따로 작성하지 않으면 default
	// 이름
	private String name;
	// 나이
	private int age;
	// 아이디
	private String id;

	
	
	
	
	// 2. Method (logic, 행위, 기능)
	// + 필수 메서드 => 생성자(constructor)
	//접근 제한자 메서드 이름 (메서드 이름은 클래스 이름과 무조건 동일하게) (매개변수){필드 초기화 구문}
	// 객체 생성 시 사용하는 메서드
	public Member (String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//// 이거슨 생성자 오버로딩....................!
	
	// 매개변수가 들어가지 않고 로직이 따로 없는 구조 => 기본 생성자
	// 클래스 안에 생성자를 아무것도 작성하지 않았을 경우 컴파일 시 컴파일러가 자동으로 생성
	public Member () {
		
	}
	
	
	
	
	
	// prvate String name해서 접근 못하니까 getter 메서드 만든 거임
	// 이제 이걸로 이름이랑 나이랑 아이디를 main에서 정의 가능
	// 각 필드에 접근할 수 있는 메서드 (규칙) => getter 메서드
	// 필드 하나하나 따로 접근 가능 // 한 번에 세 개 가져올래 이런 건 안됨
	public String getName() {	// 반환 타입은 내가 가져올 필드의 자료형을 적기, get 붙여주지
		return name;
	}
	// alt + shift + s => getter, setter 부르는 단축키
	
	public int getAge() {
		return age;
	}
	
	public String getId() {
		return id;
	}
	
	
	
	
	
	// 각 필드에 저장된 값을 수정 or 초기화 하는 메서드
	// => setter 메서드
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
	
	
	
	// 카카오톡 메시지 보내기
	public void kakaoTalk(String msg) {
		System.out.println(name + "님이 " + msg + "을(를) 전송합니다.");
	}


	// 기프티콘 보내기
	public void gift() {
		System.out.println(name + "님이 선물을 보냅니다.");
	}

}
