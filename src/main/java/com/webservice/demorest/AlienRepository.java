package com.webservice.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	
	List <Alien> myAliens;
	
	public AlienRepository() {
		
		myAliens = new ArrayList<>();  // ArrayList useds
		
		System.out.println("getAlien() called the first time!!");
		Alien a1 = new Alien();
		a1.setName("Azeez");
		a1.setPoints(100);
		
		System.out.println("getAlien() called the second time!!");
		Alien a2 = new Alien();
		a2.setName("Ryan");
		a2.setPoints(80);
		
		myAliens.add(a1);
		myAliens.add(a2);		
	}
	
	public List <Alien> getAliens() {
		return myAliens;
	}
	
	public Alien getAliens(int id) {
		
		for (Alien a : myAliens) {
			if (a.getPoints()==id)
				return a;
		}
		return new Alien();
	}
	
}
