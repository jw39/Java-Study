package 객체배열;

public class Student {
	
	// 1. 속성, 데이터, 필드
	private String name;
	private int ban;
	private int num;
	
	
	
	//2. method (행동, 기능, 로직)
	
	// 생성자
	public Student(String name, int ban, int num) {
		super();
		this.name = name;
		this.ban = ban;
		this.num = num;
	}
	
	// getter 메소드는 값을 가져오는 메소드, private으로 속성을 막아놓아서 메인에서 함부로 이름을 못 만들어...
	// 긍께 getname 써서,, 이름 출력하고,,, 하는 거지,,,
	public String getName() {
		return name;
	}
	// settet 메소드는 값을 수정하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

	

}
