package org.Super.day05;

public class Book {
	public String title;
	public String author;
	
	public Book() {
		title = "";
		author = "";
	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
