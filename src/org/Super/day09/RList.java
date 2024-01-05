package org.Super.day09;

public class RList<T> {
	Object[] objects;
	int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {
		objects[size] = input;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T)objects[index];
	}
	public int size() {
		return size;
	}
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
