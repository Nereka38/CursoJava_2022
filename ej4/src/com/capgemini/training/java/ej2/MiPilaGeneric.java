package com.capgemini.training.java.ej2;

import java.util.ArrayList;
import java.util.Iterator;

public class MiPilaGeneric<T> {
	private ArrayList<T> list;
	 
	public MiPilaGeneric() {
		list = new ArrayList<T>();
	}
	
	public MiPilaGeneric (ArrayList<T> lista) {
		list = lista;
	}

	public void reverse() {
		ArrayList<T> reversedList = new ArrayList<T>();
		for (int i=list.size()-1; i>=0;i--) {
			reversedList.add(list.get(i));
		}
		list=reversedList;
	}
	
	public T peek() {
		return list.get(list.size()-1);
	}
	

	public void push(T string) {
		list.add(string);
	}
	

	public T pop() {
		T exit = list.get(list.size()-1);
		list.remove(list.size()-1);
		return exit;
	}
	

	public ArrayList<T> getList(){
		return list;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj != null &&
				obj instanceof MiPilaGeneric &&
				((MiPilaGeneric)obj).getList().equals(list);
	}

	@Override
	public int hashCode() {
		return super.hashCode()+list.hashCode();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<T> it = list.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
			sb.append("\t");
		}
		return sb.toString();
	}
	
}
