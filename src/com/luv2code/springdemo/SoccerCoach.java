package com.luv2code.springdemo;

public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Scored two goals today!";
	}

}