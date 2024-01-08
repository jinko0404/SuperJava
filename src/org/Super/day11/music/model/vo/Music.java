package org.Super.day11.music.model.vo;

public class Music implements Comparable<Music>{
	//Comparable이라는 메서드를 통해서 
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	//getter, setter 매서드
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getSinger() {
		return this.singer;
	}
	
	@Override
	public String toString() {
		return "Music [제목 =" + title + ", 가수명=" + singer + "]";
	}
	
	@Override
	public int hashCode() {
		return (this.singer + this.title).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music music = (Music)obj;
			return this.hashCode() == music.hashCode();
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.getTitle());
	}
	public int compareToSinger(Music o) {
		return this.singer.compareTo(o.getSinger());
	}
}
