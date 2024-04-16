package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02MusicPlayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> musiclist = new ArrayList<String>();

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				if (musiclist.size() == 0) {
					System.out.println("===========현재 재생 목록===========");
					System.out.println("재생 목록이 없습니다.");
				} else {
					System.out.println("===========현재 재생 목록===========");
					playlist(musiclist);
				}
				System.out.println("================================");
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int add = sc.nextInt();
				if (add == 2) {
					System.out.print("추가할 노래 입력: ");
					String song2 = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					int songSu = sc.nextInt();
					musiclist.add(songSu - 1, song2);
					System.out.println("추가가 완료되었습니다.");
					System.out.println();
					//System.out.println("================================");
				} else if (add == 1) {
					System.out.print("추가할 노래 입력: ");
					String song1 = sc.next();
					musiclist.add(song1);
					System.out.println("추가가 완료되었습니다.");
					System.out.println();
					//System.out.println("================================");
				}
			}

			if (input == 2) {
				if (musiclist.size() == 0) {
					System.out.println("================================");
					System.out.println("재생 목록이 없습니다.");
					System.out.println("================================");
				} else if (musiclist.size() > 0) {
					System.out.println("===========현재 재생 목록===========");
					playlist(musiclist);
					System.out.println("================================");
					System.out.print("[1]선택삭제 [2]전체삭제 >> ");
					int del = sc.nextInt();
					if (del == 1) {
						System.out.print("삭제할 노래 선택 >> ");
						int delSong = sc.nextInt();
						musiclist.remove(delSong - 1);
						System.out.println("노래가 삭제되었습니다.");
					} else if (del == 2) {
						musiclist.clear();
						System.out.println("전체 List가 삭제되었습니다.");
						System.out.println("================================");
					}
				}
			}

			if (input == 3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			sc.close();
		}
		
		
		

	}
	
	// main 아래 메소드 공간
	private static void playlist(ArrayList<String> musiclist) {
		for (int i = 0; i < musiclist.size(); i++) {
			System.out.println((i + 1) + "." + musiclist.get(i));
		}
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
