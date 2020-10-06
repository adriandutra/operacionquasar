package com.starwars.ws.rest.service;

import com.starwars.ws.rest.message.Message;
import com.starwars.ws.rest.trilateration.*;
import com.google.gson.Gson;
import com.starwars.webapp.ParametersType;
import com.starwars.webapp.Satelite;

import java.util.ArrayList;

import javax.ws.rs.Consumes; 
import javax.ws.rs.POST;
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType; 
import javax.ws.rs.core.Response;



@Path("/topsecret") 
public class ServiceLocation {
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response submitProject(Satelite s)  {
        
    	String nombrep1 = null;
    	String nombrep2 = null;
    	String nombrep3 = null;
        double distanciap1 = 0;
    	double distanciap2 = 0;
    	double distanciap3 = 0;
    	ArrayList<String> message1 = null;
    	ArrayList<String> message2 = null;
    	ArrayList<String> message3 = null;
    	Gson g = new Gson();
    	String MensajeSalida = null;
    	try {
    	int i = 0;
    	for(ParametersType str: s.getSatelite())
    	{
    	   switch (i) {
    	   
    	    case 0:
    	    		nombrep1    = str.getName();
    	    		distanciap1 = str.getDistance();
    	    		message1    = str.getMessage();
    	    		break;
    	    case 1:
    	    		nombrep2    = str.getName();
    	    		distanciap2 = str.getDistance();
    	    		message2    = str.getMessage();
    	    		break;
    	    case 2:
    	    		nombrep3    = str.getName();
    	    		distanciap3 = str.getDistance();
    	    		message3    = str.getMessage();
    	    		break; 
    	   }
      	   i++;
    	}
    	
		Point p1= new Point(nombrep1, -500, -200);
		Point p2= new Point(nombrep2, 100, -100);
		Point p3= new Point(nombrep3, 500, 100);
    		
		Point a = Trilateration.getLocation(p1, distanciap1, p2, distanciap2,  p3, distanciap3);
		
		Position posicion = new Position(a.getLatitud(), a.getLongitud());
	
		MensajeSalida = Message.getMessage(message1, message2, message3);
			
		ResponseService retorno = new ResponseService(posicion, MensajeSalida);
		
		String salida = g.toJson(retorno); 
		
		return Response.status(Response.Status.OK).entity(salida).build();
    	}
    	catch (Exception e) {
    		return Response.status(Response.Status.NOT_FOUND).build();
    	}
		
    }
    

}
