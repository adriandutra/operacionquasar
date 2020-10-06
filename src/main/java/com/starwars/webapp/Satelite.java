package com.starwars.webapp;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties( ignoreUnknown = true )
public class Satelite {
	
	@JsonProperty( "satelite" )
	@XmlElement( required = true )
	protected List<ParametersType> satelite;

	public List<ParametersType> getSatelite() {
		return satelite;
	}

	public void setSatelite(List<ParametersType> satelite) {
		this.satelite = satelite;
	}
	
}


