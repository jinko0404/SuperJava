package org.Super.day11.music.controller;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

import org.Super.day11.music.model.vo.DescSinger;
import org.Super.day11.music.model.vo.DescTitle;
import org.Super.day11.music.model.vo.Music;

public class MusicController {
	List<Music> musicList = new ArrayList<Music>();//리스트 선언
	
	//리스트 마지막 인덱스에 추가
	public void lastAddMusic(Music music) {
		musicList.add(music);
	}
	//리스트 첫번째 인덱스에 추가
	public void firstAddMusic(Music music) {
		musicList.add(0, music);
	}
	
	//전체 조회 메소드
	public List<Music> findAllMusic(){
		return musicList;
	}
	
	//검색 메소드
	public Music findOneMusic(String musicTitle){
		for(Music music : musicList) {
			if(music.getTitle().equals(musicTitle)) {
				return music;
			}
		}
		return null;
	}

	//삭제 메소드
	public void deleteMusic(Music music) {
		musicList.remove(music);
	}
	
	//수정 메소드
	public void updateMusic(Music music, String newTitle, String newSinger) {
		music.setTitle(newTitle);
		music.setSinger(newSinger);
	}
	
	//정렬 메소드
	//제목 오름차순
//	public void titleAsc() {
//		Collections.sort(musicList, Comparator.comparing(Music::getTitle));
//	}
	public void titleAsc() {
		for(int i = 0; i < musicList.size(); i++) {
			for(int j = 0; j < i; j++) {
				Music mOne = musicList.get(i);
				Music mTwo = musicList.get(j);
				if(mOne.compareTo(mTwo) < 1) {
					Music temp = mOne;
					musicList.set(i, mTwo);
					musicList.set(j, temp);
				}
			}
		}
	}
	//제목 내림차순
	public void titleDesc() {
		//mList만 전달하면 오름차순이지만
		//내림차순에 경우에는 추가 클래스가 필요하다
		Collections.sort(musicList, new DescTitle());
	}
//	public void titleDesc() {
//		for(int i = 0; i < musicList.size(); i++) {
//			for(int j = 0; j < i; j++) {
//				Music mOne = musicList.get(i);
//				Music mTwo = musicList.get(j);
//				if(mOne.compareTo(mTwo) > 1) {
//					Music temp = mOne;
//					musicList.set(i, mTwo);
//					musicList.set(j, temp);
//				}
//			}
//		}
//	}
	//가수명 오름차순
//	public void singerAsc() {
//		Collections.sort(musicList, Comparator.comparing(Music::getSinger));
//	}
	public void singerAsc() {
		for(int i = 0; i < musicList.size(); i++) {
			for(int j = 0; j < i; j++) {
				Music mOne = musicList.get(i);
				Music mTwo = musicList.get(j);
				if(mOne.compareToSinger(mTwo) < 1) {
					Music temp = mOne;
					musicList.set(i, mTwo);
					musicList.set(j, temp);
				}
			}
		}
	}
	//가수명 내림차순
//	public void singerDesc() {
//		Collections.sort(musicList, Comparator.comparing(Music::getSinger).reversed());
//	}
//	public void singerDesc() {
//		for(int i = 0; i < musicList.size(); i++) {
//			for(int j = 0; j < i; j++) {
//				Music mOne = musicList.get(i);
//				Music mTwo = musicList.get(j);
//				if(mOne.compareToSinger(mTwo) > 1) {
//					Music temp = mOne;
//					musicList.set(i, mTwo);
//					musicList.set(j, temp);
//				}
//			}
//		}
//	}
	public void singerDesc() {
		Collections.sort(musicList, new DescSinger());
	}

}
