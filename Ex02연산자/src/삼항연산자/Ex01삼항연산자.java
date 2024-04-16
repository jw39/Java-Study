package 삼항연산자;

public class Ex01삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0321 삼항연산자
		
		//변수 i와 j가 가지고 있는 값이 
		// 같으면 => "같다" 출력
		// 다르면 => "다르다" 출력
		
		int i = 3;
		int j = 10;
		
		String result = (i == j)?"같다":"다르다";
		System.out.println(result);
		
		System.out.println((i == j)?"같다":"다르다");
				

	}

}
