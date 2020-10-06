package com.starwars.webapp;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties( ignoreUnknown = true )
public class ParametersType {
	
    @XmlElement( required = true )
    @JsonProperty( "name" )
    protected String name;

    @XmlElement( required = true )
    @JsonProperty( "distance" )
    protected int distance;
    
    @XmlElement( required = true )
    @JsonProperty( "message" )
    protected ArrayList<String> message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public ArrayList<String> getMessage() {
		return message;
	}

	public void setMessage(ArrayList<String> message) {
		this.message = message;
	}


}
