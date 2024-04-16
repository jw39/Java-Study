package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02MusicPlayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 발생 오류 종류
		// 컴파일 -> 실행
		// 1. 컴파일(작성한 코드를 컴퓨터 언어로 변경) 오류
		// 코드 상에서 오타, 타입 불일치 등
		
		// 2. 런타임(프로그램 실행) 오류
		// 코드 문법 자체에는 문제가 없음 / 실행을 하고 보니 오류가 발생
		// 콘솔에 출력되는 Exception 타입 확인 필요 => 어떤 오류가 발생하는지를 확인해야 함
		// => 해당 오류를 해결할 수 있는 예외처리 필수
		

		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

		while (true) {

			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) { // [1] 노래 추가
				// 재생목록 출력 메소드 작성
				printPlayList(musiclist);
				
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int input = sc.nextInt();
				if(input==1) { //[1]마지막 위치에 추가
					System.out.print("추가할 노래 입력: ");
					//String inputTitle = sc.next();
					musiclist.add(sc.next());
				}else {	//2
					System.out.print("추가할 노래 입력>> ");
					String inputTitle = sc.next();
					System.out.print("추가할 위치 입력>> ");
					int inputIndex = sc.nextInt();
					// 예외 처리: try~catch (o) / throws
					try{	// 내가 실행하고 싶은 코드 (오류가 발생할 수 있는 코드를 다 넣어주기)
						musiclist.add(inputIndex-1,inputTitle );
					}catch(IndexOutOfBoundsException e) {	// 소괄호 안에는 try 에서 발생할 수 있는 오류 코드 넣어줘야함
						// 발생한 오류를 어떻게 처리할 것인지 작성
						// 해당 오류가 발생했을 떄에만 실행
						System.out.println("지정할 수 없는 위치입니다.");
						continue;		// 반복문 안에서 작성하는 키워드
										// break; : 반복문을 종료하는 키워드, (반복문을 나가버리는 키워드)
										// continue : 현재 반복문 회차만 종료, continue 아래 쪽은 보지도 않음
					}
					
				}
				
				System.out.println("추가가 완료되었습니다.");
				
				
				
			} else if (menu == 2) { // [2]노래 삭제
				printPlayList(musiclist);
				// 곡이 없으면 삭제할 곡이 없습니다 출력 / 있으면 삭제 기능 진행
				if(musiclist.isEmpty()) {
					System.out.println("삭제할 곡이 없습니다");
				} else {
					System.out.print("[1]선택삭제 [2]전체삭제 >> ");
					int input = sc.nextInt();
					if(input == 1) {
						System.out.print("삭제할 노래 선택 >> ");
						
						int inputIndex = sc.nextInt();	// 입력 받은 숫자에 -1 해주기
						try{	
							musiclist.remove(inputIndex-1 );
							System.out.println("노래가 삭제되었습니다.");
						}catch(IndexOutOfBoundsException e) {	
							System.out.println("지정할 수 없는 위치입니다.");
							continue;		
						}
					} else {	// 2
						musiclist.clear();
						System.out.println("전체 list가 삭제되었습니다.");
					}
				}

			} else { // [3]종료
				System.out.println("프로그램 종료");
				break;
			}

		}
		sc.close();
		
		

	}
	// 재생목록 출력
	private static void printPlayList(ArrayList<String> musiclist) {
		// 1. 재생목록 출력
		System.out.println("===========현재 재생 목록===========");
		if (musiclist.isEmpty()) { // 비어있니를 물어보는 메소드
			System.out.println("재생 목록이 없습니다.");
		} else {	// 재생목록이 안 비어있니?
			int index = 1;	// 그럼 출력해 ㅋ
			for (String music : musiclist) {
				System.out.println(index + "." + music);
				index++;
			}
		}
		
		System.out.println("================================");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
