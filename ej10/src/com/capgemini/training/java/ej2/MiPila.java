package com.capgemini.training.java.ej2;

import java.util.ArrayList;

public class MiPila {
	
	private ArrayList<String> list;
	
	public MiPila() {
		list = new ArrayList<String>();
		list.add("Hola");
		list.add("Adios");
		list.add("Buenas");
	}

	public String pop() {
		String exit = list.get(list.size()-1);
		list.remove(list.size()-1);
		return exit;
	}
	
	public void push(String string) {
		list.add(string);
	}
	
	public String peek() {
		return list.get(list.size()-1);
		
	}
	
	public void reverse() {
		ArrayList<String> reversedList = new ArrayList<String>();
		
		for (int i=list.size()-1;i>=0;i--) {
			reversedList.add(list.get(i));
		}
		
		list=reversedList;
	}

}
