package com.webservice.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  	// 500 Internal Error if this not provided. Need to specify that we are expecting an XML (Or whatever) file
public class Alien {  // Simple POJO Class. Class name will be the Root element of XML.
	
	private String name;
	private int points;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}	
}
