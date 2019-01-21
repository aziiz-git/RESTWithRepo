package com.webservice.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path ("aliens")  // Means: Whenever I call "aliens", I want to call the following resource. (http://localhost:8585/demorest/webapi/aliens) 
public class AlienResource {
	
	AlienRepository myRepo = new AlienRepository();
	
	@GET 
	@Produces(MediaType.APPLICATION_XML)	// 500 Internal Error if this not provided. We have to mention what type of data we are expecting
	public List <Alien> getAlien() {
		System.out.println("getAlien() called!!");		
		
		return myRepo.getAliens();		
						
	}
}
