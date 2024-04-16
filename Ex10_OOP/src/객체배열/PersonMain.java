package 객체배열;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("강예진", 21);
		Person p2 = new Person("최지원", 24);

		// Person 타입의 객체 2개를 저장할 수 있는 배열을 생성
		Person[] arrPerson = new Person[2];

		arrPerson[0] = p1;
		arrPerson[1] = p2;

		System.out.println(arrPerson[0].getName());
		System.out.println(arrPerson[0].getAge());
		// 인덱스 번호만 지정하면 값을 가져올 수 없고 참조값만 나옴.
		// 인덱스 번호 -> p1 참조값, .getName 해야 그 값이 나옴

		// 0번과 1번에 저장되어 있는 Person 의 이름과 나이를 출력
		// 반복문 사용해 작성
		for (int i = 0; i < arrPerson.length; i++) {
			System.out.println(arrPerson[i].getName() + "의 나이는 " + arrPerson[i].getAge() + "입니다");
		}

	}

}
