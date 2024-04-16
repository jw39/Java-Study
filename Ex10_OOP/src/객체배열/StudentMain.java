package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 배열 사용법
		// Student 객체 2개 저장할 수 있는 배열
		Student[] stuArr = new Student[2];

		// * 생성자를 호출해서 객체를 생성하게 되면 해당 객체의 참조값(주소값)을 반환
		// Student s1 = new Student("최지원", 1, 1);
		// stuArr[0] = s1;
		stuArr[0] = new Student("최지원", 1, 1);
		stuArr[1] = new Student("오선생", 2, 3);
		// 주소값을 s1으로 지정하고 그걸 0번에 넣을래~ 가 아닌 내 정보 주소값 바로 0번에 넣을래~ 랑 같음

		System.out.println("for 문 사용");
		for (int i = 0; i < stuArr.length; i++) {
			// Student s = stuArr[i]; // student 하나에 대한 레퍼런스 값을 가진다
			// System.out.println(s.getName() + ", " + s.getBan() + "반, " + s.getNum() +
			// "번");
			System.out.println(stuArr[i].getName() + ", " + stuArr[i].getBan() + "반, " + stuArr[i].getNum() + "번");
		}

		// for each : 배열/arrayList의 0번부터 끝 객체까지 차근차근 꺼내고 싶을 때 사용
		// (임시 변수를 선언 : 배열의 이름)
		System.out.println("for each문 사용");
		for (Student s : stuArr) {
			System.out.println(s.getName() + ", " + s.getBan() + "반, " + s.getNum() + "번");

		}

		// 입력한 값으로 초기화 시킨 객체를 저장할 arrayList 활용
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> al = new ArrayList<Student>();

//		// 0번 인덱스에 student[0] 참조값 넣기
//		System.out.println("이름 >> ");
//		String name = sc.next();
//		System.out.println("반 >> ");
//		int ban = sc.nextInt();
//		System.out.println("번호 >> ");
//		int num = sc.nextInt();
//
//		// 입력받은 값으로 객체 생성
//		Student s = new Student(name, ban, num);
//		// al 이라는 arrayList에 레퍼런스 값(s)를 넣어주기
//		al.add(s);

		// 위에 문장 for 문으로 묶기
		for (int i = 0; i < 2; i++) {
			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.print("반 >> ");
			int ban = sc.nextInt();
			System.out.print("번호 >> ");
			int num = sc.nextInt();

			Student s = new Student(name, ban, num);
			al.add(s);
		}

		// =어레이 리스트는 al[0]이 아니라 al.get() 사용!! 까먹지 마삼;;
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).getName());
			System.out.println(al.get(i).getBan());
			System.out.println(al.get(i).getNum());
			
		}
		
		
		sc.close();
		
		
		
		
		
		
		
	}

}
