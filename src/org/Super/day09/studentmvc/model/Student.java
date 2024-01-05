package org.Super.day09.studentmvc.model;

public class Student {
	// 필드(멤버변수)
	private String name;
	private int firstScore;
	private int secondScore;
	
	// 생성자
	public Student() {}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	// getter/setter 메소드
	// name의 getter/setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// firstScore의 getter/setter
	public int getFirstScore() {
		return this.firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	// secondScore의 getter/setter
	public int getSecondScore() {
		return this.secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
}
