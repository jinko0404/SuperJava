package org.Super.day11.music.view;

import java.util.List;
import java.util.Scanner;

import org.Super.day11.music.controller.MusicController;
import org.Super.day11.music.model.vo.Music;

public class MusicView {
	MusicController musicController;
	public MusicView(){
		musicController = new MusicController();
	}
	public void launchApp() {
		int choice;
		end:
		while(true) {
			choice = printMainMenu();
			switch(choice) {
			case 0 :
				System.out.println("시스템을 종료합니다.");
				break end;
			case 1 :
				lastInputMusic();
				break;
			case 2 :
				firstInputMusic();
				break;
			case 3 :
				printAllMusics();
				break;
			case 4 :
				printOneMusic();
				break;
			case 5 :
				removeMusic();
				break;
			case 6 :
				modifyMusic();
				break;
			case 7 :
				//곡명으로 오름차순 정렬
				System.out.println("=== === 곡명 오름차순 정렬 === ===");
				titleAscSort();
				break;
			case 8 :
				//곡명으로 내림차순 정렬
				System.out.println("=== === 곡명 내림차순 정렬 === ===");
				titleDescSort();
				break;
			case 9 :
				//가수명으로 오름차순 정렬
				System.out.println("=== === 가수명 오름차순 정렬 === ===");
				singerAscSort();
				break;
			case 10 :
				//가수명으로 내림차순 정렬
				System.out.println("=== === 가수명 내림차순 정렬 === ===");
				singerDescSort();
				break;
			default :
				System.out.println("0 ~ 10 까지의 수를 입력해주세요.");
				break;
			}
		}
	}
	public int printMainMenu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >>");
		choice = sc.nextInt();
		return choice;
	}
	
	public void lastInputMusic() {
		Music m = new Music();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 마지막 위치에 곡 추가 === ===");
		System.out.print("곡의 제목을 적어주세요 : ");
		m.setTitle(sc.nextLine());
		System.out.print("곡의 가수 이름을 적어주세요 : ");
		m.setSinger(sc.nextLine());
		try {
			System.out.println("정보를 저장 중 입니다.");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		musicController.lastAddMusic(m);
		System.out.println("추가를 완료 했습니다.");
	}
	
	public void firstInputMusic() {
		Music m = new Music();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 첫 위치에 곡 추가 === ===");
		System.out.print("곡의 제목을 적어주세요 : ");
		m.setTitle(sc.nextLine());
		System.out.print("곡의 가수 이름을 적어주세요 : ");
		m.setSinger(sc.nextLine());
		try {
			System.out.println("정보를 저장 중 입니다.");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		musicController.firstAddMusic(m);
		System.out.println("추가를 완료 했습니다.");
	}
	public void printAllMusics() {
		System.out.println("=== === 전체 곡 리스트 출력 === ===");
		List<Music> mList = musicController.findAllMusic();
		for(int i = 0; i < mList.size(); i++) {
			System.out.println("곡제목 : " + mList.get(i).getTitle() + ", 가수이름 : " + mList.get(i).getSinger());
		}
	}
	public void printOneMusic() {
		System.out.println("=== === 특정 곡 검색하기 === ===");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String findTitle;
		System.out.print("검색할 곡 제목을 입력해주세요 : ");
		findTitle = sc.nextLine();
		Music m = musicController.findOneMusic(findTitle);
		if(m != null) {
			System.out.println("곡제목 : " + m.getTitle() + ", 가수이름 : " + m.getSinger());
		}
		else {
			System.out.println("곡을 찾을 수 없습니다.");
		}
	}
	
	public void removeMusic() {
		System.out.println("=== === 특정 곡 삭제하기 === ===");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String findTitle;
		System.out.print("삭제할 곡 제목을 입력해주세요 : ");
		findTitle = sc.nextLine();
		Music m = musicController.findOneMusic(findTitle);
		if(m != null) {
			try {
				musicController.deleteMusic(m);
				System.out.println("곡을 삭제 중 입니다...");
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println("삭제 완료 했습니다.");
		}
		else {
			System.out.println("곡을 찾을 수 없습니다.");
		}
	}
	
	public void modifyMusic() {
		System.out.println("=== === 특정 곡 정보수정 === ===");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String findTitle;
		String newTitle;
		String newSinger;
		System.out.print("수정할 곡의 제목을 입력해주세요 : ");
		findTitle = sc.nextLine();
		System.out.print("새로운 곡명을 입력해주세요 : ");
		newTitle = sc.nextLine();
		System.out.print("새로운 가수명을 입력해주세요 : ");
		newSinger = sc.nextLine();
		Music m = musicController.findOneMusic(findTitle);
		if(m != null) {
			try {
				musicController.updateMusic(m, newTitle, newSinger);
				System.out.println("곡 정보를 수정 중 입니다...");
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println("수정 완료 했습니다.");
		}
		else {
			System.out.println("곡을 찾을 수 없습니다.");
		}
	}
	public void titleAscSort() {
		try {
			System.out.println("곡을 정렬중입니다.");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		musicController.titleAsc();
		System.out.println("정렬 완료 !");
	}
	public void titleDescSort() {
		try {
			System.out.println("곡을 정렬중입니다.");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		musicController.titleDesc();
		System.out.println("정렬 완료 !");
	}
	public void singerAscSort() {
		try {
			System.out.println("곡을 정렬중입니다.");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		musicController.singerAsc();
		System.out.println("정렬 완료 !");
	}
	public void singerDescSort() {
		try {
			System.out.println("곡을 정렬중입니다.");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		musicController.singerDesc();
		System.out.println("정렬 완료 !");
	}
}









