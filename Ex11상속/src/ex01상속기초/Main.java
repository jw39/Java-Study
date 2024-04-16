package ex01상속기초;

public class Main {

	public static void main(String[] args) {
		
		// 객체를 생성할 때 
		// -> 자료형(메소드 클래스 이름) 변수명 = new 자료형();
		
		// 1. Parent 자료형 p 객체 생성
		Parent p = new Parent();
		
		// 2. Child 자료형 c 객체 생성
		Child c = new Child();
		
		p.makeEgg();
		
		
		// 상속을 사용했기 때문에 부모 클래스가 가지고 있는 메소드를 
		// 재사용 하는 것이 가능하다!!
		c.makeEgg();
		// 메소드 오버라이딩을 하게 되면, 오버라이딩한 메소드 호출
		c.makeBap();
		// 자식 클래스에만 선언된 메소드는 부모 객체는 사용할 수 없다!
		
		// 상속의 특징
		// 1. 다중 상속이 불가능하다.
		// 2. 상속의 횟수에 제한이 없다.
		// 3. 모든 클래스는 Object (최상위 클래스)를 상속 받는다!
		
		// 객체의 Casting (형 변환)
		// Reference Type 의 형 변환은 반드시 상속이 전제되어 있어야 한다.!
		// --> 객체 내 필드, 메소드의 접근 권한으로 기준을 강제 vs 자동 결정
		
		// 1) Up Casting (업 캐스팅)
		// : 자식(서브, 하위) 클래스가 부모(슈퍼, 상위) 클래스 타입으로 자동 형 변환 되는 것
		
		Parent p2 = new Child();
		p2.makeEgg();
		// 객체 내 모든 필드와 메소드에 접근할 수 있는게 아니라 
		// 상위 클래스의 필드와 메소드에만 접근 가능하다!
		// 오버라이딩된 메소드에 한해서는 하위 클래스에 있는 메소드를 사용한다.
		
		
		// 2) DownCasting (다운 캐스팅)
		// : 부모 클래스가 자식 클래스로 강제 형 변환
		// Child c2 = (Child)new Parent(); --> 불가능한 코드! child 에 메소드 세 개인데 parent 에는 두 개 뿐...
		// parent 설계만 가지고는 child 객체를 만들 수 없다!
		// : 업캐스팅 된 객체를 다시 본래의 자료형으로 되돌릴 때 사용
		Child c2 = (Child) p2;
		c2.makeBap();
		c2.makekimchi();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
