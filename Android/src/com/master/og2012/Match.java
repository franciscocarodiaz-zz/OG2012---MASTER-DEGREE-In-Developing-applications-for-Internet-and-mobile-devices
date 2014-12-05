package com.master.og2012;

public class Match {
	
	/*Atributos de clase*/
	String team1;
	String team2;
	String stadium;
	
	
	//Constructor
	public Match(String team1, String team2, String stadium) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.stadium = stadium;
	}
	
	
	
	//Getters y setters

	public String getTeam1() {
		return team1;
	}


	public void setTeam1(String team1) {
		this.team1 = team1;
	}


	public String getTeam2() {
		return team2;
	}


	public void setTeam2(String team2) {
		this.team2 = team2;
	}


	public String getStadium() {
		return stadium;
	}


	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

}
