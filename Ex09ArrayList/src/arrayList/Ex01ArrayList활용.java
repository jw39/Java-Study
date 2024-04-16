package arrayList;

import java.util.ArrayList;

public class Ex01ArrayList활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ArrayList 생성
		// <데이터 타입>(ArrayList의 기본 크기 지정 가능, 생략하게 되면 기본 크기 10으로 지정);
		// 	 	 <데이터 타입 -> 필수>
		ArrayList<String> al = new ArrayList<String>();
		
		// 2. 데이터 삽입(맨 뒤에 추가)
		al.add("Hello");		//0번 인덱스
		al.add("Java");			//1번 인덱스
		al.add("DataBase");		//2번 인덱스

		// 3. 데이터의 개수 확인 (배열의 길이라는 말은 잘 하지 않음)
		int size = al.size();
		System.out.println("데이터 개수 : " + size);
		
		// 4. 데이터 삽입 (중간에 (특정 인덱스에) 추가)
		al.add(2, "Python");	// 
		System.out.println("데이터 개수 : " + al.size()); //원래 2번 데이터는 뒤로 밀려가고 파이썬이 2번 인덱스 됨
		// size (4번) 보다 큰 위치에는 추가 불가능
		// al.add(5, "JavaScript");	// 4번이 없는데 5번에 넣는다고 해서 오류 발생. 빈 인덱스가 있으면 안됨
		
		
		// 5. 특정 위치(인덱스) 의 데이터 가져오기, 그 위치에 있는 값을 문자열 형태로 가져옴
		// al.get(1); 	//출력이 아니라 그냥 리턴하는 거라 변수에 담거나 출력문 안에 써야 함.
		System.out.println(al.get(0));
		String data1 = al.get(1);	// data1이라는 변수에 담은 형태
		System.out.println(data1);  // data1 변수 출력
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		// System.out.println(al.get(4)); // 범위 벗어나서 오류
		
		
		System.out.println();
		
		// 5-1. for 문 사용해 출력
		for(int i = 0; i < al.size(); i++) {		// 배열 길이처럼,, ArrayList size 이용해서 제어!!!
			System.out.println(al.get(i));
		}
		
		// 5-2. for each 문 : 배열, arrayList(순서가 있는 자료구조) 다룰 때 사용
		// 0번 인덱스의 데이터부터 차례대로 꺼내주는 형태
		for(String s:al) {		//(자료형, 변수명 :배열 레퍼런스 변수 이름)
			System.out.println(s);
		}
		
		// 5-3. 배열 for each 문 이용
		int[] arr = {1,2,3,4};
		for(int i:arr) {
			System.out.println(i);
		}
		
		// 6. 데이터 삭제 (특정 위치 데이터 삭제)
		al.remove(1);		// 1번 Java 삭제
		for(String s:al) {	// 출력문
			System.out.println(s);
		}
		
		// 7. 데이터 삭제 (전부 삭제)
		al.clear();
		System.out.println("삭제 후 데이터 개수: " + al.size());
		// 추가하면 왜 0번???????????? 맨 뒤니까 4번 아닌가??????
		
		
		
		
		
		
		
		
		
	}

}
