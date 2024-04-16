package jdbc기초;

import java.util.ArrayList;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	
	ArrayList<Member> m = new ArrayList<Member>();
	

}
