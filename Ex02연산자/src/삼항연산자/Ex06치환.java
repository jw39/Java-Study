package 삼항연산자;

public class Ex06치환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0321 temp 예제
		
		//두 손에 들고 있는 공 옮기기
		
		String left = "red";
		String right = "blue";
		
		System.out.print("왼손 : " + left + "\t");
		System.out.println("오른손 : " + right);
		
		
		String temp = ""; 	//비어있는 공간 생성
		
							// left right temp
		temp = right; 		// red  blue  blue
		right = left; 		// red  red   blue
		left = temp; 		// blue red   blue
		
		System.out.print("왼손 : " + left + "\t");
		System.out.println("오른손 : " + right);

		
	}

}
