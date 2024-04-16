package 객체배열;

public class StuScore {
	
	// field
	private String name;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	// 생성자
	public StuScore(String name, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	
	

}
