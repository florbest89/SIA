package gps.api.impl;

import java.util.LinkedList;
import java.util.List;

import gps.api.GPSProblem;
import gps.api.GPSRule;
import gps.api.GPSState;

public class GPS0hN0Problem implements GPSProblem {

	@Override
	public GPSState getInitState() {
		
		GPS0hN0Cell[][] init_board = new GPS0hN0Cell[7][7];
		
		init_board[0][1] = new GPS0hN0Cell(3,Color.blue,true);
		init_board[0][6] = new GPS0hN0Cell(4,Color.blue,true);
		init_board[1][0] = new GPS0hN0Cell(5,Color.blue,true);
		init_board[1][2] = new GPS0hN0Cell(6, Color.blue, true);
		
		
		return null;
	}


	@Override
	public List<GPSRule> getRules() {
		
		List<GPSRule> rules = new LinkedList<GPSRule>(); 
		int i,j;
		for (i = 0; i<7; i++){
			for (j = 0; j < 7; j++){
				rules.add( ((GPSRule) new GPS0hN0Rule(i,j,Color.red)));
			}
		}
		
		return rules;
	}

	@Override
	public Integer getHValue(GPSState state) {
		// TODO Max: "Creo que esto lo podriamos dejar... o lo queres hacer?"
		return 23;
	}


	@Override
	public boolean isGoal(GPSState state) {
		// TODO Auto-generated method stub
		return false;
	}

}
