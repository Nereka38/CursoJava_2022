package ej6;

import java.util.ArrayList;

public class Inventario {
	
	public static ArrayList<ItemInventario> items = new ArrayList<ItemInventario>();

	public static void main(String[] args) {
		items.add(new Pc(00001, true, 12345));
		items.add(new Silla(3, 010101, false));
	}

}
