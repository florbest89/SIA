package gps.api.impl;

import gps.api.GPSRule;
import gps.api.GPSState;
import gps.exception.NotAppliableException;

public class GPS0hN0Rule implements GPSRule {

	private int x;
	private int y;
	private Color color;
	
	public GPS0hN0Rule (int x, int y, Color color)
	{
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	@Override
	public Integer getCost() {
		// TODO Florcha, haceme.
		return 0;
	}

	@Override
	public String getName() {
		return "Se coloca " + this.color.name() + " en posicion (" + this.x + ", " + this.y + ")"; 
	}

	@Override
	public GPSState evalRule(GPSState state) throws NotAppliableException {
		GPS0hN0Cell cell = ((GPS0hN0State) state).getBoard()[x][y];
		
		// TODO Ver mas validaciones?
		
		if (cell.getValue() == 0)
		{
			GPS0hN0State newState = new GPS0hN0State(((GPS0hN0State)state).getBoard());
			cell = newState.getBoard()[x][y];
			cell.setColor(color);
			return newState;
		}
		
		throw new NotAppliableException();
		
	}

}
