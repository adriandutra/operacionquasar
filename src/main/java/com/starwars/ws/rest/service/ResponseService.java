package com.starwars.ws.rest.service;

public class ResponseService {
	
	private Position position;
	private String message;
	
	public ResponseService(Position position, String message) {
		setPosition(position);
		setMessage(message);
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
     
	
}

/**
 * @author adrian
 *
 */
class Position {
    private double x;
    private double y;
    
    public Position (double x, double y)
    {
    	setX(x);
    	setY(y);
    }
    
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
    
}
