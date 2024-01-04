package org.Super.day09;

public class ObjectList {
	Object[] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	public void clear() {
		objects = new Object[3];
		size = 0;
	}

}
