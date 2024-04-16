package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 게임을 실행 할 공간
		
		// 게임 칩 가져오기
		DongGame d = new DongGame();
		// 게임칩 끼워서 실행하기
		insert(d);
		
		PoketmonGame p = new PoketmonGame();
		insert(p);
		
		MarioGame m = new MarioGame();
		insert(m);

		// 에러 해결해보기~
	
		
	}
	
	// 동물의 숲 게임칩을 넣으면 실행시키는 기능
	private static void insert(GameChip game) {
		// 모든 게임칩들 (PoketmonGam, MarioGame, DongGame) 들은 GameChip을 상속 받아
		// GameChip 자료형으로 자동 형 변환이 가능해졌다!
		// GameChip game = new DongGame();
		// GameChip game = new PoketmonGame();
		// GameChip game = new MarioGame();
		// 게임칩 형태의 게임을 만들 건데 동게임의 자료로 만들 거야..
		// 그럼 게임에는 게임칩에 있는 run이 있어야지 근데 오버라이딩 된 동게임의 런도 있네
		// 그럼 게임에는 동게임의 런을 실행시킬거야 
		game.run();
	}
	
//	// 메소드 오버로딩 기법으로 해결하는 방법
//	private static void insert(PoketmonGame game) {
//		game.run();
//	}
//	
//	private static void insert(MarioGame game) {
//		game.run();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
