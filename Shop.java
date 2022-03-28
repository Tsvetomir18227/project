package project;

import java.util.*;

public class Shop {

	private String name;
	private ArrayList<Part> parts = new ArrayList<>();
	
	Shop(){
		
	}

	public Shop(String name) {
		super();
		this.name = name;
	}

	public void addPart(Part part) {
		parts.add(part);

	}

	@Override
	public String toString() {
		return "Shop : " + name + "\n" + parts.toString();
	}

}
