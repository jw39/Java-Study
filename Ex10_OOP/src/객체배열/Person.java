package 객체배열;

public class Person {
	
	// 1. field(Data, 속성)
	private String name;
	private int age;
	
	
	// 2. Method (logic, 행위, 기능)
	
	// 생성자
	public Person(String name, int age) {
		//super(); : 상속
		this.name = name;
		this.age = age;
	}
	
	
	// 출력 메서드
	public void talk() {
		// ~~(name)가 말한다 출력
		System.out.println(this.name);
	}

	// 이름이랑 나이 출력할 getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	

}
