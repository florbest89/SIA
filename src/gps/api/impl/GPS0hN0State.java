package gps.api.impl;

import gps.api.GPSState;

public class GPS0hN0State implements GPSState {
	
	private GPS0hN0Cell[][] board;
	
	
	public GPS0hN0State(GPS0hN0Cell[][] board) {
		this.board = board;
	}
	
	public boolean addTile (Color color, int x, int y) {
		GPS0hN0Cell cell = board[x][y];
		if (cell == null || cell.getValue() == 0){
			board[x][y] = new GPS0hN0Cell(color);
			return true;
		}
		return false;
	}
	
	public GPS0hN0Cell[][] getBoard() {
		return board;
	}

	@Override
	public boolean compare(GPSState state) {
		// TODO Maldita Juli no quiere hacerlo.
		return false;
	}

}
