package com.capgemini.training.java.ej2;

import java.util.ArrayList;
import java.util.Iterator;

public class MiPilaGeneric {
	private ArrayList<String> list;
	 
	public MiPilaGeneric() {
		list = new ArrayList<String>();
	}
	
	public MiPilaGeneric (ArrayList<String> lista) {
		list = lista;
	}

	public void reverse() {
		ArrayList<String> reversedList = new ArrayList<String>();
		for (int i=list.size()-1; i>=0;i--) {
			reversedList.add(list.get(i));
		}
		list=reversedList;
	}
	
	public String peek() {
		return list.get(list.size()-1);
	}
	

	public void push(String string) {
		list.add(string);
	}
	

	public String pop() {
		String exit = list.get(list.size()-1);
		list.remove(list.size()-1);
		return exit;
	}
	

	public ArrayList<String> getList(){
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
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
			sb.append("\t");
		}
		return sb.toString();
	}
	
}
